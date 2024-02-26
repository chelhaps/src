package chelapsAutomation.PetStore_Testcases;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import chelapsAutomation.Utility;

public class TC00003_updateUser {
	public static void main(String[] args) throws IOException {
		// Create Utility instance and implement method
		Utility utilityInstance = new Utility() {
			@Override
			public void utilityMethod(String[] args) {
			}

			@Override
			public String sendRequest(String baseUrl, String string, String body) {

				return null;
			}
		};

		// Call the utility method
		utilityInstance.utilityMethod(args);

		String entity = "user";
		String user = "cherry";
		String baseUrl = Utility.BASE_URL + entity + user;

		// Create a dynamic data map
		Map<String, Object> requestBody = new HashMap<>();
		requestBody.put("id", 101);
		requestBody.put("username", "DhelUser");
		requestBody.put("firstName", "Juan");
		requestBody.put("lastName", "Pedro");
		requestBody.put("email", "dhelemail@test123");
		requestBody.put("password", "P@ssword!01");
		requestBody.put("phone", "12345");
		requestBody.put("userStatus", 1);

		// ObjectMapper objectMapper = new ObjectMapper();
		// String jsonString = objectMapper.writeValueAsString(requestBody);
		// System.out.println("Request Body: " + jsonString);

		// String body = "{\"id\": 10, \"username\": \"chelaps\", \"firstName\":
		// \"che\", \"lastName\": \"laps\", \"email\": \"chelaps@test123.com\",
		// \"password\": \"this1$aTEST\", \"phone\": \"1252166\", \"userStatus\": 1}";
		String body = "{requestBody}";

		String response = utilityInstance.sendRequest(baseUrl, "PUT", body);

		System.out.println("Request Body: " + body);
		System.out.println("API request successful.");
		System.out.println("API Response: " + response);
	}
}
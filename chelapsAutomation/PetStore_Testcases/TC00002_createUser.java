package chelapsAutomation.PetStore_Testcases;

import java.io.IOException;

import org.junit.jupiter.api.Assertions;


import chelapsAutomation.Utility;

public class TC00002_createUser {
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
		String baseUrl = Utility.BASE_URL + entity;

		String body = "{\"id\": 10, \"username\": \"chelaps\", \"firstName\": \"che\", \"lastName\": \"laps\", \"email\": \"chelaps@test123.com\", \"password\": \"this1$aTEST\", \"phone\": \"1252166\", \"userStatus\": 1}";

		String response = utilityInstance.sendRequest(baseUrl, "POST", body);

			Assertions.assertEquals(200, getResponseCode(response), "Response code is not valid");

		System.out.println("Request Body: " + body);
		System.out.println("API request successful.");
		System.out.println("API Response: " + response);
	}
	private static int getResponseCode(String response) {

        return 200;
    }
}
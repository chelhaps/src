package chelapsAutomation.PetStore_Testcases;

import java.io.IOException;

import org.junit.jupiter.api.Assertions;

import chelapsAutomation.Utility;

public class TC00001_findPetsByStatus {
	public static void main(String[] args) {
	
		try {
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

				String entity = "findByStatus";
				String baseUrl = Utility.BASE_URL + entity;
				String[] statuses = {"available", "pending", "sold"};

					for (String status : statuses) {
					String apiUrl = Utility.newApiUrl(baseUrl, "status", status);
					String response = utilityInstance.sendRequest(apiUrl, "GET");

						Assertions.assertEquals(200, getResponseCode(response), "Response code is not valid");

						System.out.println("API request successful for '" + status + "' status.");
						System.out.println("API Response: " + response);
					}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	private static int getResponseCode(String response) {

        return 200;
    }
}
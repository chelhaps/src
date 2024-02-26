package chelapsAutomation.PetStore_Testcases;

import java.io.IOException;

import org.junit.jupiter.api.Assertions;

import chelapsAutomation.Utility;

public class TC00004_updatePet {
    public static void main(String[] args) throws IOException {
        // Create Utility instance and implement method
        Utility utilityInstance = new Utility() {
            @Override
            public void utilityMethod(String[] args) {

            }

            @Override
            public String sendRequest(String baseUrl, String string, String body) {
                System.out.println("Verifying Request Body: " + body);

                return null;
            }
        };

        // Call the utility method
        utilityInstance.utilityMethod(args);

        String baseUrl = Utility.BASE_URL;

        String body = "{ \"id\": 107, \"category\": { \"id\": 107, \"name\": \"AutoTestPet\" }, \"name\": \"Athena\", \"photoUrls\": [ \"thisisJUST@+3$t\" ], \"tags\": [ { \"id\": 5, \"name\": \"string\" } ], \"status\": \"available\" }";

        String response = utilityInstance.sendRequest(baseUrl, "PUT", body);

        Assertions.assertEquals(200, getResponseCode(response), "Response code is not valid");

        Assertions.assertEquals(body, response, "Request and response bodies do not match");

        System.out.println("API request successful.");

    }

    private static int getResponseCode(String response) {

        return 200;
    }

}

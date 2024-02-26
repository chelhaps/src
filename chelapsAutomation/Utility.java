package chelapsAutomation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public abstract class Utility {

	public abstract void utilityMethod(String[] args);

	public String sendRequest(String urlString, String method) throws IOException {
		@SuppressWarnings("deprecation")
		URL url = new URL(urlString);
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();

		// Set the request method dynamically
		connection.setRequestMethod(method);

		// Get the response code
		int responseCode = connection.getResponseCode();

		// Read the response
		StringBuilder response = new StringBuilder();
		try (BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()))) {
			String inputLine;
			while ((inputLine = in.readLine()) != null) {
				response.append(inputLine);
			}
		}
		// Close the connection
		connection.disconnect();

		if (responseCode == HttpURLConnection.HTTP_OK) {
			return response.toString();
		} else {
			throw new IOException("HTTP " + method + " request failed with response code: " + responseCode);
		}
	}

	public static final String BASE_URL = "https://petstore.swagger.io/v2/pet/";

	// Utility method to build a dynamic API URL with query parameters
	public static String newApiUrl(String baseUrl, String paramName, String paramValue) {
		return baseUrl + "?" + paramName + "=" + paramValue;
	}

	public abstract String sendRequest(String baseUrl, String string, String body);
}
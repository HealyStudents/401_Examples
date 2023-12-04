package web_server;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

public class PostRequestHandler implements HttpHandler
{   
	@Override
	public void handle(HttpExchange exchange) throws IOException
	{
		String method = exchange.getRequestMethod();
		OutputStream outputStream = exchange.getResponseBody();

		//The HomepageHandler can ONLY handle GET requests (no one should be posting data to this endpoint)
		if(method.equals("POST"))
		{
			System.out.println(LocalDate.now().toString() + "_" + LocalTime.now().toString() + ": POST /");

			//We can grab an InputStream tied to the data posted by the user
			InputStream requestStream = exchange.getRequestBody();
			//Use a scanner object to capture this input
			Scanner scan = new Scanner(requestStream);

			//After looping through the input, it will all be in one string
			String requestString = "";
			while(scan.hasNextLine())
			{
				requestString += scan.nextLine() + "\n";
			}

			//We don't do anything interesting with the data, we just send it back
			String responseString = "Received data: " + requestString;

			//We send back a response that has the header with response code 200 (a successful request)
			exchange.sendResponseHeaders(200, responseString.length());
			//We use the outputStream object to send the data to the user.
			outputStream.write(responseString.getBytes());

			//We always flush and close the stream when we're done with it!
			outputStream.flush();
			outputStream.close();
			System.out.println("\tResponse: " + responseString + " (200)");
		}
	}
}

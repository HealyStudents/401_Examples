package web_server;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;
import java.time.LocalDate;
import java.time.LocalTime;
import java.awt.Image;

import javax.imageio.ImageIO;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

public class HelloWorldHandler implements HttpHandler
{
	@Override
	public void handle(HttpExchange exchange) throws IOException
	{
		//The kind of request that the client sent to the server
		String method = exchange.getRequestMethod();
		//The stream that we will send data back to our client
		OutputStream outputStream = exchange.getResponseBody();

		//The HomepageHandler can ONLY handle GET requests (no one should be posting data to this endpoint)
		if(method.equals("GET"))
		{
			//Printing out to allow debugging on the server side
			System.out.println(LocalDate.now().toString() + "_" + LocalTime.now().toString() + ": GET /");
			
			//We want to send this string back to the client
			String responseString = "<html><body><h1>Hello world!</h1></body></html>";

			//We send back a response that has the header with response code 200 (a successful request)
			exchange.sendResponseHeaders(200, responseString.length());
			
			//We use the outputStream object to send the data to the user.
			outputStream.write(responseString.getBytes());

			//We always flush and close the stream when we're done with it!
			outputStream.flush();
			outputStream.close();
			
			//Debug print out for the server side
			System.out.println("\tResponse: " + responseString + " (200)");
		}
	}

}

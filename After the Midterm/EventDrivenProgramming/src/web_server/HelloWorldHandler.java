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
		String method = exchange.getRequestMethod();
		OutputStream outputStream = exchange.getResponseBody();

		//The HomepageHandler can ONLY handle GET requests (no one should be posting data to this endpoint)
		if(method.equals("GET"))
		{
			System.out.println(LocalDate.now().toString() + "_" + LocalTime.now().toString() + ": GET /");
			String responseString = "<html><body><h1>Hello world!</h1></body></html>";

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

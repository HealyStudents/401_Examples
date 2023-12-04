package web_server;

import java.io.IOException;
import java.net.InetSocketAddress;

import com.sun.net.httpserver.*;

public class HelloWorld
{
	public static void main(String[] args) throws IOException
	{
		//Creating a server object that listens for requests at url "localhost" and port 8001
		HttpServer server = HttpServer.create(new InetSocketAddress("localhost", 8001), 0);
		//Listening at the plain url, using a HelloWorldHandler
		server.createContext("/", new HelloWorldHandler());
		//Start the server
		server.start();
		System.out.println("Server running at http://localhost:8001");
	}
}

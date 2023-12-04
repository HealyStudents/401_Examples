package web_server;

import java.io.IOException;
import java.net.InetSocketAddress;

import com.sun.net.httpserver.*;

public class HelloWorld
{
    public static void main(String[] args) throws IOException
    {
	HttpServer server = HttpServer.create(new InetSocketAddress("localhost", 8001), 0);
	server.createContext("/", new HelloWorldHandler());
	server.start();
	System.out.println("Server running at http://localhost:8001");
    }
}

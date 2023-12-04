package web_server;

import java.io.IOException;
import java.net.InetSocketAddress;

import com.sun.net.httpserver.HttpServer;

public class PostRequestServer
{
    public static void main(String[] args) throws IOException
    {
	//We can test this server with: curl -d "hello" -X POST http://localhost:8001/
	HttpServer server = HttpServer.create(new InetSocketAddress("localhost", 8001), 0);
	server.createContext("/", new PostRequestHandler());
	server.start();
	System.out.println("Server running at http://localhost:8001");
    }
}

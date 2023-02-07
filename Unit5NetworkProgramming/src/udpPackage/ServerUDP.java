package udpPackage;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class ServerUDP 
{
	public ServerUDP() throws IOException
	{
		byte[] buff = new byte[256];
		
//		Create data-gram Socket
		DatagramSocket soc = new DatagramSocket(4445);
		
		// Receive request
		DatagramPacket pack = new DatagramPacket(buff, buff.length);
		soc.receive(pack); // From Client
		InetAddress addr = pack.getAddress();
		int port = pack.getPort();
		
//		Response Request from server
		String s = "Hello Client, I am server";
		buff = s.getBytes();
		
		// Send the response to the client at address and port
		pack = new DatagramPacket(buff, buff.length, addr, port);
		System.out.println("The server was running.");
		soc.send(pack); // To the client
		soc.close();
	}
	public static void main(String[] args) throws IOException 
	{
		new ServerUDP();
	}

}

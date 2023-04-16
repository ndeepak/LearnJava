package q13;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class ClientUDP 
{
	public ClientUDP() throws IOException
	{
//		Create Socket
		DatagramSocket soc = new DatagramSocket();
		
//		Send Request
		byte[] buff = new byte[256];
		InetAddress addr = InetAddress.getByName("localhost");
		DatagramPacket packt = new DatagramPacket(buff, buff.length,addr, 4445);
		soc.send(packt);
		
//		Get Response
		packt = new DatagramPacket(buff, buff.length);
		soc.receive(packt);
		
//		Display Response
		String received = new String(packt.getData());
		System.out.println("Length of Response: "+ received.length());
		System.out.println("The Response from server is: "+ received);
		System.out.println("Hello Server, I am client and was runnning.");
		
		soc.close();
		
		
	}
	public static void main(String[] args) throws IOException 
	{
		new ClientUDP();
	}

}

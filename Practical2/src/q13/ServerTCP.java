package q13;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerTCP 
{
	public ServerTCP() throws IOException
	{
		ServerSocket ss =new ServerSocket(1254);
		
//		wait and accept connection
		Socket soc=ss.accept();
		
//		Get communication stream associated with the socket
		DataInputStream ins=new DataInputStream(soc.getInputStream());//accept data in ins
		DataOutputStream outs=new DataOutputStream(soc.getOutputStream());//send data via outs
		
//		Perform IO to read requests
		String s= ins.readUTF();
		System.out.println(" Request From Client: "+s);
		outs.writeUTF(" Hello Client, I am a Server ");//write in outs
		
//		Close streams and connection
		ins.close();
		outs.close();
		soc.close();
		ss.close();
	}
	public static void main(String[] args) throws IOException 
	{
		new ServerTCP();
	}

}

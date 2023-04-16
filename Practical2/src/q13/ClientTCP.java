package q13;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientTCP 
{
	public ClientTCP() throws UnknownHostException, IOException
	{
//		Open Connection to a server at port 1254
		Socket soc = new Socket("localhost", 1254);
		
//		Get Input From Socket and read the input
		DataInputStream ins = new DataInputStream(soc.getInputStream());
		DataOutputStream outs = new DataOutputStream(soc.getOutputStream());
		
//		Perform IO
		outs.writeUTF(" Hello Server!!!, I am a Client "); // Write in outs
		String s = ins.readUTF(); // Obtain/get the data contained in socket
		System.out.println(" Response from Server: " + s); // Read the message sent by server
		
//		Close streams and connection
		ins.close();
		outs.close();
		soc.close();
		
	}
	public static void main(String[] args) throws UnknownHostException, IOException 
	{
		new ClientTCP();
	}

}

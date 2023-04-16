package q13;

import java.io.IOException;
import java.net.InetAddress;

public class GettingIP {

	public static void main(String[] args) throws IOException {

		InetAddress ndeepak = InetAddress.getByName("www.ndeepak.github.io");

		System.out.println("HOST ADDRESS        : " + ndeepak.getHostAddress());
		System.out.println("CANONICAL HOST NAME : " +  ndeepak.getCanonicalHostName());
		System.out.println("HOST NAME           : " +  ndeepak.getHostName());
//		If it is reachable or not
		ndeepak.isReachable(10000); 

		
		/*
        FileChannel;
        DatagramChannel; // TCP
        
        // UDP 
        SocketChannel;
        ServerSocketChannel
        
         */
	}

}

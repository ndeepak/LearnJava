package csit.deepak.clientmain;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import csit.deepak.rmi.Message;

public class ClientMain {

	private void doTest() {
		try {
			// fire to localhost port 1099
			Registry myRegistry = LocateRegistry.getRegistry("127.0.0.1", 1099);

			// search for myMessage service in the registry
			// gets remote object i.e. instance of MessageImpl (stub)
			Message impl = (Message) myRegistry.lookup("myMessage");

			// call server's method
			String s = impl.sayHello("Deepak Nagarkoti");
			double d = impl.saySquareRoot(625);
			System.out.println("Message Sent and Response Received");
			System.out.println(s + "\n" + d);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void main(String[] args) {

		ClientMain main = new ClientMain();
		main.doTest();

	}

}

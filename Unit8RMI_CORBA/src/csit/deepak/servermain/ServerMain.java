package csit.deepak.servermain;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import csit.deepak.rmi.MessageImplement;

public class ServerMain {
	private void startServer() {
		try {
// RMI registry is RMI server //create registry on port 1099
			Registry registry = LocateRegistry.createRegistry(1099);
// create a new service named myMessage with remote object 
			registry.rebind("myMessage", new MessageImplement());
		} catch (Exception e) {
		}
		System.out.println("system is ready");
	}

	public static void main(String[] args) {
		ServerMain main = new ServerMain();
		main.startServer();
	}
}

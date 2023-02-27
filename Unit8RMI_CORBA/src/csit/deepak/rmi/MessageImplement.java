package csit.deepak.rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class MessageImplement extends UnicastRemoteObject implements Message {

	
	public MessageImplement() throws RemoteException{
		super();
	}
	@Override
	public String sayHello(String message) {
		return "Hello "+ message;
	}

	@Override
	public double saySquareRoot(double value) {
		double sq = Math.sqrt(value);
		return sq;
	}
//
//	public static void main(String[] args) {
//
//	}
}

package csit.deepak.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Message extends Remote{
//	Method Signatures
	String sayHello(String message) throws RemoteException;
	
	double saySquareRoot(double value) throws RemoteException ;
}

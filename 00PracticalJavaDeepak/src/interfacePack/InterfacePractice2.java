package interfacePack;

class Phone {
	public void call() {
		System.out.println("Phone call");
	}

	public void sms() {
		System.out.println("Phone sending SMS");
	}
}

interface ICamera {
//	int clicknumber; // Throws Compile-time error
	void click();

	void record();
}

interface IMusicPlayer {
	void play();

	void stop();
}

class SmartPhone extends Phone implements ICamera, IMusicPlayer {
	public void videoCall() {
		System.out.println("Smart Phone video calling");
	}

	// ICamera reference
	public void click() {
		System.out.println("Smart Phone Clicking Photo");
	}

	public void record() {
		System.out.println("Smart Phone recording video");
	}

	public void play() {
		System.out.println("Smart Phone playing music");
	}

	public void stop() {
		System.out.println("Smart Phone stopped playing music");
	}

}

public class InterfacePractice2 {

	public static void main(String[] args) {
		
		// Can't instantiate
//		ICamera icam = new ICamera();
		
		SmartPhone sp0 = new SmartPhone();
		sp0.call(); // can call all methods
		sp0.sms();
		sp0.videoCall();
		sp0.click();
		sp0.record();
		sp0.play();
		sp0.stop();
		System.out.println("");
		
		Phone sp1 = new SmartPhone();
		// can call only two methods
		sp1.call();
		sp1.sms();
		System.out.println("");
		
		ICamera sp2 = new SmartPhone();
		sp2.click();
		sp2.record();
		System.out.println("");
		
		IMusicPlayer sp = new SmartPhone();
		sp.play();
		sp.stop();

	}

}

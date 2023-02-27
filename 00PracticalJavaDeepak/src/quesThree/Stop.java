package quesThree;

public class Stop extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				sleep(500);
				System.out.println(Thread.currentThread().getName());
			} catch (InterruptedException e) {
				System.out.println(i);
			}
		}
	}

	public static void main(String[] args) {
		System.out.println("**** This is stop() Method ****");

		// Creating three threads
		Stop t1 = new Stop();
		Stop t2 = new Stop();
		Stop t3 = new Stop();

		// Call run() method
		t1.start();
		t2.start();
		t3.stop();
		System.out.println("Thread t3 is stopped.");
	}

}

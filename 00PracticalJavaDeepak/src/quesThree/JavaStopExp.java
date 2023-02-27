package quesThree;

public class JavaStopExp extends Thread {
	public void run() {
		for (int i = 1; i < 5; i++) {
			try {
				sleep(500);
				System.out.println(Thread.currentThread().getName());
			} catch (InterruptedException e) {
				System.out.println(e);
			}
			System.out.println(i);
		}
	}

	public static void main(String args[]) {
		System.out.println("**** This is stop() Method ****");
		JavaStopExp thread1 = new JavaStopExp();
		JavaStopExp thread2 = new JavaStopExp();
		JavaStopExp thread3 = new JavaStopExp();
		thread1.start();
		thread2.start();
		thread3.stop();
		System.out.println("Thread thread3 is stopped");
	}
}
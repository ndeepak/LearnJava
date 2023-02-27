package quesThree;

class ThreadOne extends Thread {
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("Thread one is running");
			Thread.yield();
		}
	}
}

class ThreadTwo extends Thread {
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("Thread two is running");
		}
	}
}

class MainThread {
	public static void main(String args[]) {
		System.out.println("**** yield() method ****");
		ThreadOne threadOne = new ThreadOne();
		ThreadTwo threadTwo = new ThreadTwo();
		threadOne.start();
		threadTwo.start();
	}
}
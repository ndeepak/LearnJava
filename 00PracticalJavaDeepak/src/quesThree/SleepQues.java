package quesThree;

public class SleepQues extends Thread{

	public void run() {
		for (int i = 1; i <= 5; i++) {
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				System.out.println("Excp "+ e);
			}
			System.out.println("Itr "+i);
		}
	}

	public static void main(String args[]) {
		SleepQues t1 = new SleepQues();
		SleepQues t2 = new SleepQues();

		t1.start();
		t2.start();
	}
}

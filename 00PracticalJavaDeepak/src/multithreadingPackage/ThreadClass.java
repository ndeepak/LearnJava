package multithreadingPackage;

class Good extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("GOOD");
			try {
				Thread.sleep(1000); // 1 second
			} catch (InterruptedException e) {

			}
		}
	}
}

class Morning extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("MORNING");
			try {
				Thread.sleep(1000); // 1 second
			} catch (InterruptedException e) {

			}
		}
	}
}

public class ThreadClass {

	public static void main(String[] args) throws InterruptedException {
		Good g = new Good();
		g.start();
		Morning m = new Morning();
		m.start();
	}

}
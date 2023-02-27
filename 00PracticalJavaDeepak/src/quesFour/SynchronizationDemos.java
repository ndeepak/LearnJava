package quesFour;

class CSITBookSeat {
	int csit_seats = 48;

	synchronized public void bookSeat(int seats) { // here method is made synchronized
		if (csit_seats >= seats) {
			System.out.println(seats + " seats books successfully");
			csit_seats = csit_seats - seats;
			System.out.println(csit_seats + " seats are available");
		} else {
			System.out.println("Seats are not vailable");
			System.out.println(csit_seats + " seats are available");
		}
	}
}

public class SynchronizationDemos extends Thread {
	static CSITBookSeat cbs;
	int seats;

	public void run() {
		cbs.bookSeat(seats);
	}

	public static void main(String[] args) {
		cbs = new CSITBookSeat();
		SynchronizationDemos ram = new SynchronizationDemos();
		ram.seats = 30;
		ram.start();
		SynchronizationDemos hari = new SynchronizationDemos();
		hari.seats = 28;
		hari.start();
		hari.seats = 8;
	}
}
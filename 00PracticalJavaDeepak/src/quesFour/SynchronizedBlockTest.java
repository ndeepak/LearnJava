package quesFour;

class TicketCounter {
	int availableSeats = 2;

	void bookTicket(String name, int numberOfSeats) {
		if ((availableSeats >= numberOfSeats) && (numberOfSeats > 0)) {
			System.out.println(name + " : " + numberOfSeats + " Seats Booking Success");
			availableSeats -= numberOfSeats;
		} else {
			System.out.println(name + " : Seats Not Available");
		}
	}
}

class TicketBookingThread extends Thread {
	TicketCounter tc;
	String name;
	int seats;

	TicketBookingThread(TicketCounter tc, String name, int seats) {
		this.tc = tc;
		this.name = name;
		this.seats = seats;
	}

	public void run() {
		synchronized (tc) { // synchronized block
			tc.bookTicket(name, seats);
		}
	}
}

public class SynchronizedBlockTest {
	public static void main(String[] args) {
		TicketCounter tc = new TicketCounter();
		TicketBookingThread t1 = new TicketBookingThread(tc, "Deepak", 1);
		TicketBookingThread t2 = new TicketBookingThread(tc, "Samjhana", 1);

		TicketBookingThread t3 = new TicketBookingThread(tc, "Sam", 1);
		t1.start();
		t2.start();
		t3.start();
	}
}
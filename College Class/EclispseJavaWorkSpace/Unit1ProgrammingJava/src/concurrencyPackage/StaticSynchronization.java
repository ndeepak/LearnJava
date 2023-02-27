package concurrencyPackage;

class CSITBooking {
	static int csit_seats = 48;

//	publics void bookSeat(int seats) // seats is request from users
	public static synchronized void bookSeat(int seats) {
		if (csit_seats >= seats) {
			System.out.println(seats + " seats are Booked Successfully.");
			csit_seats -= seats;
			System.out.println(csit_seats + " seats are available.");
		} else {
			System.out.println("Seats are not available anymore!!!");
			System.out.println(csit_seats + " seats are available.");
		}
//		System.out.println("I am not Synchronized.");
	}
}

class Esewa extends Thread {
	CSITBooking cb;
	int seats;

	public Esewa(CSITBooking cb, int seats) {
		this.cb = cb;
		this.seats = seats;
	}

	@Override
	public void run() {
		CSITBooking.bookSeat(seats);
	}
}

class Khalti extends Thread {
	CSITBooking cb;
	int seats;

	public Khalti(CSITBooking cb, int seats) {
		this.cb = cb;
		this.seats = seats;
	}

	@Override
	public void run() {
		CSITBooking.bookSeat(seats);
	}
}

public class StaticSynchronization {

	public static void main(String[] args) {
		CSITBooking b1 = new CSITBooking();
		Esewa t1 = new Esewa(b1, 12);
		t1.start();

		Esewa t2 = new Esewa(b1, 14);
		t2.start();

		CSITBooking b2 = new CSITBooking();

		Esewa t3 = new Esewa(b2, 12);
		t3.start();

		Khalti t4 = new Khalti(b2, 14);
		t4.start();


	}

}

package quesFour;

class CSITBookSeat {
	int csit_seats = 48;

	public void bookSeat(int seats) {
		System.out.println("I am also synchronized " + Thread.currentThread().getName());
		System.out.println("I am also synchronized " + Thread.currentThread().getName());
		System.out.println("I am also synchronized " + Thread.currentThread().getName());
		System.out.println("I am also synchronized " + Thread.currentThread().getName());
		System.out.println("I am also synchronized " + Thread.currentThread().getName());
//here synchronized block is used to synchronize required portion
		synchronized (this) { // this is a reference object of current class
			if (csit_seats >= seats) {
				System.out.println(seats + " seats books successfully");
				csit_seats = csit_seats - seats;
				System.out.println(csit_seats + " seats are available");

			} else {
				System.out.println("Seats are not vailable");
				System.out.println(csit_seats + " seats are available");
			}
		}
		System.out.println("I am also synchronized " + Thread.currentThread().getName());
		System.out.println("I am also synchronized " + Thread.currentThread().getName());
		System.out.println("I am also synchronized " + Thread.currentThread().getName());
		System.out.println("I am also synchronized " + Thread.currentThread().getName());
		System.out.println("I am also synchronized " + Thread.currentThread().getName());
	}
}

public class BlockSync extends Thread {
	static CSITBookSeat sd;
	int seats;

	public void run() {
		sd.bookSeat(seats);
	}

	public static void main(String[] args) {
		sd = new CSITBookSeat();
		BlockSync cbs1 = new BlockSync();
		cbs1.seats = 30;
		cbs1.start();
		BlockSync cbs2 = new BlockSync();
		cbs2.seats = 28;
		cbs2.start();
	}
}
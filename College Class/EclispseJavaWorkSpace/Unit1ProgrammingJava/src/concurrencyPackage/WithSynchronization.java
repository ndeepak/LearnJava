package concurrencyPackage;
class CSITBookingSystem1
{
	int csit_seats=48;
//	publics void bookSeat(int seats) // seats is request from users
	public void bookSeat(int seats)
	{
		synchronized (this) 
		{
			if(csit_seats >= seats)
			{
				System.out.println(seats+ " seats are Booked Successfully.");
				csit_seats -= seats;
				System.out.println(csit_seats+ " seats are available.");
			}
			else
			{
				System.out.println("Seats are not available anymore!!!");
				System.out.println(csit_seats+ " seats are available.");
			}
		}
	}
}
public class WithSynchronization extends Thread
{
	static CSITBookingSystem1 sd; // static because using is easy
	int seats;
	
	@Override
	public void run()
	{
		sd.bookSeat(seats);
	}
	public static void main(String[] args) 
	{
		sd = new CSITBookingSystem1();
		WithSynchronization deep = new WithSynchronization();
		deep.seats = 15;
		deep.start();
		
		WithSynchronization jeep = new WithSynchronization();
		jeep.seats = 10;
		jeep.start();
		
		WithSynchronization heep = new WithSynchronization();
		heep.seats = 23;
		heep.start();
		
		WithSynchronization peep = new WithSynchronization();
		peep.seats = 5;
		peep.start();
	}

}

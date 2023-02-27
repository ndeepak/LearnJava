package quesFour;
class CSITBookingSystem1
{
	int csit_seats=48;
//	publics void bookSeat(int seats) // seats is request from users
	public void bookSeat(int seats)
	{
		synchronized (this)  // here method is made synchronized
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
public class SynchronizationDemo extends Thread
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
		
		SynchronizationDemo deep = new SynchronizationDemo();
		deep.seats = 15;
		deep.start();
		
		SynchronizationDemo jeep = new SynchronizationDemo();
		jeep.seats = 10;
		jeep.start();
		
		SynchronizationDemo heep = new SynchronizationDemo();
		heep.seats = 23;
		heep.start();
//		
//		SynchronizationDemo peep = new SynchronizationDemo();
//		peep.seats = 5;
//		peep.start();
	}

}

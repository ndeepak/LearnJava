package concurrencyPackage;
class CSITBookingSystem
{
	int csit_seats=48;
//	publics void bookSeat(int seats) // seats is request from users
	public void bookSeat(int seats)
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
public class WithoutSynchronization extends Thread
{
	static CSITBookingSystem sd; // static because using is easy
	int seats;
	
	@Override
	public void run()
	{
		sd.bookSeat(seats);
	}
	public static void main(String[] args) 
	{
		sd = new CSITBookingSystem();
		WithoutSynchronization deep = new WithoutSynchronization();
		deep.seats = 15;
		deep.start();
		
		WithoutSynchronization jeep = new WithoutSynchronization();
		jeep.seats = 10;
		jeep.start();
		
		WithoutSynchronization heep = new WithoutSynchronization();
		heep.seats = 23;
		heep.start();
		
		WithoutSynchronization peep = new WithoutSynchronization();
		peep.seats = 5;
		peep.start();
	}

}

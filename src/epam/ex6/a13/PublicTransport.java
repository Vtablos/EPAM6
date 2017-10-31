package epam.ex6.a13;

public class PublicTransport implements Vehicle {

	protected String parkingName;
	protected int capacity;
	protected String powertype;
	int ticketPrice;

	public PublicTransport(String parkingName, int capacity, String powertype, int ticketPrice) {
		this.parkingName = parkingName;
		this.capacity = capacity;
		this.powertype = powertype;
		this.ticketPrice = ticketPrice;
	}

	@Override
	public void start() {
		System.out.println("start with " + powertype);

	}

	@Override
	public void setCorse(String corse) {
		System.out.println("move to " + corse);

	}

	@Override
	public void openDoors() {
		System.out.println("doors opened");

	}

	@Override
	public void sumForTickets(int peopleNumber) {
		if (peopleNumber > capacity)
			System.out.println("out of capacity");
		else
			System.out.println("collected sum is " + peopleNumber * ticketPrice);

	}

}

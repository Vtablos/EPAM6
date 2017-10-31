package epam.ex6.a13;

public class Tram extends PublicTransport {

	public Tram(String parkingName, int capacity, String powertype, int ticketPrice) {
		super(parkingName, capacity, powertype, ticketPrice);
	}

	public void ring(){
		System.out.println("bang-bang");
	}
}

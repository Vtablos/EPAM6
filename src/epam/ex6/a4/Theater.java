package epam.ex6.a4;

public class Theater extends PublicBuilding {

	private int seats; 
	
	public Theater(String name, int capacity, int stores, int seats) {
		super(name, capacity, stores);
		this.seats = seats;
	}

	@Override
	public void makeAparty(int people) {
		if (people<=seats)
		System.out.println("lets make a concert on " + people + " visitors");
		else
			System.out.println("there is no so many tickets, " + (people-seats) +" visitors make come tomorrow");
	}
	
	@Override
	public void clean() {
		System.out.println("cleaning");

	}
	
	public void applause(){
		System.out.println("applause");
	}


	public int getSeats() {
		return seats;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}
}

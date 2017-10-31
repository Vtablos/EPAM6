package epam.ex6.a4;

public abstract class PublicBuilding implements Building {

	protected String name;
	protected int capacity;
	protected int stores;

	public PublicBuilding(String name, int capacity, int stores) {
	
		this.name = name;
		this.capacity = capacity;
		this.stores = stores;
	}

	@Override
	public void open() {
		System.out.println("opened");

	}

	@Override
	public void clean() {
		System.out.println("cleaning");

	}

	@Override
	public void heat(int temperature) {
		System.out.println("temperature is " + temperature);

	}

	@Override
	public void makeAparty(int people) {
		System.out.println("lets make a party on " + people + " persons");
		
	}

}

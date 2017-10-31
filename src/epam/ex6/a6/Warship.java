package epam.ex6.a6;

public abstract class Warship implements Ship {

	protected String name;
	private int coordinates;
	protected String chargetype;
	private String corse;

	public Warship(String name, String chargetype) {
		this.name = name;
		this.chargetype = chargetype;

	}
	
	public void attak(int coordinates, String chargetype, int chargeNumber) {
		System.out.println("Fire to " + coordinates + " whith " + chargeNumber + " " + chargetype);
	};

	@Override
	public void move() {
		System.out.println("move to " + corse);

	}

	@Override
	public void stop() {
		System.out.println("stop");

	}

	@Override
	public String setCorse(int latitide, int longitude) {
		corse = String.valueOf(latitide) + "  " + (longitude);
		return corse;
	}

	public void setTarget(int coordinates) {
		this.coordinates = coordinates;
		System.out.println("Get target in " + coordinates);
	};

	public int getTarget() {
		return coordinates;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getChargetype() {
		return chargetype;
	}

	public void setChargetype(String chargetype) {
		this.chargetype = chargetype;
	}

	
}

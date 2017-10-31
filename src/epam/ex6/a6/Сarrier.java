package epam.ex6.a6;

public class Сarrier extends Warship {

	private int planeCapacity;

	public Сarrier(String name, String chargetype, int planeCapacity) {
		super(name, chargetype);
		this.planeCapacity = planeCapacity;
	}

	@Override
	public void attak(int coordinates, String chargetype, int chargeNumber) {
		System.out.println("Fire to " + coordinates + " whith " + chargeNumber + " " + chargetype + " from  " + planeCapacity );
	};
	
	public void run(){
		System.out.println("run");
	}

	public int getPlaneCapacity() {
		return planeCapacity;
	}

	public void setPlaneCapacity(int planeCapacity) {
		this.planeCapacity = planeCapacity;
	}

}

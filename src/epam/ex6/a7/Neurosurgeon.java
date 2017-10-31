package epam.ex6.a7;

public class Neurosurgeon extends Surgeon {

	public Neurosurgeon(String name) {
		super(name);

	}

	public void sayName(){
		System.out.println("by " + name);
	}
	
	@Override
	public void treat() {
		if (diagnos.equals("Bad")) {
			System.out.println(patientName + " head was treated");
		} else {
			System.out.println(patientName + "  head normal");
		}
	}
}
package epam.ex6.a5;

/**
 * interface Mobile ß abstract class Siemens Mobile ß class Model.
 */
public class Model extends SimensMobile {

	String name;
	int serial;
	
	
	public Model(String name, int serial) {
		
		this.name = name;
		this.serial = serial;
	}
	
	public void sayName(){
		System.out.println(name);
	}

	@Override
	public void on() {
		System.out.println(name +" on"+" ");
		
	}

}

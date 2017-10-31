package epam.ex6.a6;


public class Action {

	
	public void act(Warship warship){
		System.out.println(warship.getName());
		warship.setCorse(1515654, 1237845);
		warship.move();
		warship.setTarget(465546);
		warship.stop();
		warship.attak(warship.getTarget(), warship.getChargetype(), 10);
		((Сarrier)warship).run(); 
		System.out.println("-----------------------------------");
	}
}



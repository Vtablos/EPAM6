package epam.ex6.a4;

import java.util.ArrayList;
import java.util.List;

/** interface Здание ß abstract class Общественное Здание ß class Театр. */

public class Main {

	public static void main(String[] args) {
		
		
		Theater theater = new Theater("Bolshoi", 500, 5, 400);
		Theater theater2 = new Theater("Mariinski", 300, 2, 250);
		
		List<PublicBuilding> publicbuildings = new ArrayList<>();
		publicbuildings.add(theater);
		publicbuildings.add(theater2);
		
		
		for (PublicBuilding publicBuilding: publicbuildings){
			System.out.println(publicBuilding.name);
			publicBuilding.open();
			publicBuilding.heat(24);
			publicBuilding.makeAparty(300);
			((Theater)publicBuilding).applause();
			publicBuilding.clean();
			System.out.println("--------------------------------------------");
		}

	}

}

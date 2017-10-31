package epam.ex6.a7;

import java.util.ArrayList;
import java.util.List;

/** interface Врач ß class Хирург ß class Нейрохирург. */

public class Main {

	public static void main(String[] args) {
		
		Neurosurgeon neurosurgeon = new Neurosurgeon("Cartman");
		Neurosurgeon neurosurgeon2 = new Neurosurgeon("Stan");
		
		List<Surgeon> surgeons = new ArrayList<>();
		surgeons.add(neurosurgeon);
		surgeons.add(neurosurgeon2);
		
		for (Surgeon surgeon: surgeons){
			surgeon.setDiagnos("Kile", 11);
			surgeon.treat();
			((Neurosurgeon)surgeon).sayName();
			System.out.println("---------------------------------");
		}

	}

}

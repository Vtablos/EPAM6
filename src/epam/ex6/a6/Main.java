package epam.ex6.a6;

import java.util.ArrayList;
import java.util.List;

/**
 * interface Корабль ß abstract class Военный Корабль ß class Авианосец.
 */

public class Main {

	public static void main(String[] args) {

		Сarrier carrier1 = new Сarrier("SouthPark", "fighterplane", 15);

		Сarrier carrier2 = new Сarrier("Denver", "bomberplane", 20);

		List<Warship> ships = new ArrayList<>();
		ships.add(carrier1);
		ships.add(carrier2);

		Action action = new Action();

		for (Warship ship : ships) {
			action.act(ship);

		}

	}

}

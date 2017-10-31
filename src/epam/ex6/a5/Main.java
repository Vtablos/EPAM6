package epam.ex6.a5;

import java.util.ArrayList;
import java.util.List;

/** interface Mobile ß abstract class Siemens Mobile ß class Model. */


public class Main {

	public static void main(String[] args) {
		
		
		Model model1 = new Model("a35", 1544242);
		Model model2 = new Model("a50", 4844542);
		
		List<SimensMobile> models = new ArrayList<>();
		models.add(model1);
		models.add(model2);
		
		for(SimensMobile model: models){
			System.out.println(model.label);
			model.on();
			model.call(546464);
			model.answerCall(4654646);
			model.sMs("SMS", 455454);
			((Model)model).sayName();
			System.out.println("-----------------------------------------------------");
		}

	}

}

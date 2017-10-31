package epam.ex6.a13;

import java.util.ArrayList;
import java.util.List;

/** . interface Транспортное Средство ß abstract class Общественный Транспорт ß class Трамвай. */

public class Main {

	public static void main(String[] args) {
		
		Tram tram = new Tram("sthpark", 50, "electricity", 11 );
		Tram tram2 = new Tram("denver", 100, "electricity", 15 );
		
		List<PublicTransport> publictransport = new ArrayList<>();
		publictransport.add(tram);
		publictransport.add(tram2);
		
		for(PublicTransport transport: publictransport){
			System.out.println(transport.parkingName);
			transport.start();
			transport.setCorse("Hell");
			transport.sumForTickets(51);
			((Tram)transport).ring();
			System.out.println("-----------------------------------------");
		}

	}

}

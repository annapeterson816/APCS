package inheritance;

import java.util.ArrayList;

public class ShipRunner {

	public static void main (String[] args){
		
	}
	 ArrayList <Ship> ShipList = new ArrayList <Ship>(); {
	 		Ship pirateship = new Ship("ARGGGG", "1969");
	 		CruiseShip Disney = new CruiseShip ("Disney", "2015", 100000);
	 		CargoShip lifeboat = new CargoShip ("Titanic Failed" , "1912", 123456);
	 			
	 		ShipList.add(pirateship);
	 		ShipList.add(Disney);
	 		ShipList.add(lifeboat);
	 		
	 

	 for (Ship q: ShipList){
		 System.out.println(q.toString());
	 }

}
}

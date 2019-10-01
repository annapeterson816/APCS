package inheritance;

public class CruiseShip extends Ship {

	private String name, year;
	private int passengers;
	
	public CruiseShip(String nm, String yr, int max){
		super(nm, yr);
		name=nm;
		passengers=max;
	
	}

	public void setPassengers(int max){
		passengers=max;
	}
	
	public int getPassengers(){
		return passengers;
	}
	
	public String toString(){
	return name + passengers;
}
}

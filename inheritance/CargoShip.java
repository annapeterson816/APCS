package inheritance;

public class CargoShip extends Ship{
	
	private String name;
	private int tonnage;
	
	public CargoShip(String nm, String yr, int ton){
		super(nm,yr);
		name=nm;
		tonnage=ton;
	}

	public void setTonnage(int ton){
		tonnage=ton;
	}
	
	public int getTonnage(){
		return tonnage;
	}
	
	public String toString(){
		return name +tonnage;
	}
}

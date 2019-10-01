package inheritance;

import static java.lang.System.*; 

public class Ship {
	
		private String name, year;
		
		public Ship(String nm, String yr) {
			name =nm;
			year=yr;
		}

		public void setName(String nm){
			name =nm;
		}
	
		public void setYear(String yr){
			year=yr;
		}
		
		public String getName(){
			return name;
			
		}
		
		public String getYear(){
			return year;
		}
		
		public String toString(){
			return name + year;
		}
	}


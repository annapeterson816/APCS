package array2d;



import java.util.List;
import java.util.ArrayList;

public class SeatingChart {
	private Student[][] seats ;

	public SeatingChart(List<Student> studentList, int rows, int cols) {
	int i=0;
	seats=new Student[rows][cols];
		for(int c=0; c<seats[0].length; c++){
			for(int r=0; r<seats.length ;r++){
				if( i< studentList.size())
				seats[r][c] = studentList.get(i);
				i++;
			}
		}
	}

	public int removeAbsentStudents(int allowedAbsences) {
		int pplremoved=0;
		
		for(int r=0; r<seats.length;r++){
			for(int c=0; c<seats[0].length; c++){
				if (seats[r][c] != null && seats[r][c].getAbsentCount()>= allowedAbsences){
					seats[r][c]=null;
					pplremoved++;
			}
		}
}
		return pplremoved;
	}

	// not part of the exam, but helpful to see the students in the grid
	public String toString() {
		String ret = "";
		for (Student[] row : seats) {
			for (Student it : row) {
				if (it == null)
					ret += String.format("%-9s", "null");
				else
					ret += it;
			}
			ret += "\n";
		}
		return ret;
	}
}
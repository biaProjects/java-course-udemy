package entities;

public class Student {
	
	private String name;
	public double[] grades = new double[3];
	
	private final double MINIMUN = 6;
	
	// constructor
	public Student(String name) {
		this.name = name;
	}
	
	
	// get and set
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	
	// metodos
	public double finalGrade() {
		double sumGrades = 0.0;
		
		for (double grade : grades) {
			sumGrades += grade;			
		}
		
		return sumGrades / grades.length;		
	}
	
	public void passOrFail() {
		if (finalGrade() < MINIMUN) {
			double missing = MINIMUN - finalGrade();
			System.out.printf("FAILED %nMISSING %.2f POINTS", missing);
		}
		else {
			System.out.println("PASS");
		}
	}
}


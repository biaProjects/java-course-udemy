package entities;

public class Student {
	
	public String name;
	public double[] grades = new double[3];
	
	
	public double finalGrade() {
		
		double sumGrades = 0.0;
		
		for (double grade : grades) {
			sumGrades += grade;
		}
		
		return sumGrades;
				
	}
	
	public void passOrFail(double minimun) {
		if (finalGrade() < minimun) {
			double missing = minimun - finalGrade();
			System.out.printf("FAILED %nMISSING %.2f POINTS", missing);
		}
		else {
			System.out.println("PASS");
		}
	}
}


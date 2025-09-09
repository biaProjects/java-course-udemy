package entities;

public class Student {
	
	public String name;
	public double grade1;
	public double grade2;
	public double grade3;
	
	
	public double finalGrade() {
		return grade1 + grade2 + grade3;
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

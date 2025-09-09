package entities;

public class Rectangle {

	public double height;
	public double width;
	
	
	public double area() {
		return height * width;
	}
	
	public double perimeter() {
		return height*2 + width*2;
	}
	
	public double diagonal() {
		double sumSquareLegs = Math.pow(height, 2) + Math.pow(width, 2);
	return Math.sqrt(sumSquareLegs);
	}
}

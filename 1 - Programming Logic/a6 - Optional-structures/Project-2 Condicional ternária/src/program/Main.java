package program;

public class Main {

	public static void main(String[] args) {

		double price = 35.5;
		double discount; 
		
//		if ( price < 20.0 ) {
//		 	discount = price * 0.1;
//		} else {
//			discount = price * 0.05;
//		}

		discount = (price < 20.0) ? price * 0.1 : price * 0.05;
		
		System.out.println("The discount is = " + discount);
	}
}
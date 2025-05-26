import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {

    	Scanner sc = new Scanner(System.in);
    	
    	String word = sc.nextLine();
    	int lenght = word.length();
    	if (lenght >= 10) {
    		System.out.println("palavrao");
    	} else {
    		System.out.println("palavrinha");
    	}
    	
    	sc.close();
    }
}

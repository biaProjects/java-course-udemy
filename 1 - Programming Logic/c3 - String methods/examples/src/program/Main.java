package program;

public class Main {

	public static void main(String[] args) {

		String initial = "APPLE   Potato lemon GRAPE";
		
		// to format
		String formatLower = initial.toLowerCase();
		String formatUpper = initial.toUpperCase();
		String formaNoEspace = initial.trim();
		
		System.out.printf("lower: '%s' %nUpper: '%s' %nno espace: '%s' %n", formatLower, formatUpper, formaNoEspace);
		
		// to cut
		String cropped = initial.substring(6);
		String cropped1 = initial.substring(6, 15);
		
		System.out.printf("%ncut just with begin: '%s' %ncut begin and end: '%s'%n", cropped, cropped1);
		
		// to replace
		String change = initial.replace('A', 'O');
		String change1 = initial.replace("otat", "ian");
		
		System.out.printf("\nchanges: %n'%s' %n'%s' %n", change, change1);
		
		// to find
		int find = initial.indexOf("E");
		int find1 = initial.lastIndexOf("E");
		
		System.out.printf("%nfind index: '%d' %nfind lastIndex: '%d' %n", find, find1);

		
		// using the first string we made to do the split
		String toSplit = "apple potato lemon grape";
		String[] vect = toSplit.split(" ");
		
		System.out.printf("\nthe split:\n");
		System.out.println(vect[0]);
		System.out.println(vect[1]);
		System.out.println(vect[2]);
		System.out.println(vect[3]);		
	}
}

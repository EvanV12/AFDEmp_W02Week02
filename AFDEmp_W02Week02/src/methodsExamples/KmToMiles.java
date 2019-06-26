// Nautical miles conversion


package methodsExamples;


import java.util.Scanner;

public class KmToMiles {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double km = 1.852;
		double miles = 1.150779;
		
		
		System.out.print("Enter nautical miles for conversion: ");
		double nautical = input.nextInt();
		
		System.out.println("Nautical miles is " + (nautical*km) + " kilometers");
		System.out.println("Nautical miles is " + (nautical*miles) + " miles");
	
		
		input.close();
	}
}

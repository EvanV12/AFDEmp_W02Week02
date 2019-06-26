package incompleteExamples;
import java.io.Console;

public class KmToMiles2 {

	public static void main(String[] args) {
		
		double km = 1.852;
		double miles = 1.150779;
		//double nautical = 10;

		Console console = System.console();
		
		double m = Double.parseDouble(console.readLine("enter:"));
		
		// String d = console.readLine("Enter nautical: ");
		// double m = Double.parseDouble(d);
		
		System.out.println("Nautical miles is " + (m*km) + " kilometers");
		System.out.println("Nautical miles is " + (m*miles) + " miles");
	}
}

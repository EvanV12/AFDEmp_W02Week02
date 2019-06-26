package methodsExamples;
import java.util.Scanner;

public class MethodSwapWithScanner {

	public static void main(String[] args) {
		
		int a;
		int b;
	//	int c = Swap(a, b);
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter first number: ");
		a = scanner.nextInt();
		System.out.print("Enter second number: ");
		b = scanner.nextInt();	
		
		scanner.close();
		
		System.out.println();
		System.out.println("First number is " + a + " and second number is " + b );
		System.out.println();
		
		// Invoke the swap method
		swapFunction(a, b);
		}
		
	public static void swapFunction (int a, int b) {
			
		System.out.println("Before swapping (Inside swapFunction): a = " + a + " and b = " + b);
			
		// Swap n1 with n2
		int c = a;
		a = b;
		b = c;
		System.out.println("After swapping (Inside swapFunction): a = " + a + " and b = " + b);	
	}
}



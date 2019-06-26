// Compare two numbers


package methodsExamples;


import java.util.Scanner;

public class MethodCorrect {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter first number: ");
		int a = input.nextInt();
		
		System.out.print("Enter second number: ");
		int b = input.nextInt();
		
		int c = minFunction(a, b);
		System.out.println("Minimum value = " + c);
		
		maxFunction(a, b);
		
		
		input.close();
	}
	
	
	// This method returns an integer
	public static int minFunction(int n1, int n2) {
		int min;
		if (n1 > n2)
			min = n2;
		else
			min = n1;
		
		return min;
	}

	
	// This method is void, does not return anything.
	// It prints the result
	public static void maxFunction(int n1, int n2) {
		int max;
		if (n1 < n2)
			max = n2;
		else
			max = n1;
		
		System.out.println("Maximum value is " + max);
	}
}

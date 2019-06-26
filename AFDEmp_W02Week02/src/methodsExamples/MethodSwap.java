package methodsExamples;

public class MethodSwap {

	public static void main(String[] args) {
		
		int a = 30;
		int b = 45;
		System.out.println("Before entering swapFunction: a = " + a + " and b = " + b);
		System.out.println();
		
		// Invoke the swap method
		swapFunction(a, b);
		System.out.println();
		System.out.println("After swapping: a = " + b + " and b = " + a);
	}
	
	public static void swapFunction(int a, int b) {
		
		System.out.println("Before swapping (Inside swapFunction): a = " + a + " and b = " + b);
				
		// Swap n1 with n2
		int c = a;
		a = b;
		b = c;
		System.out.println("After swapping (Inside swapFunction): a = " + a + " and b = " + b);
	}
}

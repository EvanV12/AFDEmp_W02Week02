package fibonacciExamples;

public class FibonacciNumbers {

	public static void main(String[] args) {
		System.out.println("Answer = " + fibonacci(25));
	}
	
	
	public static int fibonacci(int n) {
		if (n == 0 || n == 1)
			return n;
		else
			return fibonacci(n-1)+fibonacci(n-2);
	}
}

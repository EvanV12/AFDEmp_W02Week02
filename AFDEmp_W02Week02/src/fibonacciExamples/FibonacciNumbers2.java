package fibonacciExamples;

public class FibonacciNumbers2 {

	public static void main(String[] args) {
		System.out.println("Answer = " + fibonacci(12));
	}	
	
	// from https://www.geeksforgeeks.org/program-for-nth-fibonacci-number/
	
	public static int fibonacci(int n) {
		
		int a = 0;
		int	b = 1;
		int c;
		
        if (n==0)
            return a;
        
        for (int i = 2; i <= n; i++) { 
            c = a + b;
            a = b;
            b = c;
        } 
        return b;		
	}
}

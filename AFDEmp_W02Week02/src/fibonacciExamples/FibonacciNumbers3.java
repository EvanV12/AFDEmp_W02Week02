package fibonacciExamples;

public class FibonacciNumbers3 {

	public static void main(String[] args) {
		System.out.println("Final Answer = " + fibonacci(8));
	}	

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
        System.out.println("Next number is " + b);
        } 
        return b;		
	}
}

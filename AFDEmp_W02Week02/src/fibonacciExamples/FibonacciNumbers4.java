package fibonacciExamples;

public class FibonacciNumbers4 {

	public static void main(String[] args) {
		System.out.println("Final Answer = " + fibonacci(8));
		System.out.println("Addittion = " + fibonacciaddittion(8));
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
	
	public static int fibonacciaddittion(int n) {
		
		int a = 0;
		int b = 1;
		int c;
		int d;
		
		if (n==0)
            return a;
        
        for (int i = 2; i <= n; i++) { 
            c = a + b;
            a = b;
            b = c;
            d = b-i;
            
        System.out.println("Next number is " + d);
        } 
        return b;	
	}

}

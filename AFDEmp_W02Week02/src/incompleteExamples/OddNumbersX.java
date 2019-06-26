package incompleteExamples;
import java.io.Console;
//import java.lang.reflect.Array;

public class OddNumbersX {

	public static void main(String[] args) {

		int [] odd = new int [1000];
		
		
		
		for (int x = 0; x < odd.length; x = x+1) {
//			Arrays.fill(odd, x);
			odd[x] = 2*x+1;
			
		Console console = System.console();
		int y = Integer.parseInt(console.readLine("Enter y"));
		for (int i = 0; i < odd.length; i++)
			if (odd[i] == x) {
				System.out.println("Number" + x + "found at index" + i);
			}
		//	System.out.println(odd);
		}
			
			
		
		
	//	int odd[] = {i
		
		//System.out.println(odd);

	}

}

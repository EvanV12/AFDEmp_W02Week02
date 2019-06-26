package incompleteExamples;
import java.util.Arrays;
// import java.util.Scanner;

public class OddNumbers {

	public static void main(String[] args) {

		int odd[] = new int [1000];
		
		
		
		for (int x = 0; x <1000; x = x+1) {
			Arrays.fill(odd, x);
			odd[x] = 2*(x+1);
			System.out.println(odd);
		}
			
			
		
		
	//	int odd[] = {i
		
		//System.out.println(odd);

	}

}

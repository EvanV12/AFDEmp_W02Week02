package arraysExamples;
import java.util.Arrays;


public class ArraysToString {

	public static void main(String[] args) {
		int num[] = {3, 44, 12, 37, 5, 7, 24, 52, 5, 2, 15};
		
		
		//for (i=0; num.length; i++)
		System.out.println("Print list " + Arrays.toString(num));

		 for (int i = 0; i < num.length/2; i++) {
			int temp = num[i];
			num[i] = num[num.length-1-i];
			num[num.length-1-i] = temp;
		
			System.out.println("Print list " + Arrays.toString(num));
		//System.out.println("Print list " + );
	}

}
}
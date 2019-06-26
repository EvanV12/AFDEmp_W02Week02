// Print values of an array, skip unwanted values


package arraysExamples;

public class ArraySkip {

	public static void main(String[] args) {
		String[] values = { "cat","dog", "pig", "bear","bird","parrot","rabbit" };
		
		//Loop over all Strings
		for (String value : values) {
			
			//Skip Strings starting with letter p
			if (value.startsWith("p")) {
		
			continue;
			}
			
			System.out.println(value);
		}
		
	}
	
}

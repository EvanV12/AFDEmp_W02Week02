// Print values of an array, skip unwanted values [alternative]


package arraysExamples;

public class ArraySkip2 {

	public static void main(String[] args) {
		String[] values = { "cat","dog", "pig", "bear","bird","parrot","rabbit" };
		
		//Loop over all Strings
		for (String value : values) {
			
			//Skip Strings starting with letter p
			char[] an = value.toCharArray();
			//"pig" {'p','i','g'}
			if (an[0] == 'p')
				continue;
			System.out.println(value);
		
			
		}

	}

}

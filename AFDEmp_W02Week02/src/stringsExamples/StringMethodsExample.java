// Examples of String methods


package stringsExamples;


public class StringMethodsExample {

	public static void main(String[] args) {
		
		String s = "Strings are immutable";
		s = s.concat(" all the time"); //equal to s  = s + " all the time"
		System.out.println(s);
		System.out.println("Length: " + s.length());
		System.out.println();
		
		for (String retval: s.split(" ")) {
			System.out.println(retval);
		}
		
		String str2 = new String("Welcome-to-java-tutorial");
		
		System.out.println();
		System.out.println();
		System.out.println("Split to two pieces  ");
		
		for (String retval: str2.split("-", 2)) {
			System.out.println(retval+"   ");
		}

		System.out.println();
		System.out.println();
		System.out.println("Split to three pieces: ");
		
		for (String retval: str2.split("-", 3)) {
			System.out.println(retval+"   ");
		}
		
		System.out.println();
		System.out.println();
		System.out.println("Split: ");
		
		for (String retval: str2.split("-", 0)) {
			System.out.println(retval+"   ");
		}
		
		System.out.println();
		System.out.println();
		System.out.println(str2.substring(1, 10));
	}

}

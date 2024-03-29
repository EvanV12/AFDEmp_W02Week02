// Compare String values to String memory position


package stringsExamples;


public class CompareStringsWithEquals {

	public static void main(String[] args) {
		String Str1 = new String("This is really not immutable");
		String Str2 = Str1;
		String Str3 = new String("This is really not immutable");
		boolean retVal;
		
		retVal = Str1.equals(Str2);
		System.out.println("Returned value " + retVal);
		
		retVal = Str1.equals(Str3);
		System.out.println("Returned value " + retVal);
		
		retVal = (Str1 == Str3);
		System.out.println("Returned value " + retVal);

	}

}

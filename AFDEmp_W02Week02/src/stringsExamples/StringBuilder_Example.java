// Reverses a sentence


package stringsExamples;


import java.util.Scanner;

public class StringBuilder_Example {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String s = "This is an example";
		String s2;

		
		System.out.println("\"" + s + "\" will be reversed.");

		StringBuilder sb = new StringBuilder();

		for (int i = s.length() - 1; i >= 0; i--) {
			sb.append(s.charAt(i));
		}

		String out = sb.toString();

		System.out.println("Result is: " + out); //elpmaxe na si sihT
		System.out.println();
		
		
		System.out.println("Now you try. Enter a sentence.");
		s2 = input.nextLine();
		
		System.out.println();
		System.out.println("\"" + s2 + "\" will be reversed.");
		
		StringBuilder sb2 = new StringBuilder();

		for (int i = s2.length() - 1; i >= 0; i--) {
			sb2.append(s2.charAt(i));
		}
		
		String out2 = sb2.toString();

		System.out.println("Result is: " + out2);

		
		input.close();
		
	}

}

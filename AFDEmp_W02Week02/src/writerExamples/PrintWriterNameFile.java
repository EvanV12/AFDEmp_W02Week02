// Takes info and prints them to external file


package writerExamples;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Scanner;

// THIS WORKS!!!

public class PrintWriterNameFile {

	public static void main(String[] args) {
		
		String name;
		String surname;
		String age;
		String color;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("What is your name?");
		name = scanner.nextLine();
		
		System.out.println("What is your surname?");
		surname = scanner.nextLine();
		
		System.out.println("How old are you?");
		age = scanner.nextLine();
		
		System.out.println("What is your favorite color?");
		color = scanner.nextLine();
		
		System.out.println();
		System.out.println("Your full name is " + name + " " + surname + ".");
		System.out.println("You are " + age + " years old and your favorite color is " + color + ".");
		System.out.println();
		System.out.println("Your info has been saved in an external txt file!");
		
		scanner.close();
		
		
		
		PrintWriter writer;
		
		try {
			writer = new PrintWriter("NameFile-file-name.txt", "UTF-8");
			writer.println("Your name is: " + name);
			writer.println("Your surname is: " + surname);
			writer.println("Your age is: " + age);
			writer.println("Your favorite color is: " + color);
			writer.close();
		}
		catch (UnsupportedEncodingException | FileNotFoundException ex) {
		//	Logger.getLogger(IOCode.class.getName()).log(level.SEVERE, null, ex);
		}
	
		/* String line = null;
		BufferedReader br = new BufferedReader(new FileReader("the-file-name.txt"));
		while ((line = br.readLine()) !=null)
			System.out.println(line);
		br.close();
		*/
	}
}

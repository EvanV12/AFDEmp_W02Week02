//Saves info to an external file


package writerExamples;

//import com.sun.istack.internal.logging.Logger;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.logging.Level;
import java.util.logging.Logger;




public class PrintWriterTest {

	public static void main(String[] args) {
		
		PrintWriter writer;
		
		try {
			writer = new PrintWriter("the-file-name.txt", "UTF-8");
			writer.println("The first line");
			writer.println("The second line");
			writer.close();
			
			System.out.println("File successfully created.");
		}
		
		catch (Exception ex) {
		//catch (UnsupportedEncodingException | FileNotFoundException ex) {
		//	Logger.getLogger(PrintWriter.class.getName().log(level.SEVERE, null, ex));
		}

	}

}

//Writes to an external file


package writerExamples;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class IOCodePrintWriter {

	public static void main(String[] args) {
		PrintWriter writer;
		try {
			writer = new PrintWriter("the-file-name.txt", "UTF-8");
			writer.println("The first line");
			writer.println("The second line");
			writer.println("The third line");
			writer.close();
			
			System.out.println("File successfully created.");
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

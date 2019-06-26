package incompleteExamples;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class ArrayDD {

	public static void main(String[] args) {

		//	int[][] counts = new int [5][5];

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter number of rows and columns: ");
		int num00 = scanner.nextInt();

		int[][] counts = new int [num00][num00];

		System.out.println("Let's fill the first row.");

		for (int i=0; i<num00; i++) {
			System.out.print("Enter number " + (i+1) + ": ");
			int num = scanner.nextInt();	
			counts [0][i] = num;
		}

		System.out.println("Let's fill the second row.");

		for (int i=0; i<num00; i++) {
			System.out.print("Enter number " + (i+1) + ": ");
			int num = scanner.nextInt();	
			counts [1][i] = num;
		}


		/*
	counts[0][0] = num11;
	counts[0][1] = num12;
	counts[0][2] = num13;
	counts[0][3] = num14;
	counts[0][4] = num15;
		 */


		//counts [0][0] = num;
		/*	
	int[][] counts = 
		{ {1,1,1,1,1}, {2,2,2,2,2}, {3,3,3,3,3}, {4,4,4,4,4},{5,5,5,5,5} };
		 */	

		for (int row = 0; row < counts.length; row++) {
			for (int col = 0; col < counts[0].length; col++) {
				System.out.printf(counts[row][col] + "\t");
			}

			System.out.println();

			PrintWriter writer;

			try {
				writer = new PrintWriter("ArrayDD.txt", "UTF-8");
				writer.println(counts);
				//writer.println(surname);
				//writer.println(age);
				//writer.println(color);
				//writer.close();
			}

			catch (UnsupportedEncodingException | FileNotFoundException ex) {
				//	Logger.getLogger(IOCode.class.getName()).log(level.SEVERE, null, ex);


			}

		}

	}

}


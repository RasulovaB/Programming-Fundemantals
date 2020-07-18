/** FILENAME: [FileI/O]
 * AUTHOR: [Rasulova Bakhora]
 * COURSE: ITP 120
 * PURPOSE: [Create text file]
 * CREATEDATE: [04/16/2020]**/


import java.io.FileNotFoundException;
import java.lang.SecurityException;
import java.util.Formatter;
import java.util.FormatterClosedException;
//import java.util.NoSuchElementException;
//import java.util.Scanner;

public class FileInput {
	public static void main(String[] args) {
		

		try (Formatter output = new Formatter("numbers.txt"))
		{
			for(int i =0; i <=100; i++) {
				output.format(" %d%n", i );
			}

		}
		catch (SecurityException | FileNotFoundException |
				FormatterClosedException e)
		{
			e.printStackTrace();
			System.exit(1); // terminate the program
		}
	}
}

	 

	 


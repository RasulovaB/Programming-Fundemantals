/** FILENAME: [FileI/O]
 * AUTHOR: [Rasulova Bakhora]
 * COURSE: ITP 120
 * PURPOSE: [Read text file]
 * CREATEDATE: [04/16/2020]**/

import java.io.IOException;
import java.lang.IllegalStateException;
//import java.nio.file.Files;
//import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ReadNumber 
{	
	public static void main(String[] args) 
	{
		int sum = 0;
		// open number.txt, read its contents and close the file
		try(Scanner input = new Scanner(Paths.get("numbers.txt"))) {
			

			// read record from file
			while (input.hasNext()) 
			{ // while there is more to read
				sum = sum + input.nextInt();         
			}       
		} 
		catch (IOException | NoSuchElementException | 
				IllegalStateException e) {
			e.printStackTrace();
		}
		
		System.out.println("The sum is: " + sum);
	} 

}

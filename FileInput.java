/** FILENAME: [File I/O]
 * AUTHOR: [Rasulova Bakhora]
 * PURPOSE: [Create/read text file, output matching numbers]**/


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.SecurityException;
import java.util.Formatter;
import java.util.FormatterClosedException;


public class FileInput 
{
	public static void main(String[] args) throws IOException 
	{

		try (Formatter output = new Formatter("exam1.txt"))
		{
			for(int i =1; i <=100; i++) 
			{
				int max = 20;
				int min = 1;
				int y = (int)(Math.random()*((max+min)+1))+min;
				output.format(" %d%n", y );
			}
			output.close();
		}
		catch (SecurityException | FileNotFoundException |
				FormatterClosedException e)
		{
			e.printStackTrace();
			System.exit(1); // terminate the program
		}


		try (Formatter output = new Formatter("exam2.txt"))
		{
			for(int j =1; j <=100; j++) 
			{
				int max = 20;
				int min = 1;
				int x = (int)(Math.random()*((max+min)+1))+min;
				output.format(" %d%n", x );
			}
			output.close();
		}
		catch (SecurityException | FileNotFoundException |
				FormatterClosedException e)
		{
			e.printStackTrace();
			System.exit(1); // terminate the program
		}

		//read file


		BufferedReader examOne = new BufferedReader(new FileReader("exam1.txt"));

		BufferedReader examTwo = new BufferedReader(new FileReader("exam2.txt"));

		String lineOne = "";

		String lineTwo = "";



		while(((lineOne = examOne.readLine()) != null) && ((lineTwo = examTwo.readLine()) != null))
		{
			if(lineOne.equalsIgnoreCase(lineTwo))
			{
				System.out.println("Matched numbers: " + lineOne + " -->" + lineTwo);
			}

		}


		examOne.close();

		examTwo.close();



	}//end of main
}//end of class

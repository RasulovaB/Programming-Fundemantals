/** FILENAME: [SEARCH ARRAY]
 * AUTHOR: [Rasulova Bakhora]
 * PURPOSE: [Search Array]**/

import java.util.Scanner;

public class arrayExrc {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner (System.in);
		int userNumber = 0;
		int maxNumber = 7;
		boolean flag = false;
		int counter = 0;
		// initializer list specifies the initial value for each element
		int[] number = {32, 27, 64, 18, 95};         

		System.out.print("Welcome! This program will give you 7 tries\nto test and find the number.");
		System.out.print("\nProvide first number: ");
		userNumber = input.nextInt();


		//FIRST LOOP TO RUN PROGRAM SEVEN TIMES		
		for (int i = 0; i < maxNumber; i++) 
		{  
			//SECOND LOOP TO RUN AND SEARCH THROUGH ARRAY 
			for ( counter = 0; counter < number.length; counter++) 
			{
				if (number[counter] == userNumber) 
				{
					flag = true;
					break;
				}
				else
				{
					flag = false;

				}

			}//end of second for loop
			if (flag == true) 
			{
				System.out.printf("%8d%nThe number is found",  number[counter]);
			}
			else
			{
				System.out.print("The number is not found, sorry try again ");
			}//END OF NUMBER NOT FOUND

			//USER INPUT
			System.out.print("\nEnter the number: "); 
			userNumber = input.nextInt();
		}//end of first for loop
		input.close();    
	}//end of main


}//end of class

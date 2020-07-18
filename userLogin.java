/** FILENAME: [Assgm 5]
 * AUTHOR: [Bakhora Rasulova]
 * PURPOSE: [USER LOGIN]**/

import java.util.Scanner;
public class UserLogin 
{

	public static void main(String[] args) 
	{
		//declare and initialize
		Scanner input = new Scanner (System.in);
		String[] loginID = {"Bob", "Alex", "Bill"};
		String[] passwords = {"blue", "red", "green"};
		boolean validLogin = false;
		boolean validPassword = false;
		int idPosition = -1;
		String loginName = "";
		String loginPassword = "";

		//run while loop to validate user login id
		while(validLogin != true)
		{
			System.out.println("Enter user id name: ");
			loginName = input.nextLine();

			for(int index = 0; index < loginID.length; index++)
			{
				if(loginName.equals(loginID[index]))
				{
					System.out.println("We Found You! Proceed to your password ");

					validLogin = true;
					idPosition = index;

				}//end of if statement
				
			}//end of for loop

			if (!validLogin)
			{
				System.out.println("ERROR - Your USER ID does not match.\n");

			}//end of if

		}//end of while loop

		//run while loop to validate password
		while(validPassword != true)
		{
			System.out.println("\nEnter user password: ");
			loginPassword = input.nextLine();

			for(idPosition = 0;  idPosition< passwords.length; idPosition++)
			{
				if(loginName.equals(loginID[idPosition]) && loginPassword.equals(passwords[idPosition]))
				{

					System.out.println("You are Signed In! Welcome! ");
					validPassword = true;

				}//end of if statement

			}//end of for loop

			if (!validPassword)
			{
				System.out.println("ERROR - Your PASSWORD does not match. ");

			}//end of if

		}//end of while loop

		input.close();

	}//end of main

}//end of class

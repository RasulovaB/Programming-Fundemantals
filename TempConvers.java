/** FILENAME: [TempConverter]
 * AUTHOR: [Rasulova Bakhora]
 * PURPOSE: [To convert temp]**/

import java.util.Scanner;

public class Temperature 
{
	//CLASS CONSTANTS - GLOBAL VALUES
	public static final double WHOLE_NUMBER = 32.0;
	public static final double FRACTION = 1.8;

	public static void main(String[] args) 
	{
		//declare and initialize all local variables and constants
		Scanner input = new Scanner (System.in);

		char menuSelection = ' ';

		//Prime read of menuSelection
		menuSelection = displayMenu(input);

		//run while not quit loop
		while (menuSelection != 'Q')
		{
			if(menuSelection == 'C')
			{   
				displayCelsiusResult(input, WHOLE_NUMBER, FRACTION );

			}//end of if statement
			else
			{   
				displayFahrenheitResult(input, WHOLE_NUMBER, FRACTION );

			}//end of else statement
			
			menuSelection = displayMenu(input);	

		}//end of run-while not quit loop

		displayFarewellMessage();

	}//end of main method

	//display main menu
	public static char displayMenu( Scanner borrowedInput)
	{
		char localMenuSelection = ' ';

		System.out.println();
		System.out.println("Welcome to our program!");	
		System.out.println("\nSelect from our menu*: ");	
		System.out.println("_____________________________________________________________\n");
		System.out.printf("\n%-1s%14s\n","[F]", "- CONVERT TO FAHRENHEIT");
		System.out.printf("\n%-1s%14s\n","[C]", "- CONVERT TO CELSIUS");
		System.out.printf("\n%-1s%17s\n","[Q]", "- TO QUIT PROGRAM");
		System.out.println("_____________________________________________________________\n");
		System.out.println("*press on the keyboard f, c, or q + enter");
		System.out.print("\nPlease enter your selection here: ");

		borrowedInput.nextLine();
		localMenuSelection = borrowedInput.nextLine().toUpperCase().charAt(0);

		return localMenuSelection;
	}//END OF displayMainMenu

	//method 1 convert to C
	public static double converToCelsius(Scanner borrowedInput, double WHOLE_NUMBER, double FRACTION)
	{
		double fahrenheit = 0.0;
		double celsius = 0.0;

		System.out.print("\nEnter your temperature in Fahrenheit: ");

		fahrenheit = borrowedInput.nextDouble();

		celsius = (fahrenheit - WHOLE_NUMBER)/FRACTION;

		return celsius;

	}//end of convert to celsius 

	//method 2 convert to F
	public static double converToFahrenheit(Scanner borrowedInput, double WHOLE_NUMBER, double FRACTION)
	{
		double celsius = 0.0;
		double fahrenheit = 0.0;

		System.out.print("\nEnter your temperature in Celsius: ");

		celsius = borrowedInput.nextDouble();

		fahrenheit = (celsius * FRACTION) + WHOLE_NUMBER;

		return fahrenheit;

	}//end of convert to fahrenheit

	//displayFahrenheitReslut
	public static void displayFahrenheitResult(Scanner borrowedInput, double WHOLE_NUMBER, double FRACTION )
	{
		double tempF = 0.0;
		
		tempF = converToFahrenheit(borrowedInput, WHOLE_NUMBER, FRACTION);
		
		//display the result in fahrenheit
		System.out.println("********************************");
		System.out.println("\nThe result in Fahrenheit: " + tempF);
		System.out.println("\n********************************");

	}//end of fahrenheit result

	//displayCelsiusResult
	public static void displayCelsiusResult(Scanner borrowedInput, double WHOLE_NUMBER, double FRACTION )
	{
		double tempC = 0.0;
		
		tempC = converToCelsius(borrowedInput, WHOLE_NUMBER, FRACTION);
		
		//display the result in celsius
		System.out.println("********************************");
		System.out.println("\nThe result in Celsius: " + tempC);
		System.out.println("\n********************************");

	}//end of celsius result


	//displayFarewellMessage
	public static void displayFarewellMessage()
	{
		System.out.println("\nThank you, for using our program.");
		System.out.printf("%-10s","It was our pleasure to assist you!");
		
	}//end of displayFarewellMessage

}//end of class

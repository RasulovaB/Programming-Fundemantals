/** FILENAME: [Program C]
 * AUTHOR: [Bakhora Rasulova]
 * PURPOSE: [environmental control system for a house]**/




package program;

import java.util.Scanner;

public class ProgramC {

	public static void main(String[] args) {
		//declare and initialize all local variables and constants
		Scanner input = new Scanner (System.in);
		boolean doorUnlocked = false;
		boolean lightOn = false;
		boolean heatOn = false;
		boolean coolingOn = false;
		int currentTemp = 70;
		char menuSelection = ' ';
		String answerInput = "";
		int desiredTemp = 0;
		String lightInput = "";

		//Prime read of menuSelection
		menuSelection = validateMainMenu(input);

		//run while not quit loop
		while (menuSelection != 'N')
		{
			System.out.println("\n Unlock the door?");

			answerInput = input.nextLine();

			if (answerInput.equals("yes"))

			{
				doorUnlocked = true;


			}
			else
			{
				doorUnlocked = false;
			}

			System.out.println("\n Turn on the light? ");
			lightInput = input.nextLine();

			if (lightInput.equals("yes"))

			{
				lightOn = true;

			}
			else
			{
				lightOn = false;
			}

			System.out.println("\n Desired temp value: ");
			desiredTemp = input.nextInt();

			if (desiredTemp < currentTemp)

			{
				coolingOn = true;
				heatOn = false;
			}

			else if (desiredTemp > currentTemp)
			{
				heatOn = true;
				coolingOn = false;
			}

			//display door unlock	
			if (doorUnlocked)	     
			{
				System.out.println("\n The state of the door is UNLOCKED ");
			}
			else
			{
				System.out.println("\n The state of the door is LOCKED ");
			}

			//display light on
			if(lightOn)
			{
				System.out.println("\n The state of the lights is ON ");
			}
			else
			{
				System.out.println("\n The state of the lights is OFF ");
			}

			//display desired temperature
			if (desiredTemp == currentTemp)
			{
				System.out.println("\n The current Temp will not be changed.");
				System.out.println("\n It'll remain the same at: " + currentTemp);
			}
			else
			{
				//display if AC is on
				if(coolingOn)
				{
					System.out.println("\n The state of the AC is ON ");
				    System.out.println("\n The desired temp is " + desiredTemp);
				}
				//display if Heater is on
				if(heatOn)
				{
					System.out.println("\n The state of the heater is ON ");
					System.out.println("\n The desired temp is " + desiredTemp);
				}
			}

			System.out.println("\n would you like to make changes? ");


			//Call validateMainMenu 
			menuSelection = validateMainMenu(input );			

		}//end of while not Quit

		//call display farewell message
		displayFarewellMessage();

	}//end of main method




	//validate main menu input
	public static char validateMainMenu(Scanner borrowedInput)
	{
		char localMenuSelection = ' ';
		//call display main menu
		displayMainMenu();

		//Prime read selection
		borrowedInput.nextLine();
		localMenuSelection = borrowedInput.nextLine().toUpperCase().charAt(0);
		//must validate input
		while (localMenuSelection != 'Y' && localMenuSelection != 'N')
		{
			System.out.println("*************************************************************");	
			System.out.printf("%-20s");	
			System.out.println("\nPlease try again. ");
			System.out.println("*************************************************************");
			//call displayMainMenu
			displayMainMenu();
			//Modify LCV
			localMenuSelection = borrowedInput.nextLine().toUpperCase().charAt(0);
		}//end of validate input
		return localMenuSelection;
	}//end of validateMainMenu

	//display main menu
	public static void displayMainMenu()
	{
		System.out.println();	

		System.out.println("\nCHOOSE FROM THE MENU AND ENTER Y OR N: ");
		System.out.println("_____________________________________________________________\n");

		System.out.printf("\n%-1s%14s\n","[Y]", "CHANGE ENVIRONMENTAL SYSTEM");
		System.out.printf("\n%-1s%12s\n","[N]", "QUIT PROGRAM");
		System.out.println("_____________________________________________________________\n");
		System.out.print("\nPlease enter your selection here: ");

	}//END OF displayMainMenu

	//displayFarewellMessage
	public static void displayFarewellMessage()
	{
		System.out.println("\nThank you, for using our program.");
		System.out.println("\nIt was our pleasure to assist you!");
	}//end of displayFarewellMessage




}//end of program c class

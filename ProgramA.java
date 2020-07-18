/** FILENAME: [Program A]
 * AUTHOR: [Bakhora Rasulova]
 * PURPOSE: [Search a flight number]**/

package exam;

import java.util.Scanner;
public class ProgramA {

	public static void main(String[] args) {
		//declare and initialize
		Scanner input = new Scanner (System.in);
		int[] flight = {500, 250, 100, 125, 350};
		String[] departureTime = {"10:00 am", "11:00 am", "11:30 am", "12:34 pm", "2:30 pm"};
		String[] arrivalTime = {"11:45 am", "12:15 am", "12:45 am", "3:30 pm", "5:45 pm"};
		boolean validFlight = false;

		//run while loop to validate user login id
		while(validFlight != true)
		{
			System.out.println("Enter flight number: ");
			int flightInput = input.nextInt();

			for(int index = 0; index < flight.length; index++)
			{
				if(flightInput == flight[index])
				{
					System.out.println("We Found Your Flight! ");
					System.out.println("Your departure time is at: " + departureTime[index]);
					System.out.println("and Arrival at: "+ arrivalTime[index]);

					validFlight = true;
					

				}//end of if statement

			}//end of for loop

			if (!validFlight)
			{
				System.out.println("Sorry, your flight number does not exist.\n");

			}//end of if

		}//end of while loop
		
		input.close();


	}//end of main method

}//end of ProgramA class

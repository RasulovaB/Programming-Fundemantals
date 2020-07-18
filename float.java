/** FILENAME: [Math.min]
 * AUTHOR: [Rasulova Bakhora]
 * PURPOSE: [To find smallest number]**/

import java.util.Scanner;

public class Float 
{

	public static void main(String[] args) 
	{
		//declare and initialize all local variables and constants
		Scanner input = new Scanner(System.in);
		double numberOne = 0.0;
		double numberTwo = 0.0;
		double numberThree = 0.0;
		double smallestValue = 0.0;

		System.out.println("Enter the First number: ");
		numberOne = input.nextDouble();

		System.out.print("Enter the Second number: ");
		numberTwo = input.nextDouble();

		System.out.print("Enter the Third number: ");
		numberThree = input.nextDouble();

		//call method and assign to variable
		smallestValue = minimum3(numberOne, numberTwo, numberThree);

		System.out.print("\nThe smallest number is " + smallestValue);

		input.close();
	}//end of main method

	//method minimum3 finds smallest number
	public static double minimum3(double numberOne, double numberTwo, double numberThree)
	{
		return Math.min(Math.min(numberOne, numberTwo), numberThree);
		
	}//end of minimum3	

}//end of class

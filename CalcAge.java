/**FILENAME: [CalcAge]
 * AUTHOR:   [Rasulova Bakhora]
 * PURPOSE:   [To calculate the age]**/



import java.util.Scanner;

public class CalcAge {
	
    //main method
	public static void main(String[] args) {
		
		//declare and initialize all local variables and constants
		int CURRENT_YEAR = 2020;
		int CURRENT_MONTH = 02;
		int CURRENT_DAY = 14;
		
		//create a scanner to obtain input from the command window
		Scanner input = new Scanner (System.in);
		String firstName = "";
		String lastName = "";
		int birthYear = 0;
		int birthMonth = 0;
		int birthDay = 0;
		int approxYear = 0;
		int approxMonth = 0;
		int approxDay = 0;
		//create an array in order to have the right number of days in the month 
		int month[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }; 
		
		//prompt, and save input to firstName
		System.out.println("Enter your first name: ");
		firstName = input.next();
		//prompt, and save input to lastName
		System.out.println("Enter your last name: ");
		lastName = input.next();
		//Display name and todays date
		System.out.println("Welcome " + firstName +" " + lastName + ", Today is "+ 
		CURRENT_YEAR + "/" + CURRENT_MONTH + "/" + CURRENT_DAY +"\n");
		//prompt, and save input to birthYear
		System.out.println("Enter your year of birth: ");
		birthYear = input.nextInt();
		//prompt, and save input to birthMonth
		System.out.println("Enter your month of birth: ");
		birthMonth = input.nextInt();
		//prompt, and save input to birthDay
		System.out.println("Enter your day of birth: ");
		birthDay = input.nextInt();
		
		// if birthDay is more than CURRENT_DAY, then do not count this month 
      // and add 30 to the date so as to subtract the date and get the remaining days 
		if (birthDay > CURRENT_DAY) {
			
			CURRENT_MONTH = CURRENT_MONTH - 1;
			CURRENT_DAY = CURRENT_DAY + month[birthMonth - 1];
			
		}//END OF IF STATEMENT
		
		// if birthMonth more than CURRENT_MONTH, then do not count this year and add  
      // 12 to the month so that we can subtract and find out the difference 
		if (birthMonth > CURRENT_MONTH) {
			
			CURRENT_YEAR = CURRENT_YEAR - 1;
			CURRENT_MONTH = CURRENT_MONTH + 12;
			
		}//END OF IF STATEMENT
		
		//calculate day, month, year
		approxYear = CURRENT_YEAR - birthYear;
		approxMonth = CURRENT_MONTH - birthMonth;
		approxDay = CURRENT_DAY - birthDay;
		
		//print full name and approximate age
		System.out.println(firstName +" "+ lastName +" " + "here is your calculated age: "); 
		System.out.println("Years: " + approxYear + " | " + "Month: " + approxMonth + " | " + "Day: " + approxDay );
		System.out.printf("\n%-10s%s%s\n","Thank you, ",firstName,", for using our program.");
		System.out.printf("%-10s","It was our pleasure to assist you!");
		
		input.close();
		
	}// end of main method

}//end of class

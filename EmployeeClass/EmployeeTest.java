/** FILENAME: [EmployeeSalary]
 * AUTHOR: [Rasulova Bakhora]
 * PURPOSE: [To calculate salary after raise]**/

//import java.util.Scanner;

public class EmployeeTest 
{

	public static void main(String[] args) 
	{

		//declare and initialize all local variables and constants
		//		 Scanner input = new Scanner (System.in);
		//		 String firstName =  "";
		//		 String lastName =  "";
		//		 double monthlySalary = 0.0;
		//		 
		//		 System.out.print("\nEnter your first name here: ");
		//	     firstName = input.next();
		//	     
		//	     System.out.print("\nEnter your last name here: ");
		//	     lastName = input.next();
		//	     
		//	     System.out.print("\nEnter your monthly salary here: ");
		//	     monthlySalary = input.nextDouble();
		//	     
		//	     Employee salary = new Employee(firstName, lastName, monthlySalary);
		
		//object number 1
		Employee salary1 = new Employee("Jane", "Green", 100.0);
		//object number 2
		Employee salary2 = new Employee("Elon", "Musk", 50.0);
		//display salary for object number1
		System.out.printf("%s%6s's monthly salary is: %7.1f%n", 
				salary1.getFirstName(), salary1.getLastName(), salary1.getMonthlySalary()); 
		//display salary for object number2
		System.out.printf("\n%s%5s's monthly salary is: %8.1f%n", 
				salary2.getFirstName(), salary2.getLastName(), salary2.getMonthlySalary()); 
		//display after 10% raise for salary 1
		System.out.printf("\n%s%-2s%12.1f\n","AFTER 10% RAISE:           ", salary1.getFirstName(), salary1.getRaise());
		//display after 10% raise for salary 2
		System.out.printf("\n%s%-2s%12.1f\n","AFTER 10% RAISE:           ", salary2.getFirstName(), salary2.getRaise());

	}//end of main class

}//end of EmployeeTest class

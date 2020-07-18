/** FILENAME: [EmployeeSalary]
 * AUTHOR: [Rasulova Bakhora]
 * PURPOSE: [To calculate salary after raise]**/

public class Employee 
{
	// declare and initialize class constants attributes
	private final double RAISE = 1.1;
	private final double ZERO = 0.0;
	//declare and initialize attributes
	private String firstName = "";
	private String lastName = "";
	private double monthlySalary = 0.0;
	private double afterRaise = 0.0;

	// constructor initializes instance variables
	public Employee(String firstName, String lastName, double monthlySalary) 
	{
		this.firstName = firstName;
		this.lastName = lastName;
		// validate that average is > 0.0
		if (monthlySalary > ZERO) 
		{
			this.monthlySalary = monthlySalary;
		}
	}

	// sets the Employee's first name
	public void setFirstName(String firstName) 
	{
		this.firstName = firstName; 
	}

	// retrieves the Student's name
	public String getFirstName() 
	{
		return firstName;
	}

	// sets the Employee's last name
	public void setLastName(String lastName) 
	{
		this.lastName = lastName; 
	}

	// retrieves the Student's name
	public String getLastName() 
	{
		return lastName;
	}

	//set the Employee's monthly salary
	public void setMonthlySalary(double monthlySalary) 
	{
		if (monthlySalary > ZERO)
		{
			this.monthlySalary = monthlySalary;
		}
	}

	// retrieves the Student's name
	public double getMonthlySalary() 
	{
		return monthlySalary;
	}

	//retrieve calculated salary after raise
	public double getRaise()
	{
		afterRaise = getMonthlySalary() * RAISE;
		return  afterRaise;
	}


}//end of class

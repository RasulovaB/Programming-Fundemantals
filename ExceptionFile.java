/** FILENAME: [Test II (Program 2)]
 * AUTHOR: [Rasulova Bakhora]
 * PURPOSE: [exception files]**/

public class ExceptionFile {

	public static void main(String[] args) {

		//arithmeticException
		try 
		{
			int num1=30, num2=0;
			int output=num1/num2;
			System.out.println ("Result: "+output);
		}

		catch (ArithmeticException arithmeticException) 
		{              
			System.out.printf("Zero is an invalid denominator. Please change num2 variable's value.%n%n");   
		}            


		//arrayindexOutOfBound
		try 
		{
			int a[]=new int[10];
			a[10] = 9;
			System.out.println ("Result: "+ a);
		}
		catch(ArrayIndexOutOfBoundsException e) 
		{
			System.out.printf("Array index is out of bounds. It should be 0. Please check your code.%n%n");   
		}
		
		
		//numberFormatException
		try 
		{
			int num =Integer.parseInt ("XYZ") ;
			System.out.println(num);
		}
		catch(NumberFormatException e){
			System.out.printf("Invalid data is used and it is not type of int. Please check variable num.%n%n"); 
		}

	}//end of main

}//end of class

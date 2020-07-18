/** FILENAME: [ARRAY]
 * AUTHOR: [Rasulova Bakhora]
 * PURPOSE: [SORT AND COMPARE ARRAY]**/



import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		//declare and initialize
		int[] numberOne = {500, 250, 100, 125, 350};
		int[] numberTwo = {5, 3, 4, 2, 1};
		
		
		displayArray(numberOne, numberTwo);
		
		sortArray(numberOne, numberTwo);
		
		compareEquality(numberOne, numberTwo);
		
		largestValue(numberOne, numberTwo);
		
	}//END OF MAIN METHOD
	
	// output values in each array
	   public static void displayArray(int[] borrowedNumberOne, int[] borrowedNumberTwo) 
	   {
		   System.out.printf("%s%13s%n", "ARRAY ONE", "ARRAY TWO\n" );
		   for (int counter = 0; counter < borrowedNumberOne.length && counter < borrowedNumberTwo.length; counter++)
			{
			System.out.printf("%d%10d%n", borrowedNumberOne[counter], borrowedNumberTwo[counter]);
			}

	   } 
	   //sort array
	   public static void sortArray(int[] borrowedNumberOne, int[] borrowedNumberTwo) 
	   {
		   System.out.printf("\n%s%20s%n", "SORTED ARRAY ONE", "SORTED ARRAY TWO\n" );
		   Arrays.sort(borrowedNumberOne);
		   Arrays.sort(borrowedNumberTwo);
		   for (int counter = 0; counter < borrowedNumberOne.length && counter < borrowedNumberTwo.length; counter++)
			{
			System.out.printf("%d%17d%n", borrowedNumberOne[counter], borrowedNumberTwo[counter]);
			}

	   }
	   //compare arrays
	  public static void compareEquality(int[] borrowedNumberOne, int[] borrowedNumberTwo)
	  {
		  System.out.println("\nAre arrays equal?");
	      // compare intArray and intArrayCopy for equality
	      boolean compare = Arrays.equals(borrowedNumberOne, borrowedNumberTwo);
	      System.out.printf("%nARRAY ONE %s ARRAY TWO%n", 
	         (compare ? "<<EQUAL>>" : "<<NOT EQUAL>>"));
	  }
	  
	// find maximum value
	   public static void largestValue(int[] borrowedNumberOne, int[] borrowedNumberTwo) 
	   {
	      
                int maxOne = borrowedNumberOne[4];
                int maxTwo = borrowedNumberTwo[4];
	      
	            if (maxOne > maxTwo) 
	            {
	            	System.out.println("\nARRAY ONE value is " + borrowedNumberOne[4] + " and it's the largest value"); 
	            } 
	            else 
	            {
	            	System.out.println("\nARRAY TWO value is " + borrowedNumberTwo[4] + " and it's the largest value");
	            }
	          
	      } 


}//ENDF OF MAIN CLASS

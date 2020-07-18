/** FILENAME: [SwitchCase]
 * AUTHOR: [Rasulova Bakhora]
 * PURPOSE: [Practice switch case]**/



public class SwitchCase {

	public static void main(String[] args) 
	{
		//run for loop until 12 days
		for (int day = 1; day <= 12; day++) 
		{
			//first switch prints days
			switch (day)
			{
			//display first day 
			case 1: 
				System.out.println("On the first day of Christmas\nmy true love sent to me:\n");
				//exit switch, go back to loop
				break;
			case 2: 
				System.out.println("On the second day of Christmas\nmy true love sent to me:\n");
				break;	
			case 3: 
				System.out.println("On the third day of Christmas\nmy true love sent to me:\n");
				break;
			case 4: 
				System.out.println("On the fourth day of Christmas\nmy true love sent to me:\n");
				break;
			case 5: 
				System.out.println("On the fifth day of Christmas\nmy true love sent to me:\n");
				break;	
			case 6: 
				System.out.println("On the sixth day of Christmas\nmy true love sent to me:\n");
				break;
			case 7: 
				System.out.println("On the seventh day of Christmas\nmy true love sent to me:\n");
				break;	
			case 8: 
				System.out.println("On the eighth day of Christmas\nmy true love sent to me:\n");
				break;
			case 9: 
				System.out.println("On the ninth day of Christmas\nmy true love sent to me:\n");
				break;
			case 10: 
				System.out.println("On the tenth day of Christmas\nmy true love sent to me:\n");
				break;
			case 11: 
				System.out.println("On the eleventh day of Christmas\nmy true love sent to me:\n");
				break;
			case 12: 
				System.out.println("On the twelfth day of Christmas\nmy true love sent to me:\n");
				break;	
				
			}//end of first switch
			
			//second switch prints the remainder of each verse
			switch(day)
			{
			case 12: 
				System.out.println("12 Drummers Drumming\n Eleven Pipers Piping\n Ten Lords a Leaping\n Nine Ladies Dancing\n Eight Maids a Milking\n Seven Swans a Swimming\n Six Geese a Laying\n Five Golden Rings\n Four Calling Birds\n Three French Hens\n Two Turtle Doves\n and a Partridge in a Pear Tree\n" + "");
				break;
			case 11: 
				System.out.println("Eleven Pipers Piping\n Ten Lords a Leaping\n Nine Ladies Dancing\n Eight Maids a Milking\n Seven Swans a Swimming\n Six Geese a Laying\n Five Golden Rings\n Four Calling Birds\n Three French Hens\n Two Turtle Doves\n and a Partridge in a Pear Tree\n");
				break;
			case 10: 
				System.out.println("Ten Lords a Leaping\n Nine Ladies Dancing\n Eight Maids a Milking\n Seven Swans a Swimming\n Six Geese a Laying\n Five Golden Rings\n Four Calling Birds\n Three French Hens\n Two Turtle Doves\n and a Partridge in a Pear Tree\n");
				break;
			case 9: 
				System.out.println("Nine Ladies Dancing\n Eight Maids a Milking\n Seven Swans a Swimming\n Six Geese a Laying\n Five Golden Rings\n Four Calling Birds\n Three French Hens\n Two Turtle Doves\n and a Partridge in a Pear Tree\n");
				break;
			case 8: 
				System.out.println("Eight Maids a Milking\n Seven Swans a Swimming\n Six Geese a Laying\n Five Golden Rings\n Four Calling Birds\n Three French Hens\n Two Turtle Doves\n and a Partridge in a Pear Tree\n");
				break;
			case 7: 
				System.out.println("Seven Swans a Swimming\n Six Geese a Laying\n Five Golden Rings\n Four Calling Birds\n Three French Hens\n Two Turtle Doves\n and a Partridge in a Pear Tree\n");
				break;
			case 6: 
				System.out.println("Six Geese a Laying\n Five Golden Rings\n Four Calling Birds\n Three French Hens\n Two Turtle Doves\n and a Partridge in a Pear Tree\n");
				break;
			case 5: 
				System.out.println("Five Golden Rings\n Four Calling Birds\n Three French Hens\n Two Turtle Doves\n and a Partridge in a Pear Tree\n");
				break;
			case 4: 
				System.out.println("Four Calling Birds\n Three French Hens\n Two Turtle Doves\n and a Partridge in a Pear Tree\n");
				break;
			case 3: 
				System.out.println("Three French Hens\n Two Turtle Doves\n and a Partridge in a Pear Tree\n");
				break;
			case 2: 
				System.out.println("Two Turtle Doves\nand a Partridge in a Pear Tree\n");
				break;
			case 1: 
				System.out.println("Partridge in a Pear Tree\n\n");
				break;	
			}//end of second switch
		}//end of for loop

	}//end of main method

}//end of class

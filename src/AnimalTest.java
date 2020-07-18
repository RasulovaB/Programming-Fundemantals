
public class AnimalTest {

	public static void main(String[] args) 
	{
		//create SubClass Objects of WaterAnimal & assign variable
		WaterAnimal wAnimal = new WaterAnimal(true, "Shark", "Pacific Ocean");
		//create SubClass Objects of LandAnimal
		LandAnimal lAnimal = new LandAnimal(true, "Lion", "Africa");
		
		//display toString method from super class Animal
		
		System.out.println(wAnimal.toString());
		System.out.println(lAnimal.toString());
		
		

	}//end of main

}//end of class

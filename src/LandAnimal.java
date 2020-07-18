


//subClass LandAnimal extends super class Animal
public class LandAnimal extends Animal
{
	//declare and initialize
	public boolean carnivore;

	//Constructor
	public LandAnimal(boolean carnivore, String species, String location)
	{
		super(species, location);
		this.carnivore = carnivore;

	}//end of constructor

}//end of subClass

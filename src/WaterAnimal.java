

//subClass WaterAnimal extends super class Animal
public class WaterAnimal extends Animal 
{
	//declare and initialize
	public boolean airbreather;

	//Constructor
	public WaterAnimal(boolean airbreather, String species, String location)
	{
		super(species, location);
		this.airbreather = airbreather;

	}//end of constructor

}//end of subclass

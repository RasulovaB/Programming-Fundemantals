


//super class
public class Animal 
{
	//declare and initialize
	private String species;
	private String location;

	//constructor
	public Animal(String species, String location)
	{
		if (species == null && location == null)
		{
			throw new NullPointerException("Species type must have name or location");
			
		}//end of if statement
		
		this.species = species;
		this.location = location;
	}
	
	//set species type
	public void setSpecies(String species)
	{
		
		if (species != null)
		{
			this.species = species;
			
		}//end of if statement
		
		throw new IllegalArgumentException("Species type must have name");
	}
		
	//set species type
		public void setLocation(String location)
		{
			
			if (location != null)
			{
				this.location = location;
				
			}//end of if statement
			
			throw new IllegalArgumentException("Species type must have location");
		}
			
	

	//return species name
	public String getSpecies() {
		return species;
	}

	//return location
	public String getLocation() {
		return location;
	}

	//return string representation of Animal object
	@Override 
	public String toString() 
	{
		return String.format("%s: %s %s ", 
				"Animal's type and location:", getSpecies(), getLocation());
	} //end of return string

}//end of super class



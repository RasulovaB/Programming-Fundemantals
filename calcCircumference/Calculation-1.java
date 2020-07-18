
public class Calculation {
	private double radius = 0.0;
	
	// set the radius
	public void setRadius(double radius) 
	{
		this.radius = radius; 
	}
	// retrieves the radius
	public double getRadius() 
	{
		return radius;
	}
	// method to calculate area
	public double calcArea(double radius) 
	{
		return (Math.PI * radius * radius);
	}
	//method to calculate circumference
	public double calcCircumference(double radius) 
	{
		return (2.0 * Math.PI * radius);
	}

}

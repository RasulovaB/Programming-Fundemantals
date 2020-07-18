
public class CalcTest {

	public static void main(String[] args) {
		
        Calculation calc = new Calculation();
		
		double area;
		double circumference;
		area = calc.calcArea(3.4);
		System.out.println("area " + area);
        circumference = calc.calcCircumference(3.4);
        System.out.println("circumference " + circumference);

	}

}

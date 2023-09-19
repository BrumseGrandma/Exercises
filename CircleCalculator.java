public class CircleCalculator 
{
	public static void main(String[] args)
	{
		double radius1 = 1;
		double radius3 = 3;
		double radius5 = 5;

		System.out.println("Circle with radius " + radius1 + " has ");
		calculateAndDisplay(radius1);

		System.out.println("Circle with radius " + radius3 + " has ");
		calculateAndDisplay(radius3);

		System.out.println("Circle with radius " + radius5 + " has ");
		calculateAndDisplay(radius5);

	}

	public static void calculateAndDisplay(double radius)
	{
		double area = Math.PI * radius * radius;
		double circumference = 2 * Math.PI * radius;

		System.out.println("Area of " + area);
		System.out.println("Circumference of " + circumference);
		System.out.println();
	}
}
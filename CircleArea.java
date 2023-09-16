public class CircleArea
{
	public static void main(String[] args)
	{
		Area(1);
		Area(3);
		Area(5);

		double sum = Circumference(1) + Circumference(3) + Circumference(5);
		System.out.println("Sum of all three circles " + sum);

	}

	public static double Area(double radius)
	{
		double area = Math.PI * radius * radius;
		System.out.println("The area for the circle of radius " + radius + " is " + area);
		return area;
	}
	public static double Circumference(double radius)
	{
		double circumference = 2 * Math.PI * radius;
		System.out.println("The circumference of a circle with radius " + radius + " is " + circumference);
		return circumference;
	}
}
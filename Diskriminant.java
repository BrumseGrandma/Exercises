public class Diskriminant
{
	public static void main(String[] args)
	{
		double a = 2;
		double b = -10;
		double c = 8;
		double[] roots = Roots(a, b, c);

		System.out.printf("The Discriminant is %f%n", Discriminant(a, b, c));
		System.out.printf("There are %d roots:%n", roots.length);
		for (int i = 0; i < roots.length; i++)
		{
			System.out.println(roots[i]);
		}


	}

	public static double Discriminant(double a, double b, double c)
	{
		return (b * b) - (4 * a * c);
	}

	private static double[] emptyD = {};

	public static double[] Roots(double a, double b, double c)
	{
		double d = Discriminant(a, b, c);
		double[] result;

		if (d < 0)
		{
			return emptyD;
		}
		else if (d == 0)
		{
			result = new double[1];
		}
		else 
		{
			result = new double[2];
		}

		result[0] = (-b + Math.sqrt(d))/(2 * a);

		if (d > 0)
		{
			result[1] = (-b - Math.sqrt(d))/(2 * a);
		}

		return result;

	}

}
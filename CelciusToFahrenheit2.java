public class CelciusToFahrenheit2
{
	public static void main(String[] args) 
	{
		table1();
		table2();
		table3();
	}

	public static void table1()
	{
		System.out.println("| celcius | fahrenheit |");
		System.out.println("|---------|------------|");
		for (double c=-5; c<=40; c+=0.5)
		{
			double f = 32 + (9 * c) / 5;

			System.out.printf("| %7.2f | %10.2f |%n", c, f);
		}
	}


	public static void table2()
	{
		System.out.println("| celcius | fahrenheit |");
		System.out.println("|---------|------------|");
		double c = -5;
		while (c<=40) 
		{
			double f = 32 + (9 * c) / 5;

			System.out.printf("| %7.2f | %10.2f |%n", c, f);
			c += 0.5;
		}
		
	}

	public static void table3()
	{
		System.out.println("| celcius | fahrenheit |");
		System.out.println("|---------|------------|");
		double c = -5;
		do
		{
			double f = 32 + (9 * c) / 5;

			System.out.printf("| %7.2f | %10.2f |%n", c, f);
			c += 0.5;
		}
		while (c <= 40);
	}


}
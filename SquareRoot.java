public class SquareRoot
{
	public static void main(String[] args)
	{
		double inputNumber1 = 10;
		double inputNumber2 = 35;
		double result1 = CalculateSqrt(inputNumber1);
		double result2 = CalculateSqrt(inputNumber2);

		System.out.printf("The square root of %.1f is approximately %.7f%n", 
			inputNumber1, result1);



		System.out.printf("The square root of %.1f is approximately %.7f%n", 
			inputNumber2, result2);

	}

	public static double CalculateSqrt(double number)
	{
		//Calculate the square root
		double sqrtResult = Math.sqrt(number);

		return sqrtResult;
	}
}
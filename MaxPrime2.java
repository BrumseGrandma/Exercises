public class MaxPrime2
{
	public static void main(String[] args) 
	{
		long number = 3;
		long count = 1;

		long MaxPrime = 2;

		do
		{
			if (is_prime(number))
			{
				count++;
				MaxPrime = number;
			}
			number += 2;
		}
		while (number < 1000000);

		System.out.println("total number of primes " + count);
		System.out.println("MaxPrime is " + MaxPrime);
	}
	public static boolean is_prime(long number)
	{ 
		
		for (long i = 3; i < number; i += 2)
		{
			if (number%i == 0)
			{
				return false;
			}
		}

		return true;

	}
}
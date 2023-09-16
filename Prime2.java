public class Prime2
{

	static int SieveOfEratosthenesMaxPrime(int n) 
	{
		//n>1
		if (n < 2)
		{
			System.out.println("n must be greater than 1 ");
			return 0;
		}

		boolean[] A = new boolean[n];
		
		for (int i = 0; i < n; i++)
		{
			A[i] = true;
		}

		for (int i = 2; i < java.lang.Math.sqrt(n); i++)
		{
			if (A[i] == true)
			{
				for (int j = i*i; j < n; j += i)
				{
					A[j] = false;
				}
			}		
		}

		for (int i = n-1; i >= 2; i--)
		{
			if (A[i] == true)
			{
				return i;
			}
		}

		return 0;
	}
	

	public static void main(String[] args)
	{
		int p = 1000000;

		System.out.println("The largest prime is " + SieveOfEratosthenesMaxPrime(p));
	}

}
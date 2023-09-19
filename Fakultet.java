public class Fakultet
{
	public static void main(String[] args)
	{
		int n = 4;

		int result = calculateFakultet(n);

		System.out.println("fac(" + n + ") is " + result);

	}

	public static int calculateFakultet(int n)
	{
		if (n == 0 || n == 1)
		{
			return 1;
		}

		else
		{
			return n * calculateFakultet(n - 1);
		}
	}
}
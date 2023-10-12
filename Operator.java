class Operator
{
	public static int operator (int a, int b, boolean c)
	{
		return a+b;
	}
	public static int operator (int a, int b, char c)
	{
		return a-b;
	}
	
	public static int operator (int a, int b, int c)
	{
		return a*b;
	}

	public static void main (String[] args)
	{
		for (int a=0 ; a<5 ; a++)
		{
			for (int b=0 ; b<5 ; b++)
			{
				System.out.println(a+" (?1?) "+b+" = "+operator(a, b, true));
				System.out.println(a+" (?2?) "+b+" = "+operator(a, b, false));
				System.out.println(a+" (?3?) "+b+" = "+operator(a, b, 'a'));
				System.out.println(a+" (?4?) "+b+" = "+operator(a, b, 'b'));
				System.out.println(a+" (?5?) "+b+" = "+operator(a, b, '.'));
				System.out.println(a+" (?6?) "+b+" = "+operator(a, b, (int)'.'));
			}
		}
	}
}


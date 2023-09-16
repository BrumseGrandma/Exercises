class Casting 
{
	public static void main(String[] args)
	{
		IntToLong(3);
		IntToLong(2147483647);
		IntToLong(2147483647 + 1);

		LongToIntToLong(3);
		LongToIntToLong(2147483647);
		LongToIntToLong(2147483647l + 1);

		FloatToDouble(3.0f);
		FloatToDouble(1234567.123f);
		FloatToDouble(12345678.123f);


	}

	public static void IntToLong(int i)
	{
		System.out.printf("Argument i = %s%n", i);
		long   l = i; // i is implicitly casted to long

		System.out.printf("l = %s%n", l);

		i = (int)l; // l is explicitly casted to int
		System.out.printf("i = %s%n", i);

	}

    public static void LongToIntToLong(long aL)
	{
		System.out.printf("Argument al = %s%n", aL);

		int i = (int)aL;
		long   l = i;

		System.out.printf("l = %s%n", l);
		System.out.printf("i = %s%n", i);

	}

	public static void FloatToDouble(float f)
	{
		double   d = f; 
		f = (float)d;

		System.out.printf("Argument f = %f%n", f);
		System.out.printf("d = %f%n", d); 
		System.out.printf("f = %f%n", f);

	}



}






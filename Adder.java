class Adder
{
	static String solve (int x, int y)
	{
		return Integer.toString(x + y);
	}
	
	static String solve (double x, double y)
	{
		return Double.toString(x + y);
	}
	
	public static void main(String[] args)
	{
		System.out.println(solve(3, 5));
		
		System.out.println(solve(3.14, 5.12));
		
		System.out.println(solve((int)3.14, 5.12));
		
		System.out.println(solve(3.14, (int)5.12));
	} 
}
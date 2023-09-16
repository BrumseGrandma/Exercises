public class Holiday
{
	public static void main(String[] args) 
	{
		long month = Long.parseLong(args[0]); //1-12 in months

		if (month == 4)
		{
			System.out.println(" Easter! ");
		}
		else if (month == 7)
		{
			System.out.println(" Summer Holiday! ");
		}
		else if (month == 8)
		{
			System.out.println(" Summer Holiday! ");
		}
		else if (month == 10)
		{
			System.out.println(" Autumn Holiday! ");
		}
		else if (month == 12)
		{
			System.out.println(" Christmans! ");
		}		

		else 
		{
			System.out.println(" Hard Work! ");
		}
	}
}
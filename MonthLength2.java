public class MonthLength2
{
	public static void main(String[] args)
	{
		int[] months = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};


		int target = Integer.parseInt(args[0]);

		System.out.println(months[target]);


	}
}
public class Calendar
{
	public static void main(String[] args)
	{
		int[] normal_year = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

		int[] leap_year = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

		for (int year = 2000; year <= 2020; year++)
		{
			int[] arr = normal_year;

			if (year%4 == 0)
			{
				arr = leap_year;
			}
			
			System.out.printf("year %d: ", year);

			for (int i = 0; i < arr.length; i++)
			{
				System.out.printf("%d, ", arr[i]);
			}
			
			System.out.println("");

		}

	}
}
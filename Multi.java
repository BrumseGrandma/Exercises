public class Multi
{
	public static void main(String[] args) 
	{
		int size = 17;
		int[] multi = new int[size];

		for (int i = 0; i < size; i++)
		{
			// Loop body
			multi[i] = 3*i;

			// System.out.println(i);
			//System.out.println(multi[3]); choosing the different[] values
			//prints out the single number in the array loop of 3*n

		}

		// 2nd loop... print all values from "multi" array
		// creates the entire array through the former loop in its own
		for (int x = 0; x < multi.length; x++) 
		{
			// Print value from multi

			System.out.println(multi[x]);
			//prints the entire array after having gone through the
			//multi[] loop, giving the 3*n as the array
		}
	}
}
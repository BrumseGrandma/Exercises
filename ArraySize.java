public class ArraySize
{
	public static void main(String[] args)
	{
		int[] num = {23, 53, 10, 89, 69}; //makes a list of random numbers 

		int max = num[0]; //creates a variable with its value being the 1st member of the array

		for (int i=0; i<num.length; i++) //makes an iteration 
		{
			if(max < num[i]) //runs the loop for as long as its smaller than num[i]
			{
				max = num[i]; //until it turns into the highest num[i], stop the loop
			}

		}	

		System.out.println("The highest number is " + (max)); //prints out the max iteration
	}
}
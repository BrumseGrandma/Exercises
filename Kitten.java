class Kitten
{
	double cuteness;
	static int count = 0;

	public Kitten (double cuteness)
	{
		this.cuteness = cuteness;
		count++;
	}

	public static void main (String[] args)
	{
		for (int i=0; i<100; i++)
		{
			new Kitten(i);
		}

		System.out.println("There are " + count + " kittens.");
	}

}

public class PrettySudoku
{
	public static void main (String[] args)
	{
		int[][] puzzle = 
		{
		{7, 3, 6, 4, 5, 2, 9, 8, 1},
		{1, 9, 8, 6, 3, 7, 4, 5, 2},
		{4, 2, 5, 9, 8, 1, 3, 7, 6},
		{3, 6, 4, 5, 2, 8, 1, 9, 7},
		{9, 5, 2, 7, 1, 4, 6, 3, 8},
		{8, 1, 7, 3, 9, 6, 2, 4, 5},
		{2, 8, 9, 1, 7, 3, 5, 6, 4},
		{6, 7, 3, 2, 4, 5, 8, 1, 9},
		{5, 4, 1, 8, 6, 9, 7, 2, 3},
		};

		prettyPrintSudoku(puzzle);

	}

	public static void prettyPrintSudoku (int[][] array)
	{
		for (int i = 0; i < array.length; i++)
		{
			//System.out.print("[");
			if(i%3 == 0)
			{
				System.out.print("\n");
			}

			for (int j = 0; j < array[i].length; j++)
			{
				
				if(j%3 == 0)
				{
					System.out.print(" ");
				}

				System.out.print((j == 0 ? "" : " ") + array[i][j]);
			}

			//System.out.print("]");
			System.out.print("\n");
		}

	}

}
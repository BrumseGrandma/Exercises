public class Sudoku
{
	public static void main(String[] args)
	{
		printBoard();
	}

	static int[][] sudoku = new int[9][9];

	public static void printBoard()
		{
			for (int i = 0; i < 9; i++)
			{
				if (i%3 == 0 && i != 0)
					System.out.println();

				for (int t = 0; t < 9; t++)
				{
					if (t%3 == 0)
						System.out.print("  ");

					if (sudoku[i][t] == 0) 
						System.out.print(". ");
				} 
				System.out.print("\n");
			}
		}
}
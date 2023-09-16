public class SudokuChecker
{
	public static void main(String[] args)
	{

		byte[][] sudoku = 
		{
			{ 6, 8, 2, 1, 9, 4, 3, 5, 7},
			{ 7, 3, 1, 5, 6, 8, 9, 2, 4},
			{ 4, 9, 5, 7, 2, 3, 8, 6, 1},
			{ 8, 2, 7, 9, 3, 5, 1, 4, 6},
			{ 5, 1, 9, 6, 4, 7, 2, 8, 3},
			{ 3, 6, 4, 2, 8, 1, 5, 7, 9},
			{ 9, 5, 6, 4, 1, 2, 7, 3, 8},
			{ 2, 4, 8, 3, 7, 9, 6, 1, 5},
			{ 1, 7, 3, 8, 5, 6, 4, 9, 2}
		};
		if (CheckAllFilled(sudoku) && 
			CheckUniqueRows(sudoku) &&
			CheckUniqueCollumns(sudoku) &&
			CheckUniqueGroups(sudoku) )
		{
			System.out.println("Sudoku is correct");
		}
		else
		{
			System.out.println("Sudoku is NOT correct");
		}

	}


	public static boolean CheckAllFilled(byte[][] board)
	{
		for (int i = 0; i < board.length; i++)
		{
			for (int j = 0; j < board[i].length; j++)
			{
				if (board[i][j] == 0)
					return false;
			}
		}

		return true;
	}

	public static boolean CheckUniqueRows(byte[][] board)
	{
		for (int col = 0; col < board.length; col++)
		{
			boolean[] usednumbers = new boolean [9];
			for (int j = 0; j < 9; j++)
			{
				usednumbers[j] = false;
			}

			for (int row = 0; row < board[col].length; row++)
			{
				if (usednumbers[board[col][row]-1] == true)
				{
					return false;
				}
				usednumbers[board[col][row]-1] = true; 
			}
		}
		return true;
	}

	public static boolean CheckUniqueCollumns(byte[][] board)
	{
		for (int row = 0; row < board.length; row++)
		{
			boolean[] usednumbers = new boolean [9];
			for (int j = 0; j < 9; j++)
			{
				usednumbers[j] = false;
			}

			for (int col = 0; col < board[row].length; col++)
			{
				if (usednumbers[board[col][row]-1] == true)
				{
					return false;
				}
				usednumbers[board[col][row]-1] = true; 
			}
		}
		return true;
	}

	public static boolean CheckUniqueGroups(byte[][] board)
	{
		for (int group = 0; group < 9; group++)
		{
			boolean[] usednumbers = new boolean [9];
			for (int j = 0; j < 9; j++)
			{
				usednumbers[j] = false;
			}

			for (int row = (group*3)%9; row < (group*3)%9+3; row++)
			{
				for (int col = (group%3)*3; col < (group%3)*3+3; col++)
				{
					int i = board[col][row] - 1;
					if (usednumbers[i] == true)
					{
						return false;
					}
					usednumbers[i] = true; 

				}
			}
		}
		return true;
	}



}
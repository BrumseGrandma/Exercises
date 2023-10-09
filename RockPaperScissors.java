import java.util.Scanner;
import java.util.Random;

class RockPaperScissors 
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		String[] choices = {"rock", "paper", "scissors"};
		int player_number, computer_number;
		
		while (true)
		{
			// Prompt the user until a valid choice is entered
			do {
				System.out.println("Please enter your choice of rock (0), paper (1), or scissors (2):");
				while (!scanner.hasNextInt()) {
					System.out.println("Invalid input. Please enter a number (0, 1, or 2).");
					scanner.next(); // Consume invalid input
				}
				player_number = scanner.nextInt();
			} while (player_number < 0 || player_number > 2);
			
			System.out.println("Player plays " + choices[player_number]);
			
			// Computer play
			computer_number = (int)(Math.random()*3);
			System.out.println("Computer plays " + choices[computer_number]);
			
			// Outcome
			switch (10 * player_number + computer_number) 
			{
				case 00:
				case 11:
				case 22:
					System.out.println("That's a draw!");
					break;
				case 02:
				case 10:
				case 21:
					System.out.println("You win!");
					break;
				case 20:
				case 01:
				case 12:
					System.out.println("You lose!");
					break;
				default:
					System.out.println("Internal error :-(");
					System.out.println("- Player chose:" + player_number);
					System.out.println("- Computer chose:" + computer_number);
			}
			System.out.println("Let's play again ...");
		}
	}
}

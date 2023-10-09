import java.util.Scanner;

public class Accounts 
{
    static Scanner scanner = new Scanner(System.in);
    static int[] accounts = {903, 716, 67};
    
    static int getAccountNumber () 
    {
        int accountNumber;
        while (true) {
            System.out.println("Enter an account number (0, 1, or 2): ");
            if (scanner.hasNextInt()) {
                accountNumber = scanner.nextInt();
                if (accountNumber >= 0 && accountNumber <= 2) {
                    break; // Valid input, exit the loop
                } else {
                    System.out.println("Invalid account number. Please enter a number between 0 and 2.");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.next(); // Consume invalid input
            }
        }
        return accountNumber;
    }
    
    static void printAccountState (int accountid) 
    {
        System.out.println("Account " + accountid + " contains " + accounts[accountid]);
    }
    
    public static void main(String[] args) 
    {
        while (true) 
        {
            int accountid = getAccountNumber();
            printAccountState(accountid);
        }
    }
}

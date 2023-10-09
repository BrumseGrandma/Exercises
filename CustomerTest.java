public class CustomerTest 
{
       public static void main(String[] args) 
       {
              // Creates Customer-variabel and give it a new 
              // Customer-objekt by calling constructor
              Customer aCustomer = new Customer("John Doe", 1001, 500.0);

              // Deposits money
              aCustomer.deposit(200.0);

              // Pull money out
              aCustomer.withdraw(50.0);

              // Prints the balance
              System.out.println("Balance after operations: $" + aCustomer.getBalance());
       }    
}

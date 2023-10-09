public class Customer {
    private String name;
    private int id;
    private double balance;

    public Customer(String name, int id) {
        this.name = name;
        this.id = id;
        this.balance = 0.0;
    }

    public Customer(String name, int id, double balance) {
        this.name = name;
        this.id = id;
        this.balance = balance;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        if (this.balance >= amount) {
            this.balance -= amount;
        } else {
            System.out.println("Not enough funds to withdraw $" + amount);
        }
    }

    public double getBalance() {
        return this.balance;
    }

    public String getName() {
        return this.name;
    }

    public int getId() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Customer [name=" + name + ", id=" + id + ", balance=$" + balance + "]";
    }
}



public class CustomerDatabase {
    private Customer[] customers;

    public CustomerDatabase() {
        this.customers = new Customer[10];
    }

    public void addCustomer(Customer customer) {
        for (int i = 0; i < customers.length; i++) {
            if (customers[i] == null) {
                customers[i] = customer;
                break;
            }
        }
    }

    public void removeCustomer(int id) {
        for (int i = 0; i < customers.length; i++) {
            if (customers[i] != null && customers[i].getId() == id) {
                customers[i] = null;
                break;
            }
        }
    }

    public Customer[] getCustomers() {
        return customers;
    }

    public void printCustomerNames() {
        for (Customer customer : customers) {
            if (customer != null) {
                System.out.println(customer.getName());
            }
        }
    }

    public static void main(String[] args) {
        CustomerDatabase customerDatabase = new CustomerDatabase();

        Customer customer1 = new Customer("John Doe", 1001, 500.0);
        Customer customer2 = new Customer("Jane Smith", 1002, 1000.0);

        customerDatabase.addCustomer(customer1);
        customerDatabase.addCustomer(customer2);

        System.out.println("Customer List:");
        customerDatabase.printCustomerNames();

        customerDatabase.removeCustomer(1001);

        System.out.println("\nCustomer List After Removal:");
        customerDatabase.printCustomerNames();
    }
}

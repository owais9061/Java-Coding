public class Main {
    public static void main(String[] args) {
        // Create an instance of Account using the default constructor
        Account account1 = new Account();

        // Set the account details using the mutator methods
        account1.setId(12345);
        account1.setBalance(1000.0);
        account1.setAnnualInterestRate(4.5);

        // Print the account details using the accessor methods
        System.out.println("Account ID: " + account1.getId());
        System.out.println("Balance: $" + account1.getBalance());
        System.out.println("Annual Interest Rate: " + account1.getAnnualInterestRate() + "%");
        System.out.println("Date Created: " + account1.getDateCreated());

        // Perform some operations on the account
        double monthlyInterestRate = account1.getMonthlyInterestRate();
        double monthlyInterest = account1.getMonthlyInterest();
        System.out.println("Monthly Interest Rate: " + monthlyInterestRate + "%");
        System.out.println("Monthly Interest: $" + monthlyInterest);

        account1.withdraw(500.0);
        System.out.println("Updated Balance after withdrawal: $" + account1.getBalance());

        account1.deposit(200.0);
        System.out.println("Updated Balance after deposit: $" + account1.getBalance());
    }
}

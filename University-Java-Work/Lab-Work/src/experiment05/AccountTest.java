public class AccountTest {
    public static void main(String[] args) {
        // Create an instance of Account with the specified details
        Account account = new Account(1122, 20000);

        // Set the annual interest rate
        account.setAnnualInterestRate(4.5);

        // Withdraw $2,500
        account.withdraw(2500);

        // Deposit $3,000
        account.deposit(3000);

        // Print the balance, monthly interest, and date of creation
        System.out.println("Balance: $" + account.getBalance());
        System.out.println("Monthly Interest: $" + account.getMonthlyInterest());
        System.out.println("Date Created: " + account.getDateCreated());
    }
}

public class Main {
    public static void main(String[] args) {
        SavingsAccount account = new SavingsAccount("12345", 100.0);
        System.out.println("Account ID: " + account.getID());
        System.out.println("Balance: $" + account.getBalance());

        account.deposit(50.0);
        System.out.println("Balance after deposit: $" + account.getBalance());

        boolean withdrawalResult = account.withdraw(70.0);
        System.out.println("Withdrawal successful: " + withdrawalResult);
        System.out.println("Balance after withdrawal: $" + account.getBalance());

        boolean withdrawalResult2 = account.withdraw(100.0);
        System.out.println("Withdrawal successful: " + withdrawalResult2);
        System.out.println("Balance after withdrawal: $" + account.getBalance());
    }
}

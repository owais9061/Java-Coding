// Account class
public abstract class Account {
    protected String id;
    protected double balance;

    public Account(String id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    public String getID() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public abstract boolean withdraw(double amount);

    public abstract void deposit(double amount);
}

// SavingsAccount class
public class SavingsAccount extends Account {
    public SavingsAccount(String id, double initialDeposit) {
        super(id, initialDeposit);
        if (initialDeposit < 10) {
            System.out.println("Initial deposit should be at least $10.");
        }
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public boolean withdraw(double amount) {
        if (balance - amount - 2 >= 10) {
            balance -= (amount + 2);
            return true;
        } else {
            System.out.println("Withdrawal failed. Balance cannot go below $10.");
            return false;
        }
    }
}

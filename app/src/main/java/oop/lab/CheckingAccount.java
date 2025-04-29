package app.src.main.java.oop.lab;

// CheckingAccount class
public class CheckingAccount extends BankAccount {
    private static final double INTEREST_RATE = 0.01;

    public CheckingAccount(String accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
    }

    @Override
    public double calculateInterest() {
        double interest = getBalance() * INTEREST_RATE;
        deposit(interest);
        return interest;
    }

    public void payBills(double amount) {
        withdraw(amount);
        System.out.println("Paid bill of " + amount);
    }
}
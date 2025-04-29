package app.src.main.java.oop.lab;

public class SavingsAccount extends BankAccount {
    private static final double INTEREST_RATE = 0.03;

    public SavingsAccount(String accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
    }

    @Override
    public double calculateInterest() {
        double interest = getBalance() * INTEREST_RATE;
        deposit(interest);
        return interest;
    }

    public void transferFunds(double amount, String targetAccount) {
        withdraw(amount);
        System.out.println("Transferred " + amount + " to account " + targetAccount);
    }
}
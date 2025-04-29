package app.src.main.java.oop.lab;

public class BusinessAccount extends BankAccount implements LoanService {
    private String loanStatus;

    public BusinessAccount(String accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
        this.loanStatus = "No Loan";
    }

    @Override
    public double calculateInterest() {
        double interest = getBalance() * 0.02;
        deposit(interest); // Add the calculated interest to the balance
        return interest;
    }

    @Override
    public void applyForLoan(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Loan amount must be greater than zero.");
        }
            loanStatus = "Loan Applied: " + amount;
        System.out.println("Loan application for " + amount + " submitted.");
    }

    @Override
    public String checkLoanStatus() {
        if (loanStatus.equals("No Loan")) {
            return "No loan application found.";
        }
        return loanStatus;
    }

    public void payBills(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Bill amount must be greater than zero.");
        }
        if (amount > getBalance()) {
            throw new IllegalArgumentException("Insufficient funds to pay the bill.");
        }
        withdraw(amount);
        System.out.println("Paid bill of " + amount);
    }
}
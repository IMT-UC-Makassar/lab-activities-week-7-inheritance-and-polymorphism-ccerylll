package oop.lab;

public abstract class BankAccount {
    private String accountNumber;
    private String accountHolder;
    private double balance; 

    public BankAccount (String num, String holder, double balance){
        this.accountNumber = num;
        this.accountHolder = holder;
        this.balance = balance;
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            throw new IllegalArgumentException("Insufficient funds");
        }
    }
    public double getBalance(){
        return balance;
    }
    public abstract double calculateInterest ();
}

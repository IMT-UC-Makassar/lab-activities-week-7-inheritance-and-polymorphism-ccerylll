package oop.lab;

public class SavingsAccount extends BankAccount implements OnlineService {
    public SavingsAccount (String num, String holder, double balance){
        super(num,holder,balance);
    }

    @Override
    public void transferFunds(double amount, String accountNumber) {
        if (getBalance() >= amount) {
            withdraw(amount);
            System.out.println("Transferred $" + amount + " to account " + accountNumber);
        } else {
            System.out.println("Insufficient funds for transfer.");
        }
    }

    @Override
    public void payBills(double amount) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'payBills'");
    }

    @Override
    public double calculateInterest() {
        double interest = getBalance() * 0.05; // 5% interest
        deposit(interest); // Add interest to balance
        return interest;
    }
}

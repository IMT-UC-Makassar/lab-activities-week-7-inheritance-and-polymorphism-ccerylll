package oop.lab;

public class CheckingAccount extends BankAccount implements OnlineService {
    public CheckingAccount(String num, String holder, double balance){
        super(num, holder, balance);
    }

    @Override
    public void transferFunds(double amount, String nama) {
        if (getBalance() >= amount) {
            withdraw(amount); // correct method call
            System.out.println("Withdrew $" + amount + " to " + nama);
        } else {
            System.out.println("Insufficient funds for transfer.");
        }
    }

    @Override
    public void payBills(double amount){
        if (getBalance() >= amount) {
            withdraw(amount);
            System.out.println("Bills paid. Stay sigma 😎");
        } else {
            System.out.println("Insufficient funds for bill payment.");
        }
    }

    @Override
    public double calculateInterest() {
        return getBalance() * 10.0;
    }
}

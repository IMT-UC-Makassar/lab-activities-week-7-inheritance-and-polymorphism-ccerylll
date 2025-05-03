package oop.lab;

public class CreditCard extends Card {
    public CreditCard(String cardNumber, String cardHolder) {
        super(cardNumber, cardHolder);
    }

    @Override
    public double getInterestRate() {
        double rate = 15.0; // Credit cards typically have a higher interest rate
        System.out.println("The interest rate is " + rate + "%");
        return rate;
    }
}


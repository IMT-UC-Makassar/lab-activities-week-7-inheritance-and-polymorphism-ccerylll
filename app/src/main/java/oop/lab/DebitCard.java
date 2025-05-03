package oop.lab;

public class DebitCard extends Card {
    public DebitCard(String cardNumber, String cardHolder) {
        super(cardNumber, cardHolder);
    }

    @Override
    public double getInterestRate() {
        double rate = 0.0; // Debit cards typically have no interest rate
        System.out.println("The interest rate is " + rate + "%");
        return rate;
    }
}

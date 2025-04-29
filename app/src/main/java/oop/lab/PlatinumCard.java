package app.src.main.java.oop.lab;

public class PlatinumCard extends CreditCard {
    public PlatinumCard(String cardNumber, String cardHolder) {
        super(cardNumber, cardHolder);
    }

    @Override
    public double getInterestRate() {
        return 10.0; // Lower interest rate for platinum cards
    }
}
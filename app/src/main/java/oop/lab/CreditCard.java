package app.src.main.java.oop.lab;

// CreditCard class
public class CreditCard extends Card {
    public CreditCard(String cardNumber, String cardHolder) {
        super(cardNumber, cardHolder);
    }

    @Override
    public double getInterestRate() {
        return 15.0; // Interest rate for credit cards
    }
}
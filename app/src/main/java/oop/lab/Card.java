package app.src.main.java.oop.lab;

public abstract class Card {
    private String cardNumber;
    private String cardHolder;

    public Card(String cardNumber, String cardHolder) {
        if (cardNumber == null || cardNumber.isEmpty()) {
            throw new IllegalArgumentException("Card number cannot be null or empty.");
        }
        if (cardHolder == null || cardHolder.isEmpty()) {
            throw new IllegalArgumentException("Card holder cannot be null or empty.");
        }
        this.cardNumber = cardNumber;
        this.cardHolder = cardHolder;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public String getCardHolder() {
        return cardHolder;
    }

    public abstract double getInterestRate();
}
package pl.sda;

import java.util.Objects;

public class Card {
    private String cardNumber;
    private String cardIssuer;

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCardIssuer() {
        return cardIssuer;
    }

    public void setCardIssuer(String cardIssuer) {
        this.cardIssuer = cardIssuer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return Objects.equals(cardNumber, card.cardNumber) &&
                Objects.equals(cardIssuer, card.cardIssuer);
    }

    @Override
    public int hashCode() {

        return Objects.hash(cardNumber, cardIssuer);
    }
}

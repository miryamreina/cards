package es.telefonica.talentum.cardmirian.model;


public class Card {
    public enum Suit{
        SPADES,
        HEARTS,
        DIAMODS,
        CLUBS
    }

    private Suit suit;
    private String image;

    private int remainingCard;

    public int getRemainingCard() {
        return remainingCard;
    }

    public void setRemainingCard(int remainingCard) {
        this.remainingCard = remainingCard;
    }

    public Suit getSuit() {
        return suit;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}

package src;

public abstract class Card {
    public String name;
    public boolean isMayor;

    public Card(String n, boolean isM) {
        this.name = n;
        isMayor = isM;
    }
}

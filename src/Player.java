package src;

public class Player {
    private int id;
    private String name;
    private String desc;
    private Card card;

    public Player(int iDent, String n, String d, Card c) {
        id = iDent;
        name = n;
        desc = d;
        card = c;
    }

    public Player(int iDent, String n) {
        id = iDent;
        name = n;
    }

    public int getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    public Card getCard() {
        return card;
    }
}

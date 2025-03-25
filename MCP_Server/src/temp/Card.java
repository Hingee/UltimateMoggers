package MCP_Server.src;
public class Card {
    private String name;
    private String desc;
    private Profession prof;

    public Card(String n, String d, Profession p) {
        name = n;
        desc = d;
        prof = p;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    public Profession getProf() {
        return prof;
    }
}

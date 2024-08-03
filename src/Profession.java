package src;

public abstract class Profession {
    private String name;
    private String desc;
    private Team team;

    public Profession(String n, String d, Team t) {
        name = n;
        desc = d;
        team = t;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    public Team getTeam() {
        return team;
    }

    public boolean isMogger() {
        if(team.getName().equals("Mogger")) {
            return true;
        }
        return false;
    }
}

package src;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class GameConfig {
    private static GameConfig instance = null;
    private int nPlayers;
    private int nWolves;
    private int nVillagers;
    private ArrayList<Player> players = new ArrayList<>();

    private GameConfig() throws IOException {
        Scanner in = new Scanner(System.in);
        //Gets amount of players
        while(true) {
            System.out.print("Enter the amount of desired players: ");
            String s = in.nextLine();
            if(isNum(s)) {
                nPlayers = getNum(s);
                break;
            }else {
                System.out.println("Invalid input try again");
            }
        }

        //Gets amount of player names
        System.out.println("Enter the player names 1 by 1 ");
        for(int i=0; i<nPlayers; i++) {
            System.out.print("Enter P"+(i+1)+" name: ");
            String s = in.nextLine();
            if(isDup(s)) {
                System.out.println("Duplicate name detected try again");
                i--;
            }else {
                players.add(new Player(i+1, s));
            }
        }

        //Gets amount of wolves
        while(true) {
            System.out.print("Enter the amount of desired wolves: ");
            String s = in.nextLine();
            if(isNum(s)) {
                nWolves = getNum(s);
                break;
            }else {
                System.out.println("Invalid input try again");
            }
        }

        //Get Villagers
        while(true) {
            System.out.print("Enter the amount of desired villagers: ");
            String s = in.nextLine();
            if(isNum(s)) {
                nVillagers = getNum(s);
                break;
            }else {
                System.out.println("Invalid input try again");
            }
        }
        in.close();
    }

    private boolean isNum(String s) {
        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            if(c=='0' || c =='1' || c=='2' || c=='3' || c=='4') {
                return true;
            }
            if(c=='5' || c=='6' || c=='7' || c=='8' || c=='9') {
                return true;
            }
        }
        return false;
    }

    private int getNum(String s) {
        int ans = 0;
        for(int i=0; i<s.length(); i++) {
            ans*=10;
            ans+=Integer.parseInt(String.valueOf(s.charAt(i)));
        }
        return ans;
    }

    public boolean isDup(String s) {
        for(int i=0; i<players.size(); i++) {
            if(players.get(i).getName().equals(s)) {
                return true;
            }
        }
        return false;
    }

    public static GameConfig getInstance() throws IOException {
        if(instance == null) {
            instance =  new GameConfig();
        }

        return instance;
    }

    public int getNPlayers() {
        return nPlayers;
    }

    public int getNWolves() {
        return nWolves;
    }

    public int getNVillagers() {
        return nVillagers;
    }
}

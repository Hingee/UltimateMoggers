package MCP_Server.src;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Roles {
    private int mayor;
    private int[] villagerID;
    private int[] wolfID;
    GameConfig config;
    
    Roles() {
        try {
            config = GameConfig.getInstance();
        } catch (IOException e) {
            e.printStackTrace();
        }

        mayor = assignMayor();
        wolfID = assignArrRand(config.getNWolves());
        villagerID = assignVillagers(config.getNVillagers());
    }

    private int[] assignVillagers(int nVillagers) {
        int[] result = 
    }

    private int[] assignArrRand(int n) {
        ArrayList<Integer> randSet = new ArrayList<>();
        for(int i=0; i<config.getNPlayers(); i++) {
            randSet.add(i+1);
        }
        Collections.shuffle(randSet);
        int[] random = new int[n];
        for(int i = 0; i < random.length; i++) {
            random[i] = randSet.get(0);
            randSet.remove(0);
            Collections.shuffle(randSet);
        }
        return random;
    }

    private int assignMayor() {
        return getRandom(0,config.getNPlayers());
    }

    private int getRandom(int lower, int upper) {
        return lower+(int)(Math.random()*upper);
    }

    public int getMayor() {
        return mayor;
    }

    public int[] getWillagers() {
        return villagerID;
    }

    public int[] getWolves() {
        return wolfID;
    }
}

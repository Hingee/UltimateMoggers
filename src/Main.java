package src;

import java.io.IOException;

public class Main {
    public static void main(String[] args){
        try {
            GameConfig config = GameConfig.getInstance();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //Assign Roles randomly
        Roles roles = new Roles();
        //run events

        //Game finish
    }
}
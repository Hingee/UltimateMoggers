package src;

public enum Role {
    NA, //Error Margins
    Villager, //No special actions
    Witch, //Can heal or poison only 1 potion each per GAME
    Seer, //Can see a players team
    ApprenticeSeer, //picks 2 players and checks if they on the same team
    Fool, //If the village votes against her, she turns over her card (doesn't die) but now can't vote
    Hunter, //Can kill another player if killed
    Thief, //At the beginning of the game, thief can choose from 2 cards placed in the center
    Mason, // Can see the other mason
    Elder,  //Must be killed 2x by wolves
    Defender, //Can guard 1 person at night cannot guard themself 2 nights in a row
    Werewolf, //Kills player during the night
    AlphaWerewolf, //Only alpha vote counts, creates new wolf instead of killing the person
    BigBadWolf, //Wolf vote counts as 2
}

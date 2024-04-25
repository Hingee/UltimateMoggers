package src;

public enum Role {
    NA, //Error Margins
    NPC, //No special actions
    Doctor, //Can heal or poison only 1 potion each per GAME
    Detective, //Can see a players team
    ApprenticeDetective, //picks 2 players and checks if they on the same team
    Degenerate, //If the villages votes against them, they turns over their card (doesn't die) but now can't vote
    Aggresor, //Can moggs another player if mogged
    TwoFacer, //At the beginning of the game, TwoFacer can choose from 2 cards placed in the center
    Twins, // Can see the other twin
    Mewer,  //Must be mogged x2
    Guarder, //Can guard 1 person at night cannot guard themself 2 nights in a row
    Mogger, //Moggs player during the night
    AlphaMogger, //Only alpha vote counts, convertes a new mogger instead of mogging the person
    BullyMogger, //Vote counts as 2
}

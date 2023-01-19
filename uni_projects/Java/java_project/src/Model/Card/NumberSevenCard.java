package Model.Card;

import Model.Pawn.Pawn;

/**
 * This class creates a number seven card
 */

public class NumberSevenCard extends NumberCard {
    /**
     * Constructor
     *
     * @post Creates a new card with value "seven"
     */
    /*public NumberSevenCard(int value, String type, String descr) {
        super(7, "SEVEN", "Move 7 steps in front ,or devide the steps for both of your pawns");
    }*/
    public NumberSevenCard() {
        super(7, "SEVEN", "A.Move 7 steps in front\nB. Divide the steps for both of your pawns\nC. Fold");
    }


}
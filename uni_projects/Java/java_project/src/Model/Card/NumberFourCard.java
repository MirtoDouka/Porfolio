package Model.Card;

import Model.Pawn.Pawn;

/**
 * This class creates a number four card
 */

public class NumberFourCard extends NumberCard {
    /**
     * Constructor
     * @post Creates a new card with value "value"
     */
   /* public NumberFourCard(int value, String type, String descr) {
        super(4, "FOUR", "Move 4 steps behind.");
    }*/

    public NumberFourCard() {
        super(4, "FOUR", "A. Move 4 steps behind\nB. Fold");
    }



}

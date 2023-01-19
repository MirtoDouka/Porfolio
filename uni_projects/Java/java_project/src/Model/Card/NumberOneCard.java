package Model.Card;

import Model.Pawn.Pawn;

/**
 * This class creates a number one card
 */

public class NumberOneCard extends  NumberCard {
    /**
     * Constructor
     * @post Creates a new card with value "one"
     */


    public NumberOneCard() {
        super(1, "ONE", "A. Start from home \nB. Move 1 step in front\nC. Fold");
    }


}
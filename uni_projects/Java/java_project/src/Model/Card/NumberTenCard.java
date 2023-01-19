package Model.Card;

import Model.Pawn.Pawn;

/**
 * This class creates a number ten card
 */

public class NumberTenCard extends  NumberCard {
    /**
     * Constructor
     *
     * @post Creates a new card with value "value"
     */
   /* public NumberTenCard(int value, String type, String descr) {
        super(10, "TEN", "Move 10 steps in front ,or 1 step behind");
    }*/
    public NumberTenCard() {
        super(10, "TEN", "A. Move 10 steps in front\nB. Move 1 step behind\nC. Fold");
    }


}
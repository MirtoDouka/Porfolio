package Model.Card;

import Model.Pawn.Pawn;

/**
 * This class creates a number eleven card
 */

public class NumberElevenCard extends NumberCard {
    /**
     * Constructor
     *
     * @post Creates a new card with value "eleven"
     */

    public NumberElevenCard() {
        super(11, "ELEVEN", "A. Moves 11 front \nB. Change your pawn with opponents\nC. Fold");
    }


}

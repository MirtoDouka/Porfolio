package Model.Card;

import Model.Pawn.Pawn;

/**
 * This class creates a "Sorry" card
 */

public class SorryCard extends Card{

    private boolean isPlayed;

    /**
     * Constructor

     * @post Creates a new Sorr card with value "value"
     */

    public SorryCard() {
        super(0 , "SORRY" , "Send the opponents pawn back to home and take his place");
    }


    public void MoveOne(Pawn pawn , Pawn pawn2) {
    }



}

package Model.Card;

import Model.Pawn.Pawn;

/**
 * This class creates a number two card
 */

public class NumberTwoCard extends NumberCard {
    /**
     * Constructor
     *
     * @post Creates a new card with value "two"
     */
   /* public NumberTwoCard(int value, String type, String descr) {
        super(2, "TWO", "Start from home ,or move 2 steps in front./nThen play again!");
    }*/
    public NumberTwoCard() {
        super(2, "TWO", "A. Start from home \nB. Move 2 steps in front. \nC. Fold");
    }

    /*public void MoveTwo(Pawn pawn1 ,Pawn pawn2, String choose) {
        switch (choose) {
            case "A":

            case "B" : {


            }

        }
    }*/
}
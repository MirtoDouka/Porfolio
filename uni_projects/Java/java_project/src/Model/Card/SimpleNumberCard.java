package Model.Card;

import Model.Pawn.Pawn;

import java.util.Random;

/**
 * This class the 3 , 5 , 8 , 12 number cards
 */

   public class SimpleNumberCard extends NumberCard {


    private static String namee;

    /**
     * Constructor
     *
     * @post Creates a new card with value 3 , 5, 8 or 12
     */


    public SimpleNumberCard(int i) {


        super(i, namee, "A.Move " + i + "steps in front \nB. Fold");

        if (i == 3)
            namee = "THREE";
        else if (i == 5)
            namee = "FIVE";
        else if (i == 8)
            namee = "EIGHT";
        else
            namee = "TWELVE";


    }


}






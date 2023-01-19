package Model.Square;

import Model.Pawn.Pawn;
import java.lang.String;

/**
 * This class represents the "home square" of the deck
 */

public class HomeSquare extends  Square {


    /**Constructor.
     * @post Creates a new "Home Square" with colour "Colour" , at (x,y) point on deck
     * shows if is occupied or not
     * @param Colour the colour of the square
     */
    public HomeSquare( String Colour ){
        super(Colour );
        isOccup = false;

    }



}

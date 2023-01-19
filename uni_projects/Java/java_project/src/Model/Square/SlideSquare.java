package Model.Square;

import Model.Pawn.Pawn;

/**
 * Contains the classes and methods of a slide square
 */

public class SlideSquare extends Square {


    /**
     * Constructor.
     * @post Creates a new "Slide Square" with colour "Colour" , at (x,y) point on deck
     * shows if is occupied or not
     * @param Colour the colour of the square
     */
    public SlideSquare(String Colour) {

        super(Colour);
    }
}

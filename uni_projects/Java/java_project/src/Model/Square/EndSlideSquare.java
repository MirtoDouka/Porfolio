package Model.Square;

/**
 *Constitutes the end of a slide square
 */

public class EndSlideSquare extends SlideSquare {
    /**
     * Constructor.
     *
     * @param Colour the colour of the square
     * @param x      the x axon of the deck
     * @param y      the y axon of the deck
     * @post Creates a new "End Slide Square" with colour "Colour" , at (x,y) point on deck
     * shows if is occupied or not
     */
    public EndSlideSquare(String Colour) {
        super(Colour);
    }
}

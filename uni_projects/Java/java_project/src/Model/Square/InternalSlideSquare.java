package Model.Square;

/**
 *Constitutes the internal of a slide square
 */

public class InternalSlideSquare extends SlideSquare {
    /**
     * Constructor.
     *
     * @param Colour the colour of the square
     * @param x      the x axon of the deck
     * @param y      the y axon of the deck
     * @post Creates a new "Internal Slide Square" with colour "Colour" , at (x,y) point on deck
     * shows if is occupied or not
     */
    public InternalSlideSquare(String Colour) {
        super(Colour);
    }
}

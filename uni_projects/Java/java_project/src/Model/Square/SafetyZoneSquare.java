package Model.Square;

/**
 * Creates a Safety Zone Square
 */

public class SafetyZoneSquare extends Square {

    /**
     * Constructor.
     * @post Creates a new "Safety Zone Square" with colour "Colour" , at (x,y) point on deck
     * shows if is occupied or not
     * @param Colour the colour of the square
     * @param x      the x axon of the deck
     * @param y      the y axon of the deck
     */
    public SafetyZoneSquare(String Colour) {
        super(Colour);

        isOccup = false;
    }
}

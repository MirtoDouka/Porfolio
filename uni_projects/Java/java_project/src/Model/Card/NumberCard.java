package Model.Card;

/**
 * This class creates a number card
 */

public class NumberCard extends Card {

    private boolean isPlayed;


    /**
     * Constructor
     * @post Creates a new card with value "value"
     * @param  value the value of the card
     * @param type the name of the card
     * @param descr the description of the card
     */

    public NumberCard(int value, String type, String descr){
        super(value ,type , descr);
        isPlayed = false;
    }



}

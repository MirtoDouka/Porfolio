package Model.AllCards;

import Model.Card.*;

import java.util.ArrayList;

import java.util.Collections;

/**
 * This class creates a new Collection of cards.
 */

public class AllCards<C> {


    public ArrayList<Card> cards ;

    /**Constructor.
     * @post Creates a new pack of cards with a new card ArrayList.
     */
    public AllCards()
    {
        cards = new ArrayList<Card>(44);


        for (int k = 0; k < 4; k++) {


            cards.add(new SimpleNumberCard(3));
            cards.add(new SimpleNumberCard(5));
            cards.add(new SimpleNumberCard(8));
            cards.add(new SimpleNumberCard(12));

            cards.add(new NumberElevenCard());
            cards.add(new NumberFourCard());
            cards.add(new NumberOneCard());
            cards.add(new NumberSevenCard());
            cards.add(new NumberTenCard());
            cards.add(new NumberTwoCard());
            cards.add(new SorryCard());

        }
        Collections.shuffle(cards);

    }


    public  ArrayList<Card> returnCards() {

        return cards;
    }

    /**
     * <b>Transformer:</b> Initializes and shuffles the cards.
     * @post The cards have been initialised and shuffled.
     */
   /* public void init_cards()
    {

        for (int k = 0; k < 4; k++) {


            cards.add(new SimpleNumberCard(3));
            cards.add(new SimpleNumberCard(5));
            cards.add(new SimpleNumberCard(8));
            cards.add(new SimpleNumberCard(12));

            cards.add(new NumberElevenCard());
            cards.add(new NumberFourCard());
            cards.add(new NumberOneCard());
            cards.add(new NumberSevenCard());
            cards.add(new NumberTenCard());
            cards.add(new NumberTwoCard());
            cards.add(new SorryCard());

        }
        Collections.shuffle(cards);

    }*/

    /**
     * <b>Transformer:</b> Removes a card from the list.
     * @post A card has been removed from the list.
     * @param i a card
     */
    public void RemoveCard(ArrayList<Card> i)
    {
        this.cards.remove(i);
    }


    /**
     * <b>Observer:</b> Returns true if this list contains no elements.
     * @post Returns true if this list contains no elements.
     * @return true if this list contains no elements
     */
    public boolean isEmpty(){
        if (cards.isEmpty()==true){
            return true;
        }
        return false;
    }

    /**
     * <b>Transformer:</b> Returns the size of a list.
     * @post The size of the card list has been returned.
     * @return size of the card list
     */
    public int size(){
        return cards.size();
    }

    /**
     * <b>Accessor:</b> returns the card in position j
     * @post the card in position j has been returned
     * @return the card in position j
     */
    public Card getCard(int j){
        return cards.get(j);
    }


    /**
     * <b>Transformer:</b> Clears an ArrayList
     * @post An ArrayList is cleared.
     */
    public void clearAll(){
        this.cards.clear();
    }


    /**
     * <b>Accessor:</b> returns all the cards
     * @post all the cards has been returned
     * @return all the cards
     */
    public ArrayList<Card> getCards(){
        return this.cards;
    }

}

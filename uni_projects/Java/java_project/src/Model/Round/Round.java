package Model.Round;

import Model.AllCards.AllCards;
public class Round {

    int type;

    private boolean RoundStarted, Selection;
    private AllCards cards = new AllCards();
    private AllCards RoundCard = new AllCards();
    private AllCards  PlayersCard = new AllCards();
    private String[] PreviousMove;

    /**
     * Constructor.
     *
     * @post Creates a new Round with type=0, roundStarted=false,
     * bomb_round=false, selection=false
     */
    public Round() {

        type = 0;
        RoundStarted = false;
        Selection = false;
    }


    /**
     * <b>transformer(mutative)</b>: Sets the Card that a player wants to play
     * @param card
     * @post the cardsToPlay is set
     */
    public void setCardToPlay(AllCards card) {
        this.cards = card;
    }


    /**
     * <b>transformer:</b> Sets the round
     * @post the type of the round has been set
     */
   /* public void setRoundType() {
        if ((cards.size() >= 4) && (checkBomb(cards) == true)) {
            type = 10;
        } else if ((cards.size() == 1) && (cards.getValue(0) == -1)) {
            type = -1;
        } else if ((cards.size() == 1) && (cards.getValue(0) != -1)) {
            type = 1;
        } else if ((cards.getCard(0).getValue() == -1) || (cards.getCard(cards.size() - 1).getValue() == 16)) {
            type = 0;
            return;
        } else if ((cards.size() == 2) && ((cards.getValue(0) == cards.getValue(1)) || (cards.getValue(1) == 15)) && (cards.getCard(0).getValue() != 1)) {

            type = 2;
        } else if ((cards.size() == 3) && (cards.getValue(0) == cards.getValue(1)) && ((cards.getValue(1) == cards.getValue(2)) || (cards.getValue(2) == 15))) {
            type = 3;
        } else if ((cards.size() >= 4) && (cards.getCard(0).getValue() > 1) && (cards.size() <= 14) && (cards.size() % 2 == 0) && (checkPairs() == true)) {

            type = 4;
        } else if (cards.size() >= 5) {

            if ((cards.size() == 5) && (checkFull() == true)) {
                type = 5;
            } else if (checkStraight() == true) {
                type = 6;
            }
        } else {
            type = 0;
        }
    }*/




    /**
     * <b>transformer:</b> Starts the round
     * @post the round has been started
     */
    public void RoundStarted() {
        this.RoundStarted = true;
    }


    /**
     * <b>Observer:</b> Checks if Round has started
     *
     * @return true if Round has started, else false
     * @post returns true if Round has started, else false
     */
    public boolean getRoundStarted() {
        return this.RoundStarted;
    }


    /**
     * <b>transformer:</b> Updates the cards left
     * @post removes the round card from the list
     * @param other card to be removed
     */
   /* public void UpdateCards(AllCards other) {
        for (int i = 0; i < other.size(); i++) {
            this.RoundCard.RemoveCard(other.getCard(i));
        }
    }*/


    /**
     * <b>Accessor:</b> Returns the card that has been played in this round
     * @return AllCards RoundCard
     * @post returns the card that has been played in this round
     */
    public AllCards GetRoundCard() {
        return this.RoundCard;
    }


    /**
     * <b>transformer:</b> Used in types
     * @post selection has been set to true
     */
    public void SetSelection(boolean b) {
        this.Selection = b;
    }

    /**
     * <b>transformer:</b> saves the last card that has been played
     * @post saves the last card that has been played
     */
    public void LastCards(AllCards LastCard) {
        PreviousMove = new String[LastCard.size()];
        for (int j = 0; j < LastCard.size(); j++) {
            PreviousMove[j] = LastCard.getCard(j).toString();
        }

    }

    /**
     * <b>Accessor:</b> Returns the last cards that have been played as a string array
     * @return the last cards that have been played as a string array
     * @post returns the last cards that have been played as a string array
     */
    public String[] GetLastCards() {

        return PreviousMove;
    }


}

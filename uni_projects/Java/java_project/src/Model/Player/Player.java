package Model.Player;

import Model.Card.Card;
import Model.Card.NumberTwoCard;
import Model.Pawn.Pawn;
import Model.Square.Square;
import Controller.*;

import java.util.ArrayList;

/**
 * Player class describes the characteristics of a player
 * and provides modification methods.
 */

public class Player {

    private String name;
    private Pawn pawn_1 , pawn_2;
    private String colour;
    private Card card;
    private int choice;
    private boolean hasPlayed,HasFinished , Finished ;
    private Square NewPosition , LastPosition;


    /**
     * Constructor
     * @post Creates and initializes a player with the given
     * name,pawns and ID.Also initializes some variables
     * @param name is the name of the player.
     * @param pawn_1 is the first pawn of the player
     * @param pawn_2 is the second pawn of the player
     */
    public Player(String name,String colour,  Pawn pawn_1 , Pawn pawn_2)
    {
        this.name = name;
        this.colour = colour;
        this.pawn_1 = new Pawn(this.colour , 1);
        this.pawn_2 = new Pawn(this.colour , 2);
        this.choice = 0;
        this.hasPlayed = false;
        this.Finished = false;
    }




    /**
     * <b>accessor(selector)</b>:Returns the pawns of the player <br />
     * @post returns the pawns of the player
     * @return the the pawns of the player
     */
    public Pawn GetPawn1()
    {
        return this.pawn_1 ;
    }

    /**
     * <b>accessor(selector)</b>:Returns the pawns of the player <br />
     * @post returns the pawns of the player
     * @return the the pawns of the player
     */
    public Pawn GetPawn2()
    {
        return this.pawn_2 ;
    }

    /**
     * <b>accessor(selector)</b>:Returns the choice of a player(ex.for NumberOneCard start from home or move one step) <br />
     * @post Returns the choice of a player(ex.for NumberOneCard start from home or move one step) </p>
     * @return 1 if player choice is start ,2 if is move or 0 if nothing
     */

    public Card GetCard(){
         return this.card;

    }




    /**
     * <b>Observer</b>:Returns if a player has played  <br />
     * @post Returns if a player has played
     * @return true if a player has played  false otherwise
     */
    public boolean HasPlayed()
    {
        return this.hasPlayed;
    }

    /**
     * <b>transformer(mutative)</b>: Sets the variable HasFinished to true
     * @post sets the variable HasFinished to true</p>
     */
    public void HasFinished()
    {
        this.Finished=true;
    }





}

package Model.Pawn;

import Model.Square.Square;

/**
 * This class creates a pawn for each player
 */

public class Pawn {

    public String colour;
    public Square  Position[][];
    private boolean isSet;
    public int id;
    private int x;


    /**
     * Constructor
     * @post creates and initializes a pawn with the given colour and position on desk
     * @param colour the colour of the pawn
     * @param id  the id of the pawn
     */
    public Pawn(String colour, int id ){

        this.colour = colour;
        this.id = id;
        this.x = 0;
    }



    /**
     * <b>transformer</b>: It sets the colour of the pawn <br />
     * @post the new colour of the pawn is set
     * @param colour the colour of the pawn
     */
    public void  SetPawnsColour(String colour){
        this.colour = colour;
    }

    /**
     * <b>accessor</b>: Returns the colour of the pawn <br />
     * @post Returns the colour of the pawn.
     * @return the colour of the pawn
     */
    public String  GetPawnsColour(){
        return this.colour;
    }


    /**
     * <b>accessor</b>: Returns the position of the pawn <br />
     * @post Returns the position of the pawn.
     * @return the position of the pawn
     */
    public int  Returnx(){
        return this.x;
    }

    /**
     * <b>transformer</b>: It sets the position of the pawn <br />
     * @post the new position of the pawn is set
     * @param x the position of the pawn
     */
    public void  Setx(int x){
        this.x = x;
    }



    /**
     * <b>Observer</b>:Returns if a pawn is set or not <br />
     * @post Returns if a pawn is set or not
     * @return true if the pawn is set, false otherwise
     */
    public boolean SetPawn(boolean isSet){
        return false;
    }


    /**
     * <b>Observer</b>:Returns if a pawn has finished <br />
     * @post Returns if a pawn has finished
     * @return true if the pawn has finished, false otherwise
     */
     public  boolean HasFinished(){
        return false;
     }




}

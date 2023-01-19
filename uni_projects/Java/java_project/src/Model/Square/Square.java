package Model.Square;

import Model.Pawn.Pawn;

/**
 * Contains the methods signatures needed for
 * creating each square of the deck
 */
public abstract class Square {


    public boolean isOccup = false;
    public int[][] Position = new int[16][16];
    public int[] SafePosition = new int [10];
    //public static Square Squ = new Square[60];
    public String Colour = null;
    public int x = 0;
    public int y = 0;



    /**Constructor.
     * @post Creates a new "Square" with colour "Colour" , at (x,y) point on deck
     * shows if is occupied or not
     * @param Colour the colour of the square
     */
    public Square( String Colour ){

        this.Colour = Colour;

    }




    /**
     * <b>transformer</b>: sets the colour of the current square <br />
     * @post the currents square colour is set
     * @param Colour the colour of the square
     */
    public void SetColour(String Colour){

    }


    /**
     * <b>accessor</b>:Returns the colour of the current square <br />
     * @post returns the colour of the current square
     * @return the colour of the current square
     */
    public String GetColour(){
        return this.Colour;
    }


    /**
     * <b>Observer</b>:Returns if the current square is occupied or not <br />
     * @post Returns if the current square is occupied or not
     * @return true if the square is occupied ,false otherwise
     */
    public boolean IsOccupied(){
        return false;
    }




    /**
     * <b>accessor</b>:Returns the position of the current square <br />
     * @post returns the position of the current square
     * @return the position of the current square
     */
    public int GetPosition(){

            return 0;
    }


    /**
     * <b>accessor</b>:Returns the colour of the pawn <br />
     * @post returns the colour of the pawn
     * @return the colour of the pawn
     */
    public  String CheckPawnsColour(Pawn pawn){

        if(pawn.colour == "red"){
            return "red";
        }
        else
            return "yellow";
    }




}

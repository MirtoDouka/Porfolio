package Model.Square;

import Model.Board.Deck2;
import Model.Pawn.Pawn;

/**
 * This class represents the "start square" of the deck
 */
public class StartSquare extends Square {

    public boolean isOccup = false;
    public Pawn pawn1 , pawn2;
    int[][] Position = new int[16][16];
    String Colour = null;
    public Square sc1 , sc2;
    public Deck2 deck;
    private Pawn extraPawn;

    /**Constructor.
     * @post Creates a new "Start Square" with colour "Colour" , at (x,y) point on deck
     * shows if is occupied or not
     * @param Colour the colour of the square
     */

    public StartSquare( String Colour ){
        super(Colour );
        isOccup = true;

       // InitStartSquare(pawn1 , pawn2 );

    }

  /*  public void InitStartSquare(Pawn pawn1 , Pawn pawn2){

        assert false;
        this.sc1.CheckPawnsColour(pawn1);
        this.sc2.CheckPawnsColour(pawn2);
        this.pawn1.id = 1;
        this.pawn2.id = 2;

        if(sc1.Colour == "red"){
            ;
        }


    }*/



}

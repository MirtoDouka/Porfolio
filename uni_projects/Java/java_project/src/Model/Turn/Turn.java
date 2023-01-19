package Model.Turn;

import Model.Player.Player;

/**
 * This class represents the turn of the game
 */
public class Turn {

    private int CurrentPlayer;
    private int num;
    private int LastPlayer;

    /**
     * Constructor
     * @post Creates a new instance of Turn
     */
    public Turn(){
        CurrentPlayer = 0;
        num = 2;
        this.LastPlayer = 0;
    }

    /**
     * @post returns true if a player has finished, else false
     * @return true if a player has finished, else false
     */
    public boolean CheckIfPlayerFinished(Player p)
    {
        /*if (p.GetCard().isEmpty()==true){
            p.HasFinished();
            return true;
        }*/
        return false;
    }

    /**
     * <b>Transformer:</b> Sets the most recent player who has moved his pawn.
     * @post The most recent player, who has moved his pawn has been set.
     * @param  LastPlayer
     */
    public void SetLastPlayer(int LastPlayer)
    {

    }

    /**
     * <b>Accessor(Selector):</b> returns the most recent player who has moved his pawn
     * @post the most recent player who has moved his pawn is returned
     * @return the most recent player who has moved his pawn
     */
    public int GetLastPlayer()
    {
        return this.LastPlayer;
    }



}

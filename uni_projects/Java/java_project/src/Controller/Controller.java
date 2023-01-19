package Controller;

import Model.Card.Card;
import Model.Board.Board;
import Model.Board.Deck2;
import Model.Pawn.Pawn;
import Model.Player.Player;
import Model.Round.Round;
import Model.Turn.Turn;
import Model.AllCards.AllCards;
import View.*;

import java.io.IOException;
import java.util.ArrayList;
import java.lang.NullPointerException;
import java.util.Collections;

/**
 * This class initializes the board and players
 * and contains the main function
 */


public class Controller {

    public static Controller pc;
    public  AllCards<Card> cards;
    private int fold;
    private boolean started;
    private Turn turn=new Turn();
    private Player player , winner;


    public Round round =new Round();


    public ArrayList<Card> pack;
    public static AllCards<Card> pck;

    public Pawn pb1;
    public Pawn pb2;
    public Pawn pa1;
    public Pawn pa2;
    public Player P1;
    public Player P2;


    /**
     * <b>transformer</b>: initializes the  the players and their pawns
     * @post initializes the players and their pawns
     */
    public void initPlayers(){

        pa1 = new Pawn("red" , 1);
        pa2 = new Pawn("red" , 2);
        pb1 = new Pawn("yellow" , 1);
        pb2 = new Pawn("yellow" , 2);



        P1 = new Player("Player1","red",pa1,pa2 );
        P2 = new Player("Player2","yellow" ,pb1,pb2);

    }


    /**
     * <b>Accessor(Selector):</b> returns a card for the player to play
     * @post player picks up a card
     * @return the card the player has to play
     */
    private Card PickCard(int i, ArrayList<Card> card) throws  NullPointerException{

        Card tmp ;
        tmp = card.get(i);

        return tmp;
    }


    /**
     * <b>transformer</b>: initializes the table for a new deal
     * @post initializes the table for a new deal
     */
    public void InitTable() {

        Board kl = new Board();

    }


    /**
     * main function
     * @param args
     * @throws IOException
     * @throws NullPointerException
     */

    public static void main(String[] args) throws IOException ,NullPointerException {

        Controller cont = new Controller();
        Board dk = new Board();
        ViewUI view = new ViewUI();
        Card move = null;


        cont.initPlayers();
        cont.InitTable();


        while(((cont.pa1.Returnx() != 56) && (cont.pa2.Returnx()) != 56)
                || ((cont.pb1.Returnx() != 56) && (cont.pb2.Returnx() != 56))){

            AllCards pack = new AllCards();


            for(int i = 0; i < 44; i++){

                System.out.println("PLAYER 1\n");
                Card card = cont.PickCard(i ,pack.cards);
                assert false;
                card.MovePawn(cont.pa1 , cont.pa2 , card , dk.Red);



                System.out.println("PLAYER 2\n");
                Card card2 = cont.PickCard(i + 1 ,pack.cards);
                assert false;
                card2.MovePawn(cont.pb1 , cont.pb2 , card2 , dk.Yellow);

            }

        }
        new ViewUI();

    }
}

package Model.Board;

import Model.Card.*;
import Model.Pawn.Pawn;
import Model.Square.*;


import java.util.ArrayList;

/**
 * This class initializes the cards and the board
 */

public class Deck2 {


    public Deck2(){

    }



    public static class Node{

        public  Square Squ;


        public Node next;
        public Node next2;
        public  int data ;
        public Pawn p1 ;
        public Pawn p2 ;





        public Node() {

        }
    }

    //Declaring head and tail pointer as null.
    public  Node firstSQ = null;
    public  Node lastSQ = null;
    public static Node first;





    //This function will add the new node at the end of the list.
    public void add(Square Squ, int dat){
        //Create new node
        Node newSQ = new Node();
        newSQ.Squ = Squ;
        Node tmp = new Node();
        tmp.Squ = Squ;

        //Checks if the list is empty.
        if(firstSQ == null) {

            firstSQ = newSQ;
            lastSQ = newSQ;
            first = firstSQ;
            first.data = 1;
            newSQ.next = firstSQ;

            newSQ.data = dat;

        }
        else {

            if(dat >=100 && dat <=105 )    //red safe zone
            {
                if(dat == 100){
                    lastSQ.next2 = newSQ;
                    lastSQ = newSQ;
                    lastSQ.next = null;

                    newSQ.data = dat;
                }
                else {
                    tmp = lastSQ;
                    while (tmp.next != null){
                        tmp = tmp.next;
                    }


                    lastSQ.next = newSQ;
                    lastSQ = newSQ;
                    lastSQ.next = null;

                    newSQ.data = dat;
                }


            }
            else if(dat >= 300 && dat <= 305 ){    //yellow safe zone
                if(dat == 300){
                    lastSQ.next2 = newSQ;
                    lastSQ = newSQ;
                    lastSQ.next = null;

                    newSQ.data = dat;
                }
                else {
                    tmp = lastSQ;
                    while (tmp.next != null){
                        tmp = tmp.next;
                    }


                    lastSQ.next = newSQ;
                    lastSQ = newSQ;
                    lastSQ.next = null;

                    newSQ.data = dat;
                }

            }
            else if (dat == 200 ){  //red start square


                    lastSQ.next2 = newSQ;
                    lastSQ = newSQ;
                    lastSQ.next2 = null;

                newSQ.data = dat;

            }
            else if (dat == 400 ){  //yellow start square


                    lastSQ.next2 = newSQ;
                    lastSQ = newSQ;
                    lastSQ.next2 = null;

                     newSQ.data = dat;

            }
            else {
                //tail will point to new node.
                lastSQ.next = newSQ;
                //New node will become new tail.
                lastSQ = newSQ;
                //Since, it is circular linked list tail will point to head.
                lastSQ.next = firstSQ;
                newSQ.data = dat;


            }
        }
    }





    /**
     * <b>accessor</b>: initialize a card  <br />
     * @post initializes a card
     */
    public void InitCard(){

    }

    /**
     * <b>accessor</b>: initialize the squares  <br />
     * @post initializes the squares
     */
    public void InitSquares(){


        Deck2 cl = new Deck2();


        cl.add(new SimpleSquare() , 1);
        cl.add(new StartSlideSquare("red") , 2);
        cl.add(new InternalSlideSquare("red") , 3);
        for(int i = 100; i < 105; i++){
            cl.add(new SafetyZoneSquare("red") , i);
        }
        cl.add(new HomeSquare("red"), 105);
        cl.add(new InternalSlideSquare("red") , 4);
        cl.add(new EndSlideSquare("red") , 5);
        cl.add(new StartSquare("red"), 200);
        for(int i = 6; i < 10; i++){
            cl.add(new SimpleSquare(), i);
        }
        cl.add(new StartSlideSquare("red"),10);
        for(int i = 11; i < 14; i++){
            cl.add(new InternalSlideSquare("red") , i);
        }
        cl.add(new EndSlideSquare("red") , 14);
        for(int i = 15; i < 17; i++){
            cl.add(new SimpleSquare() , i);
        }



        cl.add(new StartSlideSquare("blue"), 17);
        for(int i = 18; i < 20; i++){
            cl.add(new InternalSlideSquare("blue") , i);
        }
        cl.add(new EndSlideSquare("blue"), 20);
        for(int i = 21; i < 25; i++){
            cl.add(new SimpleSquare(), i);
        }
        cl.add(new StartSlideSquare("blue"), 25);
        for(int i = 26; i < 29; i++){
            cl.add(new InternalSlideSquare("blue") ,i);
        }
        cl.add(new EndSlideSquare("blue"), 29);
        for(int i = 30; i < 32; i++){
            cl.add(new SimpleSquare() , i);
        }

        cl.add(new StartSlideSquare("yellow") , 32);
        cl.add(new InternalSlideSquare("yellow") , 33);
        for(int i = 300; i < 305; i++){
           cl.add(new SafetyZoneSquare("yellow"), i);
        }
        cl.add(new HomeSquare("yellow") , 305);
        cl.add(new InternalSlideSquare("yellow"), 34);
        cl.add(new EndSlideSquare("yellow"), 35);
        cl.add(new StartSquare("yellow") , 400);
        for(int i = 36; i < 40; i++){
            cl.add(new SimpleSquare() , i);
        }
        cl.add(new StartSlideSquare("yellow") , 40);
        for(int i = 41; i < 44; i++){
            cl.add(new InternalSlideSquare("yellow") ,i);
        }
        cl.add(new EndSlideSquare("yellow") , 44);
        for(int i = 45; i < 47; i++){
            cl.add(new SimpleSquare() , i);
        }



        cl.add(new StartSlideSquare("green") , 47);
        for(int i = 48; i < 50; i++){
            cl.add(new InternalSlideSquare("green"), i);
        }
        cl.add(new EndSlideSquare("green") , 50);
        for(int i = 51; i < 55; i++){
            cl.add(new SimpleSquare() , i);
        }
        cl.add(new StartSlideSquare("green"), 55);
        for(int i = 56; i < 59; i++){
            cl.add(new InternalSlideSquare("green") , i);
        }
        cl.add(new EndSlideSquare("green"), 59);
        cl.add(new SimpleSquare() , 60);



    }



    public void traverseList() {
        Node currentNode = first;



        if (first != null) {
            do {

                currentNode = currentNode.next;
                //System.out.println(currentNode.data);

                if(currentNode.next2 != null){

                    currentNode = currentNode.next2;
                    //System.out.println(currentNode.data);
                    currentNode = currentNode.next;
                    //System.out.println(currentNode.data);
                }

            }while (currentNode != first);
        }
    }





    /**
     * <b>Observer</b>:Returns if the cards are over <br />
     * @post Returns if the cards are over
     * @return true if the cards are over ,false otherwise
     */
    public boolean CheckCards(){
        return false;
    }


    /**
     * <b>Observer</b>:Returns if the player can press fold <br />
     * @post Returns if the player can press fold
     * @return true if the player can press fold ,false otherwise
     */
    public boolean CheckForFold(){
        return false;
    }




    /**
     * <b>accessor</b>: Player takes a new card <br />
     * @post Player takes a new card
     * @return a new card from ArrayList<Card>
     */
    public ArrayList<Card> TakeNewCard(){
        int i = 0;
          return new ArrayList<Card>(i);

    }




}








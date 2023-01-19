package Model.Card;

import Model.Pawn.Pawn;
import Model.Square.EndSlideSquare;
import Model.Square.Square;
import Model.Square.StartSlideSquare;

import java.util.Scanner;

/**
 * Contains the methods  needed for
 * creating a card
 */

public abstract class Card {

    public int value;
    public String type;

    public String descr;
    public boolean isPlayed;


    public Card(int value, String type, String descr){
        this.value = value;
        this.type = type;
        this.descr = descr;
        isPlayed = false;
    }

    /**
     * Checks if a card has been played
     * @post check if a card has been played
     * @return  true if the hard has been played and false if not
     */
    public boolean IsPlayed() {

        return false;
    }


    /**
     * Returns the string representation of a card
     * @post The string representation of a card is returned
     * @return a string explaining the card
     */
    public String toString(){
            return this.descr.toString();

    }


    /**
     * <b>transformer</b>: It sets the position of the pawn <br />
     * @post the new position of the pawn is set
     * @param pawn1 first pawn of player
     * @param pawn2 second pawn of player
     * @param card the card the player has to play
     * @param square the table where the player has to play
     */

    public void MovePawn(Pawn pawn1 , Pawn pawn2 , Card card  , Square[] square){
        Pawn pawn = null;

        System.out.println(card.descr);

        Scanner sc = new Scanner(System.in);

        if(card.value == 3){
            String choice = sc.nextLine();

            switch (choice) {
                case "A": {

                    System.out.println("Choose pawn :\n1\n2");
                    Scanner sca = new Scanner(System.in);
                    String p = sca.nextLine();
                    if (p == "1") {
                        pawn = pawn1;
                    } else {
                        pawn = pawn2;
                    }

                    int tmp = 0;
                    tmp = pawn.Returnx();
                    tmp = tmp + 3;
                    pawn.Setx(tmp);
                }
                case "B":{
                    return;
                }
            }
        }
        else if(card.value == 5) {
            String choice = sc.nextLine();

            switch (choice) {
                case "A": {

                    System.out.println("Choose pawn :\n1\n2");
                    Scanner sca = new Scanner(System.in);
                    String p = sca.nextLine();
                    if (p == "1") {
                        pawn = pawn1;
                    } else {
                        pawn = pawn2;
                    }


                    int tmp = 0;
                    tmp = pawn.Returnx();
                    tmp = tmp + 5;
                    pawn.Setx(tmp);
                }
                case "B": {
                    return;
                }
            }
        }
        else if(card.value == 8){
            String choice = sc.nextLine();

            switch (choice) {
                case "A": {

                    System.out.println("Choose pawn :\n1\n2");
                    Scanner sca = new Scanner(System.in);
                    String p = sca.nextLine();
                    if (p == "1") {
                        pawn = pawn1;
                    } else {
                        pawn = pawn2;
                    }


                    int tmp = 0;
                    tmp = pawn.Returnx();
                    tmp = tmp + 8;
                    pawn.Setx(tmp);
                }
                case "B": {
                    return;
                }
            }
        }
        else if(card.value == 12){
            String choice = sc.nextLine();

            switch (choice) {
                case "A": {

                    System.out.println("Choose pawn :\n1\n2");
                    Scanner sca = new Scanner(System.in);
                    String p = sca.nextLine();
                    if (p == "1") {
                        pawn = pawn1;
                    } else {
                        pawn = pawn2;
                    }


                    int tmp = 0;
                    tmp = pawn.Returnx();
                    tmp = tmp + 12;
                    pawn.Setx(tmp);
                }
                case "B": {
                    return;
                }
            }
        }
        else if(card.value == 1){

            String choice = sc.nextLine();

            switch (choice) {
                case "A":{

                    System.out.println("Choose pawn :\n1\n2");
                    Scanner sca = new Scanner(System.in);
                    String p = sca.nextLine();
                    if (p == "1") {
                        pawn = pawn1;
                    } else {
                        pawn = pawn2;
                    }

                    pawn.Setx(1);
                }
                case "B": {

                    System.out.println("Choose pawn :\n1\n2");
                    Scanner sca = new Scanner(System.in);
                    String p = sca.nextLine();
                    if (p == "1") {
                        pawn = pawn1;
                    } else {
                        pawn = pawn2;
                    }

                    int tmp = 0;
                    tmp = pawn.Returnx();
                    tmp = tmp + 1;
                    pawn.Setx(tmp);
                }
                case "C": {
                    return;
                }
            }

        }
        else if(card.value == 2){

            String choice = sc.nextLine();

            switch (choice) {
                case "A":{

                    System.out.println("Choose pawn :\n1\n2");
                    Scanner sca = new Scanner(System.in);
                    String p = sca.nextLine();
                    if (p == "1") {
                        pawn = pawn1;
                    } else {
                        pawn = pawn2;
                    }

                    pawn.Setx(1);
                }
                case "B": {

                    System.out.println("Choose pawn :\n1\n2");
                    Scanner sca = new Scanner(System.in);
                    String p = sca.nextLine();
                    if (p == "1") {
                        pawn = pawn1;
                    } else {
                        pawn = pawn2;
                    }

                    int tmp = 0;
                    tmp = pawn.Returnx();
                    tmp = tmp + 2;
                    pawn.Setx(tmp);
                }
                case "C": {
                    return;
                }
            }

        }
        else if(card.value == 4) {

            String choice = sc.nextLine();

            switch (choice) {
                case "A": {

                    System.out.println("Choose pawn :\n1\n2");
                    Scanner sca = new Scanner(System.in);
                    String p = sca.nextLine();
                    if (p == "1") {
                        pawn = pawn1;
                    } else {
                        pawn = pawn2;
                    }

                    int tmp = pawn.Returnx();
                    if (tmp - 4 > 0) {
                        tmp = tmp - 4;
                        pawn.Setx(tmp);
                    } else {
                        int tmp2 = tmp - 4;
                        tmp = 65 + tmp2 + 1;
                        pawn.Setx(tmp);
                    }
                }
                case "B": {
                    return;
                }
            }
        }
        else if(card.value == 7) {

            String choice = sc.nextLine();

            switch (choice) {
                case "A": {

                    String p = null;
                    while (p != "0" || p != "1" || p != "2" || p != "3" || p != "4" || p != "5" || p != "6" || p != "7") {
                        System.out.println("Type move for pawn 1:");
                        Scanner k = new Scanner(System.in);
                        p = k.nextLine();
                        if (p == "0") {
                            int tmp = 0;
                            tmp = pawn2.Returnx();
                            tmp = tmp + 7;
                            pawn2.Setx(tmp);
                            break;
                        } else if (p == "1") {
                            int tmp = 0;
                            tmp = pawn1.Returnx();
                            tmp = tmp + 1;
                            pawn1.Setx(tmp);

                            int tmp2 = 0;
                            tmp2 = pawn2.Returnx();
                            tmp2 = tmp2 + 6;
                            pawn2.Setx(tmp2);
                            break;
                        } else if (p == "2") {
                            int tmp = 0;
                            tmp = pawn1.Returnx();
                            tmp = tmp + 2;
                            pawn1.Setx(tmp);

                            int tmp2 = 0;
                            tmp2 = pawn2.Returnx();
                            tmp2 = tmp2 + 5;
                            pawn2.Setx(tmp2);
                            break;
                        } else if (p == "3") {
                            int tmp = 0;
                            tmp = pawn1.Returnx();
                            tmp = tmp + 3;
                            pawn1.Setx(tmp);

                            int tmp2 = 0;
                            tmp2 = pawn2.Returnx();
                            tmp2 = tmp2 + 4;
                            pawn2.Setx(tmp2);
                            break;
                        } else if (p == "4") {
                            int tmp = 0;
                            tmp = pawn2.Returnx();
                            tmp = tmp + 3;
                            pawn2.Setx(tmp);

                            int tmp2 = 0;
                            tmp2 = pawn1.Returnx();
                            tmp2 = tmp2 + 4;
                            pawn1.Setx(tmp2);
                            break;
                        } else if (p == "5") {
                            int tmp = 0;
                            tmp = pawn2.Returnx();
                            tmp = tmp + 2;
                            pawn2.Setx(tmp);

                            int tmp2 = 0;
                            tmp2 = pawn1.Returnx();
                            tmp2 = tmp2 + 5;
                            pawn1.Setx(tmp2);
                            break;
                        } else if (p == "6") {
                            int tmp = 0;
                            tmp = pawn2.Returnx();
                            tmp = tmp + 1;
                            pawn2.Setx(tmp);

                            int tmp2 = 0;
                            tmp2 = pawn1.Returnx();
                            tmp2 = tmp2 + 6;
                            pawn1.Setx(tmp2);
                            break;
                        } else if (p == "7") {
                            int tmp = 0;
                            tmp = pawn1.Returnx();
                            tmp = tmp + 7;
                            pawn1.Setx(tmp);
                            break;
                        }
                    }
                }
                case "B": {
                    return;
                }
            }
        }
        else if(card.value == 10){

            String choice = sc.nextLine();

            switch (choice) {
                case "A":{

                    System.out.println("Choose pawn :\n1\n2");
                    Scanner sca = new Scanner(System.in);
                    String p = sca.nextLine();
                    if (p == "1") {
                        pawn = pawn1;
                    } else {
                        pawn = pawn2;
                    }

                    int tmp = 0;
                    tmp = pawn.Returnx();
                    tmp = tmp + 10;
                    pawn.Setx(tmp);
                }
                case "B": {

                    System.out.println("Choose pawn :\n1\n2");
                    Scanner sca = new Scanner(System.in);
                    String p = sca.nextLine();
                    if (p == "1") {
                        pawn = pawn1;
                    } else {
                        pawn = pawn2;
                    }

                    int tmp = pawn.Returnx();
                    if(tmp == 0){
                        pawn.Setx(65);
                    }
                    else{
                        pawn.Setx(tmp - 1);
                    }
                }
                case "C":{
                    return;
                }
            }
        }

        if(square[pawn1.Returnx()] instanceof StartSlideSquare){
            int tmp = pawn1.Returnx();
            do {
                pawn1.Setx(tmp++);
            }while(square[pawn1.Returnx()] instanceof EndSlideSquare);
        }
        if(square[pawn2.Returnx()] instanceof StartSlideSquare){
            int tmp = pawn2.Returnx();
            do {
                pawn2.Setx(tmp++);
            }while(square[pawn2.Returnx()] instanceof EndSlideSquare);
        }

        String x = null;
        if(pawn1.colour == "red"){
             x = "1";
        }
        else{
            x = "2";
        }
        System.out.println("\nPlayer's" + x + " first pawn is at " + pawn1.Returnx() +
                " and second pawn at " + pawn2.Returnx());

    }

}




package Model.Board;

import Model.Square.*;

public class Board {


    public Square[] Red;
    public Square[] Yellow;


    /**
     * Constructor
     * Initiliaze the Board Squares
     */
    public Board() {

        Red = new Square[66];
        Yellow = new Square[66];


        Red[0] = new StartSquare("red");
        Red[1] = new SimpleSquare();
        Red[2] = new SimpleSquare();
        Red[3] = new SimpleSquare();
        Red[4] = new SimpleSquare();
        Red[5] = new SimpleSquare();
        Red[6] = new SimpleSquare();
        Red[7] = new SimpleSquare();
        Red[8] = new SimpleSquare();
        Red[9] = new SimpleSquare();
        Red[10] = new SimpleSquare();
        Red[11] = new SimpleSquare();
        Red[12] = new SimpleSquare();

        Red[13] = new StartSlideSquare("blue");
        Red[14] = new InternalSlideSquare("blue");
        Red[15] = new InternalSlideSquare("blue");
        Red[16] = new EndSlideSquare("blue");
        Red[17] = new SimpleSquare();
        Red[18] = new SimpleSquare();
        Red[19] = new SimpleSquare();
        Red[20] = new SimpleSquare();
        Red[21] = new StartSlideSquare("blue");
        Red[22] = new InternalSlideSquare("blue");
        Red[23] = new InternalSlideSquare("blue");
        Red[24] = new InternalSlideSquare("blue");
        Red[25] = new EndSlideSquare("blue");
        Red[26] = new SimpleSquare();
        Red[27] = new SimpleSquare();

        Red[28] = new StartSlideSquare("yellow");
        Red[29] = new InternalSlideSquare("yellow");
        Red[30] = new InternalSlideSquare("yellow");
        Red[31] = new EndSlideSquare("yellow");
        Red[32] = new SimpleSquare();
        Red[33] = new SimpleSquare();
        Red[34] = new SimpleSquare();
        Red[35] = new SimpleSquare();
        Red[36] = new StartSlideSquare("yellow");
        Red[37] = new InternalSlideSquare("yellow");
        Red[38] = new InternalSlideSquare("yellow");
        Red[39] = new InternalSlideSquare("yellow");
        Red[40] = new EndSlideSquare("yellow");
        Red[41] = new SimpleSquare();
        Red[42] = new SimpleSquare();

        Red[43] = new StartSlideSquare("green");
        Red[44] = new InternalSlideSquare("green");
        Red[45] = new InternalSlideSquare("green");
        Red[46] = new EndSlideSquare("green");
        Red[47] = new SimpleSquare();
        Red[48] = new SimpleSquare();
        Red[49] = new SimpleSquare();
        Red[50] = new SimpleSquare();
        Red[51] = new StartSlideSquare("green");
        Red[52] = new InternalSlideSquare("green");
        Red[53] = new InternalSlideSquare("green");
        Red[54] = new InternalSlideSquare("green");
        Red[55] = new EndSlideSquare("green");
        Red[56] = new SimpleSquare();
        Red[57] = new SimpleSquare();

        Red[58] = new StartSlideSquare("red");
        Red[59] = new InternalSlideSquare("red");

        Red[60] = new SafetyZoneSquare("red");
        Red[61] = new SafetyZoneSquare("red");
        Red[62] = new SafetyZoneSquare("red");
        Red[63] = new SafetyZoneSquare("red");
        Red[64] = new SafetyZoneSquare("red");
        Red[65] = new HomeSquare("red");


        Yellow[0] = new StartSquare("yellow");
        Yellow[1] = new SimpleSquare();
        Yellow[2] = new SimpleSquare();
        Yellow[3] = new SimpleSquare();
        Yellow[4] = new SimpleSquare();
        Yellow[5] = new SimpleSquare();
        Yellow[6] = new SimpleSquare();
        Yellow[7] = new SimpleSquare();
        Yellow[8] = new SimpleSquare();
        Yellow[9] = new SimpleSquare();
        Yellow[10] = new SimpleSquare();
        Yellow[11] = new SimpleSquare();
        Yellow[12] = new SimpleSquare();

        Yellow[13] = new StartSlideSquare("green");
        Yellow[14] = new InternalSlideSquare("green");
        Yellow[15] = new InternalSlideSquare("green");
        Yellow[16] = new EndSlideSquare("green");
        Yellow[17] = new SimpleSquare();
        Yellow[18] = new SimpleSquare();
        Yellow[19] = new SimpleSquare();
        Yellow[20] = new SimpleSquare();
        Yellow[21] = new StartSlideSquare("green");
        Yellow[22] = new InternalSlideSquare("green");
        Yellow[23] = new InternalSlideSquare("green");
        Yellow[24] = new InternalSlideSquare("green");
        Yellow[25] = new EndSlideSquare("green");
        Yellow[26] = new SimpleSquare();
        Yellow[27] = new SimpleSquare();

        Yellow[28] = new StartSlideSquare("red");
        Yellow[29] = new InternalSlideSquare("red");
        Yellow[30] = new InternalSlideSquare("red");
        Yellow[31] = new EndSlideSquare("red");
        Yellow[32] = new SimpleSquare();
        Yellow[33] = new SimpleSquare();
        Yellow[34] = new SimpleSquare();
        Yellow[35] = new SimpleSquare();
        Yellow[36] = new StartSlideSquare("red");
        Yellow[37] = new InternalSlideSquare("red");
        Yellow[38] = new InternalSlideSquare("red");
        Yellow[39] = new InternalSlideSquare("red");
        Yellow[40] = new EndSlideSquare("red");
        Yellow[41] = new SimpleSquare();
        Yellow[42] = new SimpleSquare();

        Yellow[43] = new StartSlideSquare("blue");
        Yellow[44] = new InternalSlideSquare("blue");
        Yellow[45] = new InternalSlideSquare("blue");
        Yellow[46] = new EndSlideSquare("blue");
        Yellow[47] = new SimpleSquare();
        Yellow[48] = new SimpleSquare();
        Yellow[49] = new SimpleSquare();
        Yellow[50] = new SimpleSquare();
        Yellow[51] = new StartSlideSquare("blue");
        Yellow[52] = new InternalSlideSquare("blue");
        Yellow[53] = new InternalSlideSquare("blue");
        Yellow[54] = new InternalSlideSquare("blue");
        Yellow[55] = new EndSlideSquare("blue");
        Yellow[56] = new SimpleSquare();
        Yellow[57] = new SimpleSquare();

        Yellow[58] = new StartSlideSquare("yellow");
        Yellow[59] = new InternalSlideSquare("yellow");

        Yellow[60] = new SafetyZoneSquare("yellow");
        Yellow[61] = new SafetyZoneSquare("yellow");
        Yellow[62] = new SafetyZoneSquare("yellow");
        Yellow[63] = new SafetyZoneSquare("yellow");
        Yellow[64] = new SafetyZoneSquare("yellow");
        Yellow[65] = new HomeSquare("yellow");


    }






}

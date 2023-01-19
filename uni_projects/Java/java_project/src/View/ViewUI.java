package View;



import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.net.URL;

import Controller.Controller;
import Model.Board.Deck2;


/**
 * This class creates the graphics of the game
 */

public class ViewUI extends JFrame {


    public JLabel PA1, PA2, PB1, PB2;
    public Deck2 node;
    public int[] array = new int[4];


    //public JFrame frame;
    public JMenuBar menuBar;
    private JLayeredPane layeredPane;
    public ViewUI Squares;
    private JPanel tablo;
    private URL imageURL;
    private ClassLoader cldr;
    private ImageIcon image;
    private JButton FoldButton;
    private JTextField TxtField;
    private JButton HiddenCards;
    private JButton ShownCards;
    private JLabel Start_red, Start_red2, Start_yellow, Start_yellow2;
    private JFrame frame;
    private Deck2.Node travel;
    public ViewUI k;
    public Controller cont;


    public ViewUI() throws NullPointerException, IOException {



        //Frame
        JFrame frame = new JFrame("Sorry Game");
        frame.setSize(800, 800);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        //Menu Bar
        JMenuBar menuBar = new JMenuBar();
        menuBar.setVisible(true);
        JMenu newGame = new JMenu("New Game");
        menuBar.add(newGame);
        JMenu saveGame = new JMenu("Save Game");
        menuBar.add(saveGame);
        JMenu ContSavedGame = new JMenu("Continue Saved Game");
        menuBar.add(ContSavedGame);
        JMenu exitGame = new JMenu("Exit Game");
        menuBar.add(exitGame);

        frame.setJMenuBar(menuBar);


        //Tablo
        JPanel tablo = new JPanel();
        tablo.setLayout(null);
        tablo.setBounds(82, 116, 583, 583);
        tablo.setBackground(Color.black);
        tablo.setOpaque(true);


        JLabel Squares[][] = new JLabel[16][16];

        for (int i = 0; i < 16; i++) {
            for (int j = 0; j < 16; j++) {

                Squares[i][j] = new JLabel();
                Squares[i][j].setLayout(null);
                if (i == 0 && j == 0) { //first square of first line
                    Squares[0][0].setBounds(6, 5, 42, 42);
                    Squares[i][j].setBackground(Color.white);
                }
                if (i == 0 && j != 0) { //other squares of first line
                    Squares[0][j].setBounds((42 * j) + j + 6, 5, 42, 42);
                    Squares[i][j].setBackground(Color.white);
                } else if (i == 15 && j == 0) { //first square of last line
                    Squares[15][0].setBounds(6, 653, 42, 42);
                    Squares[i][j].setBackground(Color.white);
                } else if (i == 15 && j != 0) {  //other squares of last line
                    Squares[15][j].setBounds((42 * j) + j + 6, 653, 42, 42);
                    Squares[i][j].setBackground(Color.white);
                } else if (i != 0 && j == 0) { // other squares of first column
                    Squares[i][0].setBounds(5, (42 * i) + i + 5, 42, 42);
                    Squares[i][j].setBackground(Color.white);
                } else if (i != 0 && j == 15) { // other squares of last column
                    Squares[i][15].setBounds(652, (42 * i) + i + 5, 42, 42);
                    Squares[i][j].setBackground(Color.white);
                } else if (j == 2 && (i >= 1 && i <= 5)) { //red safety squares
                    Squares[i][2].setBounds(91, (42 * i) + i + 5, 42, 42);
                    Squares[i][j].setBackground(Color.red);
                } else if (j == 13 && (i >= 10 && i <= 14)) { //yellow safety squares
                    Squares[i][13].setBounds(566, (42 * i) + i + 5, 42, 42);
                    Squares[i][13].setBackground(Color.yellow);
                }

                Squares[i][j].setOpaque(true);

            }
        }



        Squares[0][1].setIcon(new ImageIcon("redSlideStart.png"));
        Squares[0][9].setIcon(new ImageIcon("redSlideStart.png"));

        Squares[1][15].setIcon(new ImageIcon("blueSlideStart.png"));
        Squares[9][15].setIcon(new ImageIcon("blueSlideStart.png"));

        Squares[15][6].setIcon(new ImageIcon("yellowSlideStart.png"));
        Squares[15][14].setIcon(new ImageIcon("yellowSlideStart.png"));

        Squares[6][0].setIcon(new ImageIcon("greenSlideStart.png"));
        Squares[14][0].setIcon(new ImageIcon("greenSlideStart.png"));

        Squares[0][2].setIcon(new ImageIcon("redSlideMedium.png"));
        Squares[0][3].setIcon(new ImageIcon("redSlideMedium.png"));
        Squares[0][10].setIcon(new ImageIcon("redSlideMedium.png"));
        Squares[0][11].setIcon(new ImageIcon("redSlideMedium.png"));
        Squares[0][12].setIcon(new ImageIcon("redSlideMedium.png"));

        Squares[2][15].setIcon(new ImageIcon("blueSlideMedium.png"));
        Squares[3][15].setIcon(new ImageIcon("blueSlideMedium.png"));
        Squares[10][15].setIcon(new ImageIcon("blueSlideMedium.png"));
        Squares[11][15].setIcon(new ImageIcon("blueSlideMedium.png"));
        Squares[12][15].setIcon(new ImageIcon("blueSlideMedium.png"));

        Squares[15][3].setIcon(new ImageIcon("yellowSlideMedium.png"));
        Squares[15][4].setIcon(new ImageIcon("yellowSlideMedium.png"));
        Squares[15][5].setIcon(new ImageIcon("yellowSlideMedium.png"));
        Squares[15][12].setIcon(new ImageIcon("yellowSlideMedium.png"));
        Squares[15][13].setIcon(new ImageIcon("yellowSlideMedium.png"));

        Squares[3][0].setIcon(new ImageIcon("greenSlideMedium.png"));
        Squares[4][0].setIcon(new ImageIcon("greenSlideMedium.png"));
        Squares[5][0].setIcon(new ImageIcon("greenSlideMedium.png"));
        Squares[12][0].setIcon(new ImageIcon("greenSlideMedium.png"));
        Squares[13][0].setIcon(new ImageIcon("greenSlideMedium.png"));

        Squares[0][4].setIcon(new ImageIcon("redSlideEnd.png"));
        Squares[0][13].setIcon(new ImageIcon("redSlideEnd.png"));

        Squares[4][15].setIcon(new ImageIcon("blueSlideEnd.png"));
        Squares[13][15].setIcon(new ImageIcon("blueSlideEnd.png"));

        Squares[15][2].setIcon(new ImageIcon("yellowSlideEnd.png"));
        Squares[15][11].setIcon(new ImageIcon("yellowSlideEnd.png"));

        Squares[2][0].setIcon(new ImageIcon("greenSlideEnd.png"));
        Squares[11][0].setIcon(new ImageIcon("greenSlideEnd.png"));


        for (int i = 0; i < 16; i++) {
            for (int j = 0; j < 16; j++) {
                Squares[i][j].setOpaque(true);
                tablo.add(Squares[i][j]);
            }
        }


        //Home Square
        JLabel Red_home2 = new JLabel("HOME");
        Red_home2.setLayout(null);
        Red_home2.setBounds(79, 261, 76, 76);
        Red_home2.setBackground(Color.white);
        Red_home2.setOpaque(true);
        tablo.add(Red_home2);

        JLabel Red_home = new JLabel();
        Red_home.setLayout(null);
        Red_home.setBounds(74, 256, 84, 84);
        Red_home.setBackground(Color.red);
        Red_home.setOpaque(true);
        tablo.add(Red_home);

        JLabel Yellow_home2 = new JLabel("HOME");
        Yellow_home2.setLayout(null);
        Yellow_home2.setBounds(547, 360, 76, 76);
        Yellow_home2.setBackground(Color.white);
        Yellow_home2.setOpaque(true);
        tablo.add(Yellow_home2);

        JLabel Yellow_home = new JLabel();
        Yellow_home.setLayout(null);
        Yellow_home.setBounds(542, 355, 84, 84);
        Yellow_home.setBackground(Color.yellow);
        Yellow_home.setOpaque(true);
        tablo.add(Yellow_home);


        //Start Square
        JLabel Start_red = new JLabel("START");
        Start_red.setLayout(null);
        Start_red.setBounds(155, 52, 76, 76);
        Start_red.setBackground(Color.white);
        Start_red.setOpaque(true);
        tablo.add(Start_red);

        JLabel Start_red2 = new JLabel();
        Start_red2.setLayout(null);
        Start_red2.setBounds(150, 47, 84, 84);
        Start_red2.setBackground(Color.red);
        Start_red2.setOpaque(true);
        tablo.add(Start_red2);

        JLabel Start_yellow = new JLabel("START");
        Start_yellow.setLayout(null);
        Start_yellow.setBounds(460, 570, 76, 76);
        Start_yellow.setBackground(Color.white);
        Start_yellow.setOpaque(true);
        tablo.add(Start_yellow);

        JLabel Start_yellow2 = new JLabel();
        Start_yellow2.setLayout(null);
        Start_yellow2.setBounds(455, 565, 84, 84);
        Start_yellow.setBackground(Color.yellow);
        Start_yellow2.setOpaque(true);
        tablo.add(Start_yellow2);




        //Sorry logo
        JLabel SorryLogo = new JLabel();
        SorryLogo.setLayout(null);
        SorryLogo.setBounds(160, 300, 380, 120);
        SorryLogo.setIcon(new ImageIcon("sorryImage.png"));
        SorryLogo.setOpaque(true);
        tablo.add(SorryLogo);


        //tablo inside
        JLabel ins_tab = new JLabel();
        ins_tab.setLayout(null);
        ins_tab.setBounds(49, 49, 601, 601);
        ins_tab.setBackground(Color.CYAN);
        ins_tab.setOpaque(true);
        tablo.add(ins_tab);


        //Background
        //ImageIcon image = new ImageIcon("C:/Users/macbook/Desktop/images/background.png");
        JPanel content = new JPanel();
        content.setLayout(null);
        content.add(new JLabel(new ImageIcon("background.png")));
        //content.setBackground(Color.green);
        content.add(tablo);


        tablo.setBounds(0, 0, 700, 700);

        //Fold Button
        JButton FoldButton = new JButton("FOLD");
        FoldButton.setLayout(null);
        FoldButton.setBounds(800, 360, 450, 80);
        /*imageURL= cldr.getResource("C://Users/macbook/Desktop/images/background.png");
        assert imageURL != null;
        FoldButton.setIcon(new ImageIcon(imageURL));*/
        FoldButton.setBackground(Color.red);
        FoldButton.setForeground(Color.RED);
        content.add(FoldButton, JLayeredPane.DEFAULT_LAYER);


        //Text Field
        JTextField TxtField = new JTextField();
        TxtField.setBounds(800, 450, 450, 250);
        content.add(TxtField, JLayeredPane.DEFAULT_LAYER);
        TxtField.setBackground(Color.white);
        TxtField.setEditable(false);


        //Hidden Cards
        JButton HiddenCards = new JButton();
        HiddenCards.setLayout(null);
        HiddenCards.setBounds(800, 10, 220, 340);
        HiddenCards.setIcon(new ImageIcon("backCard.png"));
        content.add(HiddenCards, JLayeredPane.DEFAULT_LAYER);


        //Shown Cards
        JButton ShownCards = new JButton();
        ShownCards.setLayout(null);
        ShownCards.setBounds(1030, 10, 220, 340);


        content.add(ShownCards, JLayeredPane.DEFAULT_LAYER);

        frame.setContentPane(content);
        frame.setVisible(true);


    }


}




"Sorry" Board Game

The objective is to be the first player to get all of their coloured pawns from their start space, 
around the board to their "home" space. The game is played between two people.
The pawns are normally moved in a clockwise direction but can be moved backward if directed.

The implementation of the project requires the use of MVC Architecture in Java.
The task consists of the basic packages Model, which contains classes that create objects and methods useful for the game, 
View, which handles the graphical representation of the game, 
and Controller, which synchronizes and works together with the previous packages.

The Model package consists of the classes:
-Card
-AllCards
-Pawn
-Square
-Player
-Turn
-Deck
The Μodel package with the Cards and AllCards classes initializes the cards and shuffles the deck.  
Player and Pawn initialize the players and their pawns respectively. 
Functions are included which set and control their suit, as well as their position on the board.  
The Board class initializes two boards that individually form each player's board. 
Finally, Square initializes each square and sets the corresponding color.

The Controller contains the methods that initialize the cards and boards, 
check for Fold, and which player's turn it is to play, as well as whether the game or round is over.
The Controller calls the functions that initialize the board, players and pieces and initializes the deck of cards. 
Through main he controls the flow of the game.

The View package consists of the classes:
-ViewUI
-CardListener
-MenuListener
-FoldListener
The ViewUI class initializes the dashboard. 
It contains the menu, the fold button, the cards, the playmat and the squares. 

import board.Board;
import characters.Personnage;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Random;

import board.Case;

public class Game {
    private final Menu menu;
    private Personnage personnage;
    private Board board;


    public Game() {
        this.menu = new Menu();
        this.board = new Board(10);
        this.personnage = createCharacter();
    }

    public void gameInit() {
        this.board = new Board(10);
        this.personnage = createCharacter();
        game();
    }

    public Personnage createCharacter() {
        Personnage personnage = menu.selectNameAndType();
        menu.confirmeCharacter(personnage);
        personnage.setPosition(1);
        return personnage;
    }

    //Fin du jeu si le personnage meurt
    public void isPlayerDead() {
        if (personnage.getLife() < 1) {
            menu.gameEnd();
        }
    }

    //Découpé cette monstruosité
    public void game() {
        do {
            //Propose au joueur de quitter la partie a chaque tour.
            boolean playerChooseToContinu = menu.continueToPlay();
            if (!playerChooseToContinu) {
                menu.gameEnd();
            }

            menu.displayPlayerCurrentPosition(personnage);

            //S'il continue de jouer, il lance un dès et sa position est update.
            int updatedPosition = movePlayer(personnage);
            this.personnage.setPosition(updatedPosition);


            //Clunky "mange" une case ou out of bound
            if (isGameOver()) {
                menu.victory(personnage);
                gameInit();
            } else {
                //Out of bound sans la conditionnel
                board.faitParChatGaby(personnage);
                menu.playNewPosition(personnage);
            }
        }
        while (!isGameOver());
    }


    public boolean isGameOver() {
        boolean hasWon = personnage.getPosition() >= this.board.getBoardSize();
        boolean isDead = personnage.getLife() < 1;
        return isDead || hasWon;
    }

    /*
//
//            isPlayerDead();
//            menu.playerCurrentPosition(personnage);
//
//            //Propose au joueur de quitter la partie a chaque tour.
//            String playerChooseToContinu = menu.continueToPlay();
//
//            if (Objects.equals(playerChooseToContinu, "continue")) {
//
//                //S'il continue de jouer, il lance un dès et sa position est update.
//                int newPlayerPosition = movePlayer(personnage);
//
//                //NAZE comment faire ?
//                if (newPlayerPosition >= gameBoard.size()) {
//                    menu.victory(personnage);
////                    break;
//                }
////                else {
//                //Fait par Gaby
//                Case actuel = gameBoard.get(newPlayerPosition);
//                actuel.event();
//                actuel.interaction(personnage);
//
//                //
//                personnage.setPosition(newPlayerPosition);
//                menu.playNewPosition(personnage);
//
//                //try/catch fait sur demande du kit de développement... Je n'engage aucune responsabilité dans cette "chose".
////                try {
////                    if (newPlayerPosition > gameBoard.size()) {
////                        throw new CharOutOfBound("Your position is : 64");
////                    }
////                } catch (CharOutOfBound e) {
////                    System.out.println(e.getMessage());
////                }
//            }
////            }
//        }
    //Message de victoire
//            if (menu.victory(personnage)) gameInit();


    //Compte les tours
//            int turnPlayed = 0;
//            menu.turnCounter(turnPlayed);
//            turnPlayed++;
    //Affiche la position du joueur.
//    public void turnCounter(int counter) {
//        menu.turnCounter(counter);
//    }
*/
    public int movePlayer(Personnage personnage) {
        return personnage.getPosition() + dice();
    }

    //Lance un dès et affiche le result
    public int dice() {
        Random randomNumbers = new Random();
//        int diceRoll = randomNumbers.nextInt(6) + 1;
        int diceRoll = 1;
        menu.diceResult(diceRoll);
        return diceRoll;
    }

}
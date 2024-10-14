import board.Board;
import characters.Personnage;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Random;

import board.Case;

public class Game {
    private Menu menu;
    private Personnage personnage;
    private Board board;


    public Game() {
        this.menu = new Menu();
        this.board = new Board(10);
    }

    public void gameInit() {
        createCharacter();
        game();
        //comfirme replay
        /*if replay return inti*/
    }

    public void createCharacter() {
        this.personnage = menu.selectNameAndType();
        menu.confirmeCharacter(this.personnage);
        personnage.setPosition(1);
    }

    //Fin du jeu si le personnage meurt
    public void isPlayerDead() {
        if (personnage.getLife() < 1) {
            menu.gameEnd();
        }
    }

    //Découpé cette monstruosité
    public void game() {
        ArrayList<Case> gameBoard = board.getBoard();
        do {
            //Vérif si player est en vie
            isPlayerDead();

            //Donne la pos actuel de player
            menu.playerCurrentPosition(personnage);

            //Propose au joueur de quitter la partie a chaque tour.
            String playerChooseToContinu = menu.continueToPlay();
            if (Objects.equals(playerChooseToContinu, "throwTheDiceToMove")) {

                //S'il continue de jouer, il lance un dès et sa position est update.
                int newPlayerPosition = movePlayer(personnage);
                if (newPlayerPosition >= gameBoard.size()) {
                   if(menu.victory(personnage)){
                       gameInit();
                   }
                }
                //Fait par Gaby
                Case actuel = gameBoard.get(newPlayerPosition);
                actuel.event();
                actuel.interaction(personnage);

                personnage.setPosition(newPlayerPosition);
                menu.playNewPosition(personnage);
            }
        }
        while (personnage.getPosition() <= gameBoard.size());
    }

    /*
//        {
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
        menu.playerCurrentPosition(personnage);
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
package core;

import board.Board;
import board.Dice;
import characters.Personnage;

/**
 * The type core.Game.
 */
public class Game {
    private final Menu menu;
    private Personnage personnage;
    private Board board;
    private Dice dice;

    /**
     * Instantiates a new core.Game.
     */
    public Game() {
        this.menu = new Menu();
        this.board = new Board(20);
        this.personnage = createCharacter();
        this.dice = new Dice();
    }

    /**
     * core.Game init.
     */
    public void gameInit() {
        this.board = new Board(10);
        this.personnage = createCharacter();
        game();
    }

    /**
     * Create character personnage.
     *
     * @return the personnage
     */
    public Personnage createCharacter() {
        personnage = menu.selectNameAndType();
        menu.confirmeCharacter(personnage);
        personnage.setPosition(1);
        return personnage;
    }

    /**
     * Is player dead.
     */
//Fin du jeu si le personnage meurt
    public void isPlayerDead() {
        if (personnage.getLife() < 1) {
            menu.gameEnd();
        }
    }

    /**
     * core.Game.
     */
//Découpé cette monstruosité
    public void game() {
        do {
            menu.displayPlayerCurrentPosition(personnage);
            //Propose au joueur de quitter la partie a chaque tour.
            boolean playerChooseToContinu = menu.continueToPlay();

            if (!playerChooseToContinu) {
                menu.gameEnd();
            }


            //S'il continue de jouer, il lance un dès et sa position est update.
            int updatedPosition = movePlayer(personnage);
            this.personnage.setPosition(updatedPosition);
            menu.playNewPosition(personnage);


            //Clunky "mange" une case ou out of bound
            if (isGameOver()) {
                menu.victoryMessage(personnage);
                gameInit();
            } else {
                //Out of bound sans la conditionnel
                board.faitParChatGaby(personnage);
            }
        }
        while (!isGameOver());
    }


    /**
     * Is game over boolean.
     *
     * @return the boolean
     */
    public boolean isGameOver() {
        boolean hasWon = personnage.getPosition() >= this.board.getBoardSize();
        boolean isDead = personnage.getLife() < 1;
        return isDead || hasWon;
    }

    /**
     * Move player int.
     *
     * @param personnage the personnage
     * @return the int
     */
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
////                        throw new core.CharOutOfBound("Your position is : 64");
////                    }
////                } catch (core.CharOutOfBound e) {
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
        return personnage.getPosition() + dice.diceRoll();
    }

    /**
     * board.Dice int.
     *
     * @return the int
     */
//Lance un dès et affiche le result


}
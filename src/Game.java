import java.util.ArrayList;
import java.util.Objects;
import java.util.Random;

public class Game {
    private Menu menu;
    private Personnage personnage;
    private Board board;


    public Game() {
        this.menu = new Menu();
        this.board= new Board(4);
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

    public void game() {
        ArrayList<Case> boardd= board.getBoard();
        while (personnage.getPosition() < 64) {
            //Fin du jeu si le personnage meurt
            if (personnage.getLife() <1) {
                menu.gameEnd();
            }
            //Compte les tours
//            int turnPlayed = 0;
//            turnCounter(turnPlayed);
//            turnPlayed++;
            //Affiche la position du joueur.
            menu.playerCurrentPosition(personnage);

            //Propose au joueur de quitter la partie a chaque tour.
            String playerChooseToContinu = menu.continueToPlay();
            if (Objects.equals(playerChooseToContinu, "continue")) {
                //S'il continue de jouer, il lance un dès et sa position est update.
                int newPlayerPosition = updatePlayerPosition(personnage);
                //Fait par Gaby
                Case actuel = boardd.get(newPlayerPosition);
                actuel.event(personnage);
                //
                personnage.setPosition(newPlayerPosition);
                menu.playNewPosition(personnage);
                //try/catch fait sur demande du kit de développement... Je n'engage aucune responsabilité dans cette "chose".
                try {
                    if (newPlayerPosition > 64) {
                        throw new CharOutOfBound("Your position is : 64");
                    }
                } catch (CharOutOfBound e) {
                    System.out.println(e.getMessage());
                }
            }
        }
        //Message de victoire
        menu.victory(personnage);
    }

//    public void turnCounter(int counter) {
//        menu.turnCounter(counter);
//    }

    public int updatePlayerPosition(Personnage personnage) {
        menu.playerCurrentPosition(personnage);
        return personnage.getPosition()+dice();
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

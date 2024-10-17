import characters.Magician;
import characters.Personnage;
import characters.Warrior;
import items.defensive.EquipmentDefensive;
import items.defensive.Philtre;
import items.defensive.Shield;
import items.offensive.EquipmentOffensif;
import items.offensive.Spell;
import items.offensive.Weapon;

import java.util.Objects;
import java.util.Scanner;

/**
 * The type Menu.
 */
public class Menu {

    private final Scanner myObj = new Scanner(System.in);

    /**
     * Instantiates a new Menu.
     */
    public Menu() {
        displayMenu();
    }

    /**
     * Ask player input string.
     *
     * @param askInput the ask input
     * @return the string
     */
    public String askPlayerInput(String askInput) {
        System.out.print(askInput);
        return myObj.nextLine();
    }

    /**
     * Ask player yes or no boolean.
     *
     * @param question the question
     * @return the boolean
     */
//centralisation du y/n
    public Boolean askPlayerYesORNo(String question) {
        String playerResponse = askPlayerInput(question + "y/n?");
        switch (playerResponse) {
            case "y":
                return true;
            case "n":
                return false;
            default:
                return askPlayerYesORNo(question);
        }
    }

    /**
     * Display menu.
     */
    public void displayMenu() {
        boolean playerResponse = play();
        switch (playerResponse) {
            case true:
                System.out.println("Welcome!");
                break;
            case false:
                gameEnd();
        }
    }

    /**
     * Play boolean.
     *
     * @return the boolean
     */
    public Boolean play() {
        return askPlayerYesORNo("Do you want to play ? ");
    }

    /**
     * Confirme character.
     *
     * @param personnage the personnage
     */
    public void confirmeCharacter(Personnage personnage) {
        boolean confirme = askPlayerYesORNo("Confirme ? ");
        if (confirme) {
            System.out.println("Game starts!");//start board
        } else if (!confirme) {
            selectNameAndType();
            confirmeCharacter(personnage);
        } else {
            confirmeCharacter(personnage);
        }
    }

    /**
     * Gets player name.
     *
     * @return the player name
     */
    public String getPlayerName() {
        return askPlayerInput("Enter character name : ");
    }

    /**
     * Gets player type.
     *
     * @return the player type
     */
    public String getPlayerType() {
        String characterClass = askPlayerInput("Enter character class : " +
                "1 for warrior or 2 for magician : ");
        switch (characterClass) {
            case "1":
                return "warrior";
            case "2":
                return "magician";
            default:
                return getPlayerType();
        }
    }

    /**
     * Select name and type personnage.
     *
     * @return the personnage
     */
    public Personnage selectNameAndType() {
        String name = getPlayerName();
        String type = getPlayerType();
        Personnage personnage;
        EquipmentOffensif offensifStuff;
        EquipmentDefensive defensiveStuff;
        if (Objects.equals(type, "warrior")) {
            offensifStuff = new Weapon();
            defensiveStuff = new Shield();
            personnage = new Warrior(name, offensifStuff, defensiveStuff);
        } else {
            offensifStuff = new Spell();
            defensiveStuff = new Philtre();
            personnage = new Magician(name, offensifStuff, defensiveStuff);

        }
        personnage.setEquipmentOffensif(offensifStuff);
        personnage.setEquipmentDefensive(defensiveStuff);
        System.out.println(personnage);
        return personnage;
    }


    /**
     * Game end.
     */
    public void gameEnd() {
        System.out.println("Game ends!");
        System.exit(0);
    }

    /**
     * Display player current position.
     *
     * @param personnage the personnage
     */
    public void displayPlayerCurrentPosition(Personnage personnage) {
        System.out.println("Your current position on board : " + personnage.getPosition());
    }

    /**
     * Play new position.
     *
     * @param personnage the personnage
     */
    public void playNewPosition(Personnage personnage) {
        System.out.println("Your new position : " + personnage.getPosition());
    }

    /**
     * board.Dice result.
     *
     * @param dice the dice
     */
    public void diceResult(int dice) {
        System.out.println("The dice rolled a : " + dice);
    }

    /**
     * Continue to play boolean.
     *
     * @return the boolean
     */
    public Boolean continueToPlay() {
        System.out.println("----------------------");
        Boolean continuePlay = askPlayerYesORNo("Continue to play, throw dice ? ");
        if (continuePlay) {
            return true;
        } else {
            gameEnd();
            return false; //moche
        }
    }

    /**
     * Victory boolean.
     *
     * @param personnage the personnage
     * @return the boolean
     */
    public boolean victory(Personnage personnage) {
        System.out.println("GG YOU WIN " + personnage.getName());
        return playAgain();
    }

    /**
     * Play again boolean.
     *
     * @return the boolean
     */
    public boolean playAgain() {
        return askPlayerYesORNo("Do you want to play again ? ");
    }
//    static void drakeIntroText(String name){
//        System.out.println("AHGROUGROU, I'm "+ name + " the Lord of this lab...blablabla");
//    }
}

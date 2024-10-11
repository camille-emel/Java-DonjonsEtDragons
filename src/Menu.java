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

public class Menu {

    private final Scanner myObj = new Scanner(System.in);
    public Menu() {
        displayMenu();
    }

    public String askPlayerInput(String askInput) {
        System.out.print(askInput);
        return myObj.nextLine();
    }

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

    public Boolean play() {
        return askPlayerYesORNo("Do you want to play ? ");
    }

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

    public String getPlayerName() {
        return askPlayerInput("Enter character name : ");
    }

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


    public void gameEnd() {
        System.out.println("Game ends!");
        System.exit(0);
    }

    public void playerCurrentPosition(Personnage personnage) {
        System.out.println("Your current position on board : " + personnage.getPosition());
    }

    public void playNewPosition(Personnage personnage) {
        System.out.println("Your new position : " + personnage.getPosition());
    }

    public void diceResult(int dice) {
        System.out.println("The dice rolled a : " + dice);
    }

    public String continueToPlay() {
        System.out.println("----------------------");
        Boolean continuePlay = askPlayerYesORNo("Continue to play, throw dice ? ");
        if (continuePlay) {
            return "continue";
        } else {
            gameEnd();
            return ""; //moche
        }
    }

    public boolean victory(Personnage personnage) {
        System.out.println("GG YOU WIN " + personnage.getName());
        return playAgain();
    }
    public boolean playAgain() {
        return askPlayerYesORNo("Do you want to play again ? ");
    }


//    public void turnCounter(int turnCounter) {
//        System.out.println("---------------------------");
//        System.out.println("Start of turn : " + turnCounter);
//
//    }
}

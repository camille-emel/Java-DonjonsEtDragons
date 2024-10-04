import java.util.Objects;
import java.util.Scanner;

public class Menu {

    public Menu() {
        displayMenu();
    }

    public void displayMenu() {
        String gameStart = play();
        if (Objects.equals(gameStart, "y")) {
            System.out.println("Welcome to the game!");
        } else if (Objects.equals(gameStart, "n")) {
            System.exit(0);
        }
    }

    public String play() {
        Scanner myObj = new Scanner(System.in);
        System.out.print("Do you want to play ? (y/n) : ");
        return myObj.nextLine();
    }

    public Personnage selectNameAndType(Personnage personnage) {
        String name = getPlayerName();
        String type = getPlayerType();
        personnage.setName(name);
        personnage.setType(type);
        if (Objects.equals(personnage.getType(), "warrior")) {
            personnage.setLife(10);
            personnage.setPower(10);
        }
        else if (Objects.equals(personnage.getType(), "magician")) {
            personnage.setLife(6);
            personnage.setPower(15);
        }
        EquipmentOffensif offensifStuff = new EquipmentOffensif(personnage.getType());
        personnage.setEquipmentOffensif(offensifStuff);
        EquipmentDefensive defensiveStuff = new EquipmentDefensive(personnage.getType());
        personnage.setEquipmentDefensive(defensiveStuff);
        System.out.println(personnage);
        return personnage;
    }

    public void validateChar(Personnage personnage) {
        Scanner myObj = new Scanner(System.in);
        System.out.print("Valider les choix ? y/n :");
        String choice = myObj.nextLine();
        if (Objects.equals(choice, "y")) {
            System.out.println("Game starts!");//start board
        } else if (Objects.equals(choice, "n")) {
            selectNameAndType(personnage);
            validateChar(personnage);

        }else {
            validateChar(personnage);
        }
    }

    public String getPlayerName() {
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter character name : ");
        return myObj.nextLine();
    }

    public String getPlayerType() {
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter character class 1 for Warrior or 2 for Mage : ");
        String characterClass = myObj.nextLine();
        if (Objects.equals(characterClass, "1")) {
            return "warrior";
        } else if (Objects.equals(characterClass, "2")) {
            return "magician";
        }
        return getPlayerType();
    }
    public void playerPosition(Personnage personnage){
        System.out.println("Your position is : " + personnage.getPosition());
        System.out.println(personnage.getPosition());
    }
}

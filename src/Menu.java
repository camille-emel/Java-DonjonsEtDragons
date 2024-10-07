import java.util.Objects;
import java.util.Scanner;

public class Menu {

    public Menu() {
//        do {
        displayMenu();
//    }while (!keyechap(27));
    }

    //tentative de centralisation du y/n
    public String askPlayerYesORNo(String question) {
        Scanner myObj = new Scanner(System.in);
        System.out.print(question + "    y/n ?");
        String response = myObj.nextLine();
        if (Objects.equals(response, "y")) {
            return "y";
        } else if (Objects.equals(response, "n")) {
            return "n";
        }
        return askPlayerYesORNo(question);
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
        return askPlayerYesORNo("Do you want to play ? ");
    }

    public Personnage selectNameAndType(Personnage personnage) {
        String name = getPlayerName();
        String type = getPlayerType();
        personnage.setName(name);
        personnage.setType(type);
        if (Objects.equals(personnage.getType(), "warrior")) {
            personnage.setLife(10);
            personnage.setPower(10);
        } else if (Objects.equals(personnage.getType(), "magician")) {
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

    public void confirmeCharacter(Personnage personnage) {
        Scanner myObj = new Scanner(System.in);
        System.out.print("Confirme ? y/n :");
        String choice = myObj.nextLine();
        if (Objects.equals(choice, "y")) {
            System.out.println("Game starts!");//start board
        } else if (Objects.equals(choice, "n")) {
            selectNameAndType(personnage);
            confirmeCharacter(personnage);
        } else {
            confirmeCharacter(personnage);
        }
    }

    public String getPlayerName() {
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter character name : ");
        return myObj.nextLine();
    }

    public String getPlayerType() {
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter character class : 1 for warrior or 2 for magician : ");
        String characterClass = myObj.nextLine();
        if (Objects.equals(characterClass, "1")) {
            return "warrior";
        } else if (Objects.equals(characterClass, "2")) {
            return "magician";
        }
        return getPlayerType();
    }

    public String playerPosition(Personnage personnage) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Your position is : " + personnage.getPosition());
        System.out.println("Continue to play, throw dice ? y/n");
        String choice = myObj.nextLine();
        if (Objects.equals(choice, "y")) {
            return "continue";
        } else if (Objects.equals(choice, "n")) {
            System.out.println("Game ends!");
            System.exit(0);
            //moche
            return "";
        } else {
            return playerPosition(personnage);
        }
    }
    //moche hardcoded
    public void victory(Personnage personnage) {
        System.out.println("Your position is : 64");
        System.out.println("GG YOU WIN " + personnage.getName());
    }
}

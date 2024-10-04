import java.util.Objects;
import java.util.Scanner;

public class Menu {

    public Menu() {
        displayMenu();
    }

    public void displayMenu() {
        String gamestart = play();
        if (Objects.equals(gamestart, "y")) {
            System.out.println("Welcome to the game!");
        } else if (Objects.equals(gamestart, "n")) {
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
        System.out.println("Character Name : " + personnage.getName());
        System.out.println("Character Class : " + personnage.getType());
        System.out.println("Character life : " + personnage.getLife());
        System.out.println("Character power : " + personnage.getPower());
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
        System.out.print("Enter caracter name : ");
        return myObj.nextLine();
    }

    public String getPlayerType() {
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter caracter class 1 for Warrior or 2 for Mage : ");
        String caracterClass = myObj.nextLine();
        if (Objects.equals(caracterClass, "1")) {
            return "warrior";
        } else if (Objects.equals(caracterClass, "2")) {
            return "magician";
        }
        return getPlayerType();
    }

//    public String getCaracterStuff(String type) {
//        if (Objects.equals(type, "Warrior")) {
//            return ?????;
//        } else if (Objects.equals(type, "Mage")) {
//            return ????:
//        } else {
//            return "error";
//        }
//    }
}

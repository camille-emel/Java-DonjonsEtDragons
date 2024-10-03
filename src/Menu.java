import java.util.Objects;
import java.util.Scanner;

public class Menu {
    public String play(){
        Scanner myObj = new Scanner(System.in);
        System.out.print("Do you want to play ? (y/n) : ");
        return myObj.nextLine();
    }
    public String getName() {
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter caracter name : ");
        return myObj.nextLine();
    }
    public String getType() {
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter caracter class 1 for Warrior or 2 for Mage : ");
        String caracterClass = myObj.nextLine();
        if (Objects.equals(caracterClass, "1")) {
            return "Warrior";
        } else if (Objects.equals(caracterClass, "2")) {
            return "Mage";
        }return "error";
    }
    public String getCaracterStuff(String type) {
        if (Objects.equals(type, "Warrior")) {
            return ?????;
        } else if (Objects.equals(type, "Mage")) {
            return ????:
        } else {
            return "error";
        }
    }
}

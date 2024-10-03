import java.util.Objects;
import java.util.Scanner;

public class Personnage {
    String name;
    String type;
    int life;
    int power;
    String equipementOffensif;
    String equipementDefensif;

    public Personnage() {
        this("toto");
    }

    public Personnage(String name) {
        this(name,"clown");
    }

    public Personnage(String name, String type) {
        this.name = name;
        this.type = type;
    }
}

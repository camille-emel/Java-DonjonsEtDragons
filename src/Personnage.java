public class Personnage {
    String name;
    String type;
    int life;
    int power;
    EquipementOffensif equipementOffensif;
    EquipementDefensif equipementDefensif;

    public Personnage() {
        this("toto", "clown");
    }

    public Personnage(String name) {
        this(name,"clown");
    }

    public Personnage(String name, String type) {
        this.name = name;
        this.type = type;
    }
}

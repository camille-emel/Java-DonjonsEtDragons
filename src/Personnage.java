public class Personnage {
    private String name;
    private String type;
    private int life;
    private int power;
    private EquipementOffensif equipementOffensif;
    private EquipementDefensif equipementDefensif;
    private int position;

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

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getType() {
        return type;
    }
    public void setPosition(int position) {
        this.position = position;
    }
    public int getPosition() {
        return position;
    }
    public void setLife(int life) {
        this.life = life;
    }
    public int getLife() {
        return life;
    }
    public void setPower(int power) {
        this.power = power;
    }
    public int getPower() {
        return power;
    }
}

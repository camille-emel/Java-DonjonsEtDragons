public abstract class Personnage {
    protected String name;
    protected String type;
    protected int life;
    protected int power;
    protected EquipmentOffensif equipmentOffensif;

    protected EquipmentDefensive equipmentDefensive;
    protected int position;

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
    public EquipmentOffensif getEquipmentOffensif() {
        return this.equipmentOffensif;
    }
    public void setEquipmentOffensif(EquipmentOffensif stuff) {
        this.equipmentOffensif = stuff;
    }
    public EquipmentDefensive getEquipmentDefensive() {
        return this.equipmentDefensive;
    }
    public void setEquipmentDefensive(EquipmentDefensive stuff) {
        this.equipmentDefensive = stuff;
    }
    public String toString() {
        String message = "name : " + this.name;
        message += "\ntype : " + this.type;
        message += "\nlife : " + this.life;
        message += "\npower : " + this.power;
        message += "\nequipementOffensif : " + this.equipmentOffensif;
        message += "\nequipementDefensif : " + this.equipmentDefensive;
        return message;
    }
}

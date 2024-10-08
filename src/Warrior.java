public class Warrior extends Personnage {

    public Warrior(String name) {
        super(name, "warrior");
        this.life = 10;
        this.power = 10;
        this.equipmentDefensive = new Shield();
        this.equipmentOffensif  = new Weapon();
    }
}

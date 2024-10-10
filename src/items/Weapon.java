package items;

public class Weapon extends EquipmentOffensif {

    public Weapon() {
        super("hand");
    }

    public Weapon(String name) {
        super(name);
        switch (name) {
            case "sword":
                this.attackPower = 5;
                break;
            case "mace":
                this.attackPower = 3;
                break;
            default:
                this.attackPower = 1;
        }
    }
}

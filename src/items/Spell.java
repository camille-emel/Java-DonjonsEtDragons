package items;

public class Spell extends EquipmentOffensif {
    public Spell() {
        super("fresh water");
    }
    public Spell(String name){
        super(name);
        switch (name) {
            case "fireball":
                this.attackPower = 7;
                break;
            case "lightning":
                this.attackPower = 2;
                break;
            default:
                this.attackPower = 1;
        }
    }
}

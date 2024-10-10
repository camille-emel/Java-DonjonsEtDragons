package characters;

import items.EquipmentDefensive;
import items.EquipmentOffensif;

public class Warrior extends Personnage {

    public Warrior(String name, EquipmentOffensif weapon, EquipmentDefensive shield) {
        super(name, "warrior");
        this.life = 10;
        this.power = 10;
        this.equipmentDefensive = shield;
        this.equipmentOffensif  = weapon;
    }
}

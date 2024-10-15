package characters;

import items.defensive.EquipmentDefensive;
import items.offensive.EquipmentOffensif;

public class Warrior extends Personnage {

    public Warrior(String name, EquipmentOffensif weapon, EquipmentDefensive shield) {
        super(name, "warrior");
        this.life = 10;
        this.maxLife = this.life;
        this.power = 10;
        this.equipmentDefensive = shield;
        this.equipmentOffensif  = weapon;
    }
}

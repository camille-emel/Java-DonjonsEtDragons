package characters;

import items.defensive.EquipmentDefensive;
import items.offensive.EquipmentOffensif;

/**
 * The type Warrior.
 */
public class Warrior extends Personnage {

    /**
     * Instantiates a new Warrior.
     *
     * @param name   the name
     * @param weapon the weapon
     * @param shield the shield
     */
    public Warrior(String name, EquipmentOffensif weapon, EquipmentDefensive shield) {
        super(name, "warrior");
        this.life = 10;
        this.maxLife = this.life;
        this.power = 10;
        this.equipmentDefensive = shield;
        this.equipmentOffensif  = weapon;
    }
}

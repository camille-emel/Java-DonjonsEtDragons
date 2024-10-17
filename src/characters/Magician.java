package characters;

import items.defensive.EquipmentDefensive;
import items.offensive.EquipmentOffensif;

/**
 * The type Magician.
 */
public class Magician extends Personnage {

    /**
     * Instantiates a new Magician.
     *
     * @param name    the name
     * @param spell   the spell
     * @param philtre the philtre
     */
    public Magician(String name, EquipmentOffensif spell, EquipmentDefensive philtre){
        super(name,"magician");
        this.life = 6;
        this.maxLife = this.life;
        this.power = 15;
        this.equipmentDefensive = philtre;
        this.equipmentOffensif  = spell;
    }

}

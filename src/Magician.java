public class Magician extends Personnage{

    public Magician(String name, EquipmentOffensif spell, EquipmentDefensive philtre){
        super(name,"magician");
        this.life = 6;
        this.power = 15;
        this.equipmentDefensive = philtre;
        this.equipmentOffensif  = spell;
    }
}

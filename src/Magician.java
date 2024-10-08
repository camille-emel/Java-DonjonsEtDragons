public class Magician extends Personnage{

    public Magician(String name){
        super(name,"magician");
        this.life = 6;
        this.power = 15;
        this.equipmentDefensive = new Philtre();
        this.equipmentOffensif  = new Spell();
    }
}

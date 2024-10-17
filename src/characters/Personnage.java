package characters;

import items.defensive.EquipmentDefensive;
import items.offensive.EquipmentOffensif;

/**
 * The type Personnage.
 */
public abstract class Personnage {
    /**
     * The Name.
     */
    protected String name;
    /**
     * The Type.
     */
    protected String type;
    /**
     * The Life.
     */
    protected int life;
    /**
     * The Max life.
     */
    protected int maxLife;
    /**
     * The Power.
     */
    protected int power;
    /**
     * The Equipment offensif.
     */
    protected EquipmentOffensif equipmentOffensif;
    /**
     * The Equipment defensive.
     */
    protected EquipmentDefensive equipmentDefensive;
    /**
     * The Position.
     */
    protected int position;

    /**
     * Instantiates a new Personnage.
     */
    public Personnage() {
        this("toto");
    }

    /**
     * Instantiates a new Personnage.
     *
     * @param name the name
     */
    public Personnage(String name) {
        this(name,"clown");
    }

    /**
     * Instantiates a new Personnage.
     *
     * @param name the name
     * @param type the type
     */
    public Personnage(String name, String type) {
        this.name = name;
        this.type = type;
    }
    public void monsterFlee(){

    }
    public void playerFlee(){

    }

    /**
     * Get max life int.
     *
     * @return the int
     */
    public int getMaxLife(){
        return maxLife;
    }

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets type.
     *
     * @param type the type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Gets type.
     *
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * Sets position.
     *
     * @param position the position
     */
    public void setPosition(int position) {
        this.position = position;
    }

    /**
     * Gets position.
     *
     * @return the position
     */
    public int getPosition() {
        return position;
    }

    /**
     * Sets life.
     *
     * @param life the life
     */
    public void setLife(int life) {
        this.life = life;
    }

    /**
     * Gets life.
     *
     * @return the life
     */
    public int getLife() {
        return life;
    }

    /**
     * Sets power.
     *
     * @param power the power
     */
    public void setPower(int power) {
        this.power = power;
    }

    /**
     * Gets power.
     *
     * @return the power
     */
    public int getPower() {
        return power;
    }

    /**
     * Gets equipment offensif.
     *
     * @return the equipment offensif
     */
    public EquipmentOffensif getEquipmentOffensif() {
        return this.equipmentOffensif;
    }

    /**
     * Sets equipment offensif.
     *
     * @param stuff the stuff
     */
    public void setEquipmentOffensif(EquipmentOffensif stuff) {
        this.equipmentOffensif = stuff;
    }

    /**
     * Gets equipment defensive.
     *
     * @return the equipment defensive
     */
    public EquipmentDefensive getEquipmentDefensive() {
        return this.equipmentDefensive;
    }

    /**
     * Sets equipment defensive.
     *
     * @param stuff the stuff
     */
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

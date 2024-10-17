package items.offensive;

import board.Case;

/**
 * The type Equipment offensif.
 */
public abstract class EquipmentOffensif  {
    /**
     * The Attack power.
     */
    protected int attackPower;
    /**
     * The Name.
     */
    protected String name;

    /**
     * Instantiates a new Equipment offensif.
     *
     * @param name the name
     */
    public EquipmentOffensif(String name) {
        this.name = name;
    }

    public String toString() {
        String message = this.name;
        return message;
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
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets attack power.
     *
     * @return the attack power
     */
    public int getAttackPower() {
        return attackPower;
    }

    /**
     * Sets attack power.
     *
     * @param attackPower the attack power
     */
    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }
}
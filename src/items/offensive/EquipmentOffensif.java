package items.offensive;

import board.Case;

public abstract class EquipmentOffensif  {
    protected int attackPower;
    protected String name;

    public EquipmentOffensif(String name) {
        this.name = name;
    }

    public String toString() {
        String message = this.name;
        return message;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }
}
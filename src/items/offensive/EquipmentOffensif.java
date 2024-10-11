package items.offensive;

import board.Case;

public abstract class EquipmentOffensif implements Case {
    protected int attackPower;
    protected String name;

    public EquipmentOffensif(String name) {
        this.name = name;
    }

    public String toString() {
        String message = this.name;
        return message;
    }
}
package items;

public abstract class EquipmentDefensive {
    protected int defenceLevel;
    protected String name;

    public EquipmentDefensive(String name) {
        this.name = name;
    }

    public String toString() {
        String message = this.name;
        return message;
    }
}

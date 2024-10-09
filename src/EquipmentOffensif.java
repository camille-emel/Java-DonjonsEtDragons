public abstract class EquipmentOffensif {
    protected int attackLevel;
    protected String name;

    public EquipmentOffensif(String name) {
        this.name = name;
    }

    public String toString() {
        String message = this.name;
        return message;
    }
}
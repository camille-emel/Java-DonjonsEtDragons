package items.defensive;

/**
 * The type Equipment defensive.
 */
public abstract class EquipmentDefensive {
    /**
     * The Defence level.
     */
    protected int defenceLevel;
    /**
     * The Name.
     */
    protected String name;

    /**
     * Instantiates a new Equipment defensive.
     *
     * @param name the name
     */
    public EquipmentDefensive(String name) {
        this.name = name;
    }

    public String toString() {
        String message = this.name;
        return message;
    }
}

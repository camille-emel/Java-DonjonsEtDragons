public abstract class EquipmentDefensive {
    protected int defenceLevel;
    protected String name;
    protected String type;

    //viré construct car abstract ?

    public EquipmentDefensive(String type) {
        switch (type) {
            case "warrior":
                this.name = "aegis";
                this.type = "shield";
                break;
            case "magician":
                this.name = "grail";
                this.type = "philtre";
                break;
            default:
                this.name = "hand";
                this.type = "natural";
        }
    }
    public String toString() {
        String message = this.name;
        return message;
    }
}

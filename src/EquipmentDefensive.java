public class EquipmentDefensive {
    private int defenceLevel;
    private String name;
    private String type;

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
}

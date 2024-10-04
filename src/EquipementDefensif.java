public class EquipementDefensif {
    int defenceLevel;
    String name;
    String type;

    public EquipementDefensif(String type) {
        switch (type) {
            case "warrior":
                this.name = "aegis";
                this.type = "shield";
                break;
            case "magician":
                this.name = "tincture";
                this.type = "philtre";
                break;
            default:
                this.name = "hand";
                this.type = "natural";
        }
    }
}

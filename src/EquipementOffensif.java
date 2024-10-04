public class EquipementOffensif {
    int attackLevel;
    String name;
    String type;

    public EquipementOffensif(String type) {
        switch (type) {
            case "warrior":
                this.name = "sword";
                this.type = "weapon";
                break;
            case "magician":
                this.name = "fireball";
                this.type = "spell";
                break;
            default:
                this.name = "hand";
                this.type = "natural";
        }
    }
}
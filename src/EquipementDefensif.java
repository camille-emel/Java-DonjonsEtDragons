public class EquipementDefensif {
    String EquipementDefensif;

    public EquipementDefensif(String type) {
        if (type.equals("Warrior")) {
            this.EquipementDefensif = "Shield";
        }else if (type.equals("Mage")) {
            this.EquipementDefensif = "Book";
        }else{
            this.EquipementDefensif = "Rien";
        }
    }
}

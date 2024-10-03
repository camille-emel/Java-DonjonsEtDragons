public class EquipementOffensif {
    String EquipementOffensif;

    public EquipementOffensif(String type) {
        if (type.equals("Warrior")) {
            this.EquipementOffensif = "Katana";
        }else if (type.equals("Mage")) {
            this.EquipementOffensif = "Baton";
        }else{
            this.EquipementOffensif = "Rien";
        }
    }
}

public class CaseBox implements Case{
    @Override
    public void event(Personnage personnage) {
        System.out.println("There is a box");
        newSword(personnage);

    }
    public void newSword(Personnage personnage) {
        System.out.println("New sword");
        Weapon toto = new Weapon("toto");
        personnage.setEquipmentOffensif(toto);

    }
}

package board;

import characters.Personnage;
import items.Weapon;

public class CaseBox implements Case {
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
    public void newPotion(Personnage personnage) {
        System.out.println("You found a new potion");

    }
}

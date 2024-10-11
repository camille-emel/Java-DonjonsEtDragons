package board;

import characters.Personnage;
import items.defensive.LargePotion;
import items.defensive.Potion;
import items.defensive.SmallPotion;
import items.offensive.*;

import java.util.Random;

public class CaseBox implements Case {
    @Override
    public void event() {
        System.out.println("There is a box");
    }

    @Override
    public void interaction(Personnage personnage) {
        Random randomNumbers = new Random();
        int diceRoll = randomNumbers.nextInt(6) + 1;
        switch (diceRoll) {
            case 1:
                newSmallPotion(personnage);
                break;
            case 2:
                newLargePotion(personnage);
                break;
            case 3:
                newWeaponMace(personnage);
                break;
            case 4:
                newSpellLightning(personnage);
                break;
            case 5:
                newWeaponSword(personnage);
                break;
            case 6:
                newSpellFireball(personnage);
                break;
        }
    }

    public void newWeaponSword(Personnage personnage) {
        System.out.println("You found a sword");
        Weapon sword = new Swords();
        personnage.setEquipmentOffensif(sword);
    }

    public void newWeaponMace(Personnage personnage) {
        System.out.println("You found a mace");
        Weapon mace = new Mace();
        personnage.setEquipmentOffensif(mace);
    }

    public void newSpellLightning(Personnage personnage) {
        System.out.println("You found a lightning spell");
        Spell lightning = new Lightning();
        personnage.setEquipmentOffensif(lightning);
    }

    public void newSpellFireball(Personnage personnage) {
        System.out.println("You found a fireball spell");
        Spell fireball = new Fireball();
        personnage.setEquipmentOffensif(fireball);
    }

    public void newSmallPotion(Personnage personnage) {
        System.out.println("You found a new potion");
        Potion smallPotion = new SmallPotion();
        //how to use potion ?
        //personnage.setLife();
    }

    public void newLargePotion(Personnage personnage) {
        System.out.println("You found a new potion");
        Potion largePotion = new LargePotion();
        //personnage.
    }
}

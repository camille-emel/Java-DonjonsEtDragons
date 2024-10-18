package board;

import characters.Personnage;
import core.ShitHappen;
import items.defensive.LargePotion;
import items.defensive.Potion;
import items.defensive.SmallPotion;
import items.offensive.*;

import java.util.Objects;
import java.util.Random;


/**
 * The type Case box.
 */
public class CaseBox implements Case {
    @Override
    public void display() {
        System.out.println("There is a box");
    }

    @Override
    public ShitHappen interaction(Personnage personnage) {
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
                newSpellLightning(personnage);
                break;
            case 4:
                newWeaponMace(personnage);
                break;
            case 5:
                newWeaponSword(personnage);
                break;
            case 6:
                newSpellFireball(personnage);
                break;
        }return ShitHappen.PLAYER_NOT_DEAD;
    }

    /**
     * New weapon sword.
     *
     * @param personnage the personnage
     */
    public void newWeaponSword(Personnage personnage) {
        //comment sortir le text pour le mettre dans le menu ?
        System.out.println("You found a sword");
        if (Objects.equals(personnage.getType(), "warrior")) {
            Weapon sword = new Swords();
            newPlayerGear(personnage,sword);
            System.out.println("Your combat power is " + personnage.getPower());
        }
    }

    /**
     * New weapon mace.
     *
     * @param personnage the personnage
     */
    public void newWeaponMace(Personnage personnage) {
        System.out.println("You found a mace");
        if (Objects.equals(personnage.getType(), "warrior") && !Objects.equals(personnage.getEquipmentOffensif().getName(), "sword")) {
            Weapon mace = new Mace();
            newPlayerGear(personnage,mace);
            System.out.println("You equip the mace, your combat power is " + personnage.getPower());
        }
    }

    /**
     * New spell lightning.
     *
     * @param personnage the personnage
     */
    public void newSpellLightning(Personnage personnage) {
        System.out.println("You found a lightning spell");
        if (Objects.equals(personnage.getType(), "magician") && !Objects.equals(personnage.getEquipmentOffensif().getName(), "sword")) {
            Spell lightning = new Lightning();
            newPlayerGear(personnage,lightning);
            System.out.println("You can now use Lightning spell, your combat power is " + personnage.getPower());
        }
    }

    /**
     * New spell fireball.
     *
     * @param personnage the personnage
     */
    public void newSpellFireball(Personnage personnage) {
        System.out.println("You found a fireball spell");
        if (Objects.equals(personnage.getType(), "magician") && !Objects.equals(personnage.getEquipmentOffensif().getName(), "sword")) {
            Spell fireball = new Fireball();
            newPlayerGear(personnage,fireball);
            System.out.println("You can now use Fireball spell, your combat power is " + personnage.getPower());

        }
    }

    /**
     * New small potion.
     *
     * @param personnage the personnage
     */
    public void newSmallPotion(Personnage personnage) {
        System.out.println("You found a small potion");
        Potion smallPotion = new SmallPotion();
        smallPotion.healPlayer(personnage);
//        int smallPotion = 2;
//        isPlayerMaxLife(personnage, smallPotion);
//        Potion smallPotion = new SmallPotion();
        //how to use potion ?
        //personnage.setLife();
    }

    /**
     * New large potion.
     *
     * @param personnage the personnage
     */
    public void newLargePotion(Personnage personnage) {
        System.out.println("You found a large potion");
        Potion largePotion = new LargePotion();
        largePotion.healPlayer(personnage);
//        int largePotion = 2;
//        isPlayerMaxLife(personnage, largePotion.getRegen());
        //personnage.
    }

    /**
     * New player gear.
     *
     * @param personnage the personnage
     * @param newStuff   the new stuff
     */
//Bonjour, je m'appel ALAIDE HORRIBLE...
//    public void isPlayerMaxLife(Personnage personnage, int potionRegen) {
//        if (Objects.equals(personnage.getType(), "warrior")) {
//            if (personnage.getLife() != 10) {
//                personnage.setLife(personnage.getLife() + potionRegen);
//                if (personnage.getLife() > 10) {
//                    personnage.setLife(10);
//                }
//            }
//        }
//        if (Objects.equals(personnage.getType(), "magician")) {
//            if (personnage.getLife() != 6) {
//                personnage.setLife(personnage.getLife() + potionRegen);
//                if (personnage.getLife() > 6) {
//                    personnage.setLife(6);
//                }
//            }
//        }
//    }
    public void newPlayerGear(Personnage personnage,EquipmentOffensif newStuff) {
        personnage.setEquipmentOffensif(newStuff);
        personnage.setPower(personnage.getPower() + newStuff.getAttackPower());
    }
}

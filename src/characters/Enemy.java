package characters;

import board.Case;

import java.util.Collections;

/**
 * The type Enemy.
 */
public class Enemy extends Personnage implements Case {
    /**
     * Instantiates a new Enemy.
     *
     * @param name the name
     */
    public Enemy(String name) {
        super(name);
    }

    @Override
    public String toString() {
        String message = "name : " + this.name;
        message += "\ntype : " + this.type;
        message += "\nlife : " + this.life;
        message += "\npower : " + this.power;
        return message;
    }

    @Override
    public void event() {
        System.out.println(this.toString());
    }

    @Override
    public void interaction(Personnage personnage) {
        this.life -= personnage.power;
        System.out.println("Vous attaquez l'énnemi.");
        System.out.println("Il reste " + this.life + " pv a l'ennemi");
        if (this.life > 0) {
            personnage.life -= this.power;
            System.out.println("Vous avez perdu " + personnage.life + "point de vie.");
//            //Si il est pas mort, il fuit.
//            if (this.life > 1) {
//
//
monsterFlee(personnage);
//            }
        }
    }
}
package items.defensive;

import characters.Personnage;

/**
 * The type Potion.
 */
public abstract class Potion {
    /**
     * The Name.
     */
    protected String name;
    /**
     * The Regen.
     */
    protected int regen ;

    /**
     * Instantiates a new Potion.
     *
     * @param name the name
     */
    public Potion(String name) {
        this.name = name;
    }

    /**
     * Gets regen.
     *
     * @return the regen
     */
    public int getRegen() {
        return regen;
    }

    /**
     * Heal player.
     *
     * @param personnage the personnage
     */
    public void healPlayer(Personnage personnage) {
        personnage.setLife(Math.min(personnage.getLife() + regen, personnage.getMaxLife()));
    }
}

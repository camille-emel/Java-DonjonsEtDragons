package items.defensive;

import characters.Personnage;

public abstract class Potion {
    protected String name;
    protected int regen ;

    public Potion(String name) {
        this.name = name;
    }

    public int getRegen() {
        return regen;
    }
    public void healPlayer(Personnage personnage) {
        personnage.setLife(Math.max(regen, Math.min(personnage.getLife() + regen, personnage.getMaxLife())));
    }
}

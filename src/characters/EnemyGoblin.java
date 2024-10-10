package characters;
import board.Case;

public class EnemyGoblin extends Personnage implements Case {
    public EnemyGoblin() {
        super("Goblin");
        this.life = 6;
        this.power = 1;
    }

    @Override
    public void event(Personnage personnage) {
        System.out.println("A Goblin is here!");
    }
}

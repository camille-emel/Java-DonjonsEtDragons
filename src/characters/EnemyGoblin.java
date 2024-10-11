package characters;
import board.Case;

public class EnemyGoblin extends Enemy {
    public EnemyGoblin() {
        super("Goblin");
        this.life = 6;
        this.power = 1;
    }

    @Override
    public void event() {
        System.out.println("A Goblin is here!");
        super.event();

    }


}

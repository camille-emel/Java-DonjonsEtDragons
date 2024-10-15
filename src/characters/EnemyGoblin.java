package characters;
import board.Case;

public class EnemyGoblin extends Enemy {
    public EnemyGoblin() {
        super("Gounf");
        this.life = 6;
        this.maxLife = this.life;
        this.power = 1;
        this.type = "Goblin";
    }

    @Override
    public void event() {
        System.out.println("A Goblin is here!");
        System.out.println("Me "+ name+ ", me kill you");
        super.event();

    }


}

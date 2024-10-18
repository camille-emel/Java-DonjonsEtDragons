package characters;

/**
 * The type Enemy goblin.
 */
public class EnemyGoblin extends Enemy {
    /**
     * Instantiates a new Enemy goblin.
     */
    public EnemyGoblin() {
        super("Gounf");
        this.life = 6;
        this.maxLife = this.life;
        this.power = 1;
        this.type = "Goblin";
    }

    @Override
    public void display() {
        System.out.println("A Goblin is here!");
        System.out.println("Me "+ name+ ", me kill you");
        super.display();

    }


}

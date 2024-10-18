package characters;

/**
 * The type Enemy sorcerer.
 */
public class EnemySorcerer extends Enemy {
    /**
     * Instantiates a new Enemy sorcerer.
     */
    public EnemySorcerer(){
        super("Xoxo");
        this.life=9;
        this.maxLife = this.life;
        this.power=2;
        this.type="sorcerer";
    }

    @Override
    public void display() {
        System.out.println("A wild sorcerer is in this room ");
        System.out.println("I m " + name + "and i will destroy you !");
        super.display();
    }



}

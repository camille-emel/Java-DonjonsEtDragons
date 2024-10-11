package characters;
import board.Case;

public class EnemySorcerer extends Enemy {
    public EnemySorcerer(){
        super("Xoxo");
        this.life=9;
        this.power=2;
    }

    @Override
    public void event() {
        System.out.println("A wild sorcerer is in this room ");
        System.out.println("I m " + name + "and i will destroy you !");
        super.event();
    }



}

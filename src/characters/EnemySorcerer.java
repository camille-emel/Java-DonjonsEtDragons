package characters;
import board.Case;

public class EnemySorcerer extends Personnage implements Case {
    public EnemySorcerer(){
        super("Xoxo");
        this.life=9;
        this.power=2;
    }

    @Override
    public void event(Personnage personnage) {
        System.out.println("A wild sorcere is in da room ");
    }
}

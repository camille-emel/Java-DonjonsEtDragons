package characters;
import board.Case;

public class EnemyDrake extends Personnage implements Case {
    public EnemyDrake(){
        super("Zorg");
        this.life=15;
        this.power=4;
    }

    @Override
    public void event(Personnage personnage) {
        System.out.println("AHGROUGROU, I'm the Lord of this lab...blablabla");
    }
}

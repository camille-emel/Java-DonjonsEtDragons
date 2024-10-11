package characters;
import board.Case;

public class EnemyDrake extends Enemy  {
    public EnemyDrake(){
        super("Zorg");
        this.life=15;
        this.power=4;
    }


    public void event() {
        System.out.println("AHGROUGROU, I'm the Lord of this lab...blablabla");
        super.event();
    }





}

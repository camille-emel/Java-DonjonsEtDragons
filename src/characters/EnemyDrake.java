package characters;
import board.Case;


public class EnemyDrake extends Enemy  {
    public EnemyDrake(){
        super("Zorg");
        this.life=15;
        this.maxLife = this.life;
        this.power=4;
        this.type="drake";
    }


    public void event() {
//        menu.drakeIntroText(name);
        System.out.println("AHGROUGROU, I'm "+ name + " the Lord of this lab...blablabla");
        super.event();
    }





}

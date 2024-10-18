package characters;


/**
 * The type Enemy drake.
 */
public class EnemyDrake extends Enemy  {
    /**
     * Instantiates a new Enemy drake.
     */
    public EnemyDrake(){
        super("Zorg");
        this.life=15;
        this.maxLife = this.life;
        this.power=4;
        this.type="drake";
    }


    public void display() {
//        menu.drakeIntroText(name);
        System.out.println("AHGROUGROU, I'm "+ name + " the Lord of this lab...blablabla");
        super.display();
    }





}

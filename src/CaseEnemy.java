import java.lang.Math;
import java.util.Random;

public class CaseEnemy implements Case {
    @Override
    public void event(Personnage personnage) {
        System.out.println("Enemy there blablabla");
        Random rand = new Random();
        int randomEnemy = rand.nextInt(6) + 1;
    }

    public void goblin(Personnage personnage) {
        System.out.println("It's a Goblin ...!");
        Personnage gobelin = new EnemyGoblin();
    }
    public void sorcere(Personnage personnage) {
        System.out.println("It's a sorcere ...!");
        Personnage sorcere = new EnemySorcere();
    }
    public void drake(Personnage personnage) {
        System.out.println("It's a drake ...!");
        Personnage drake = new EnemyDrake();
    }
}

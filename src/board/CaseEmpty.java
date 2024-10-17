package board;
import core.ShitHappen.*;
import characters.Personnage;
import core.ShitHappen;

/**
 * The type Case empty.
 */
public class CaseEmpty implements Case {
    @Override
    public void event() {
        System.out.println("This room is empty");
    }

    @Override
    public ShitHappen interaction(Personnage personnage) {
        return ShitHappen.PLAYER_NOT_DEAD;
    }
}

package board;
import core.ShitHappen;
import characters.Personnage;

/**
 * The interface Case.
 */
public interface Case {

    /**
     * Event.
     */
    void display();

    /**
     * Interaction.
     *
     * @param personnage the personnage
     * @return the shit happen
     */
    ShitHappen interaction(Personnage personnage);

}

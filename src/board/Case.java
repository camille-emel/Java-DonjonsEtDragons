package board;

import characters.Personnage;

/**
 * The interface Case.
 */
public interface Case {

    /**
     * Event.
     */
    void event();

    /**
     * Interaction.
     *
     * @param personnage the personnage
     */
    void interaction(Personnage personnage);

}

package board;

import characters.Personnage;

/**
 * The type Case empty.
 */
public class CaseEmpty implements Case {
    @Override
    public void event() {
        System.out.println("This room is empty");
    }

    @Override
    public void interaction(Personnage personnage) {

    }
}

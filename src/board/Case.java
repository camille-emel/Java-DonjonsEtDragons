package board;

import characters.Personnage;

public interface Case {

    void event();
    void interaction(Personnage personnage);

}

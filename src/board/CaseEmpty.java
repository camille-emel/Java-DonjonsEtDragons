package board;

import characters.Personnage;

public class CaseEmpty implements Case {
    @Override
    public void event() {
        System.out.println("This room is empty");
    }

    @Override
    public void interaction(Personnage personnage) {

    }
}

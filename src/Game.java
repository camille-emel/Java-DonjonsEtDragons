public class Game {
    Menu menu;
    Personnage personnage;

    public Game() {
        this.menu = new Menu();
        playerCharacter();
    }

    public void playerCharacter() {
        String name = menu.getName();
        String type = menu.getType();
//        this.personnage.name = menu.getName();
//        this.personnage.type = menu.getType();

        this.personnage = new Personnage(name, type);
        System.out.println("Character created : " + this.personnage.name + " is a "+this.personnage.type);
    }


}

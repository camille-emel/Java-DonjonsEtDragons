import java.util.List;
import java.util.Objects;
import java.util.Random;

public class Game {
    private Menu menu;
    private Personnage personnage;
    private List<Integer> board;

    public Game() {
        this.menu = new Menu();
    }

    public void gameInit() {
        createCharacter();
        personnage.setPosition(1);
        gameStart();
    }

    public void createCharacter() {
        this.personnage = new Magician("toto");
        this.personnage = menu.selectNameAndType(this.personnage);
        menu.confirmeCharacter(this.personnage);
    }
    //pas utiliser le game board
    public void gameStart() {
        while (personnage.getPosition()<64) {
            if (Objects.equals(menu.playerPosition(personnage), "continue")) {
                int newPlayerPosition = personnage.getPosition()+ dice();
                personnage.setPosition(newPlayerPosition);
            }
        }
        menu.victory(personnage);
    }

    public int dice(){
        Random randomNumbers = new Random();
        return randomNumbers.nextInt(6)+1;
    }
}

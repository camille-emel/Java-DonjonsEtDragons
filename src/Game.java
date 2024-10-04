import java.util.List;
import java.util.Random;

public class Game {
    private Menu menu;
    private Personnage personnage;
    private List<Integer> board;

    public Game() {
        this.menu = new Menu();

    }
    public void gameStart() {
        createCharacter();
    }

    public void createCharacter() {
        this.personnage = new Personnage();
        this.personnage = menu.selectNameAndType(this.personnage);
        menu.validateChar(this.personnage);
    }

    public int dice(){
        Random randomNumbers = new Random();
        return randomNumbers.nextInt(6)+1;
    }

    public int updatePosition(int position){
        return position += dice();
    }

}

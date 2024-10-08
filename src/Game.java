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
        gameStart();
        //comfirme replay
        /*if replay return inti*/
    }

    public void createCharacter() {
        this.personnage = menu.selectNameAndType();
        menu.confirmeCharacter(this.personnage);
        personnage.setPosition(1);
    }

    //pas utiliser le game board
    //faire en sorte de savoir la case de départ
    // le result du dès
    // puis montré la case d'arriver.
    public void gameStart() {
        while (personnage.getPosition() < 64) {
            //faire variable

            if (Objects.equals(menu.playerPosition(personnage), "continue")) {
                int newPlayerPosition = personnage.getPosition() + dice();
                personnage.setPosition(newPlayerPosition);
                try {
                    if (newPlayerPosition > 64) {
                        throw new CharOutOfBound("Your position is : 64");
                    }
                } catch (CharOutOfBound e) {
                    System.out.println(e.getMessage());
                }
            }
        }
        menu.victory(personnage);
    }

    public int dice() {
        Random randomNumbers = new Random();
        return randomNumbers.nextInt(6) + 1;
    }
    //updatepos //pos+dice
}

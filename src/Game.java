import java.util.List;

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

//    public int dice(){
//        Random randomNumbers = new Random();
//        return randomNumbers.nextInt(6)+1;
//    }
//
//    public void int playerPosition(){
//        System.out.println("Your position is : " + this.personnage.getPosition());
//        System.out.println(this.personnage.getPosition());
//
//    }
//    public int updatePosition(int position){
//        return position += dice();
//    }

}

package board;

import characters.*;

import java.util.ArrayList;
import java.util.Collections;

/**
 * The type Board.
 */
public class Board {
    private String enemy;
    private ArrayList<Case> board ;
    private int boardSize;

    /**
     * Instantiates a new Board.
     *
     * @param boardSize the board size
     */
    public Board(int boardSize) {
        this.board = new ArrayList<>();
        this.boardSize = boardSize;
        buildBoard();
    }
    public void monsterFlee(Personnage personnage) {
        actualCase(personnage);
        if (actualCase(personnage) instanceof Enemy){
            Dice dice = new Dice();
            personnage.setPosition(personnage.getPosition()+ dice.diceRoll());
            System.out.println("Byebye sucker");
        }
    }
    /**
     * Fait par chat gaby.
     *
     * @param personnage the personnage
     */
    public Case actualCase(Personnage personnage) {
        return board.get(personnage.getPosition());
    }

    public void faitParChatGaby(Personnage personnage) {
        actualCase(personnage).event();
        actualCase(personnage).interaction(personnage);
        if (personnage.getLife()>0){
            monsterFlee(personnage);
        }

    }

    /**
     * Build board.
     */
//Probléme de gestion de la casse 0 car notre perso débute à 1; donc le shuffle peut waste une casse importante.
    public void buildBoard(){
        numOfEnemyDrake(0);
        numOfEnemySorcerer(0);
        numOfEnemyGoblin(0);
        numOfCaseBox(0);
        for(int i = board.size(); i< boardSize; i++) {
            board.add(new CaseEmpty());
        }
        Collections.shuffle(board);
        board.add(2,new EnemyDrake());
    }

    /**
     * Num of enemy drake.
     *
     * @param num the num
     */
    public void numOfEnemyDrake(int num){
        for (int i=0;i<num;i++) {
            board.add(new EnemyDrake());
        }
    }

    /**
     * Num of enemy sorcerer.
     *
     * @param num the num
     */
    public void numOfEnemySorcerer(int num){
        for (int i=0;i<num;i++) {
            board.add(new EnemySorcerer());
        }
    }

    /**
     * Num of enemy goblin.
     *
     * @param num the num
     */
    public void numOfEnemyGoblin(int num){
        for (int i=0;i<num;i++) {
            board.add(new EnemyGoblin());
        }
    }

    /**
     * Num of case box.
     *
     * @param num the num
     */
    public void numOfCaseBox(int num){
        for (int i=0;i<num;i++) {
            board.add(new CaseBox());
        }
    }

    /**
     * Gets board.
     *
     * @return the board
     */
    public ArrayList<Case> getBoard() {
        return board;
    }

    /**
     * Sets board.
     *
     * @param board the board
     */
    public void setBoard(ArrayList<Case> board) {
        this.board = board;
    }

    /**
     * Gets board size.
     *
     * @return the board size
     */
    public int getBoardSize() {
        return boardSize;
    }
}

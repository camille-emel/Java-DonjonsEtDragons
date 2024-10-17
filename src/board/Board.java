package board;

import characters.*;
import core.ShitHappen;

import java.util.ArrayList;
import java.util.Collections;

/**
 * The type Board.
 */
public class Board {
    private String enemy;
    private ArrayList<Case> board;
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
//

    /**
     * Fait par chat gaby.
     *
     * @param personnage the personnage
     * @return the case
     */
    public Case actualCase(Personnage personnage) {
        return board.get(personnage.getPosition());
    }

    /**
     * Fait par chat gaby.
     *
     * @param personnage the personnage
     */
    public void faitParChatGaby(Personnage personnage) {
        Case enemy = actualCase(personnage);
        int position = personnage.getPosition();
        enemy.event();
        ShitHappen end = actualCase(personnage).interaction(personnage);

        if (end == ShitHappen.ENEMY_IS_NOT_DEAD) {
            monsterFlee(enemy,position);
        }
    }


    /**
     * Monster flee.
     *
     * @param enemy    the enemy
     * @param position the position
     */
    public void monsterFlee(Case enemy, int position) {
        if (enemy instanceof Enemy) {
            Dice dice = new Dice();
            board.remove(position);
            board.set(position, new CaseEmpty());
            board.set(position+dice.diceRoll(), enemy);
            System.out.println("Byebye sucker");
        }
    }

    /**
     * Build board.
     */
//Probléme de gestion de la casse 0 car notre perso débute à 1; donc le shuffle peut waste une casse importante.
    public void buildBoard() {
        numOfEnemyDrake(0);
        numOfEnemySorcerer(0);
        numOfEnemyGoblin(0);
        numOfCaseBox(0);
        for (int i = board.size(); i < boardSize; i++) {
            board.add(new CaseEmpty());
        }
        Collections.shuffle(board);
        board.add(2, new EnemyDrake());
    }

    /**
     * Where the fuck is my enemy.
     */
    public void whereTheFuckIsMyEnemy() {
    }

    /**
     * Num of enemy drake.
     *
     * @param num the num
     */
    public void numOfEnemyDrake(int num) {
        for (int i = 0; i < num; i++) {
            board.add(new EnemyDrake());
        }
    }

    /**
     * Num of enemy sorcerer.
     *
     * @param num the num
     */
    public void numOfEnemySorcerer(int num) {
        for (int i = 0; i < num; i++) {
            board.add(new EnemySorcerer());
        }
    }

    /**
     * Num of enemy goblin.
     *
     * @param num the num
     */
    public void numOfEnemyGoblin(int num) {
        for (int i = 0; i < num; i++) {
            board.add(new EnemyGoblin());
        }
    }

    /**
     * Num of case box.
     *
     * @param num the num
     */
    public void numOfCaseBox(int num) {
        for (int i = 0; i < num; i++) {
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

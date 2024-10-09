import java.util.ArrayList;

public class Board {
    private String enemy;
    private int cratePositon;
    private int sorcererPosition;
    private int goblinPosition;
    private int dragonPosition;
    private ArrayList<Case> board ;
    private int boardsize;

    public Board(int boardSize) {
        this.board = new ArrayList<>();
        this.boardsize=boardSize;
        simpleBoard();
    }

    public void simpleBoard(){
        for(int i=0;i<boardsize;i++) {
            //faire case random
            board.add(i, new CaseBox());
        }
    }

    public int getCratePositon() {
        return cratePositon;
    }

    public void setCratePositon(int cratePositon) {
        this.cratePositon = cratePositon;
    }

    public ArrayList<Case> getBoard() {
        return board;
    }

    public void setBoard(ArrayList<Case> board) {
        this.board = board;
    }

    public int getBoardsize() {
        return boardsize;
    }

    public void setBoardsize(int boardsize) {
        this.boardsize = boardsize;
    }



    public String getEnemy() {
        return enemy;
    }

    public void setEnemy(String enemy) {

        this.enemy = enemy;
    }

    public int getCrate() {
        return cratePositon;
    }

    public void setCrate(int crate) {
        this.cratePositon = crate;
    }

    public int getSorcererPosition() {
        return sorcererPosition;
    }

    public void setSorcererPosition(int sorcererPosition) {
        this.sorcererPosition = sorcererPosition;
    }

    public int getGoblinPosition() {
        return goblinPosition;
    }

    public void setGoblinPosition(int goblinPosition) {
        this.goblinPosition = goblinPosition;
    }

    public int getDragonPosition() {
        return dragonPosition;
    }

    public void setDragonPosition(int dragonPosition) {
        this.dragonPosition = dragonPosition;
    }


}

import java.util.Random;

public class Board {
    String enemy;
    int cratePositon;
    int sorcererPosition;
    int goblinPosition;
    int dragonPosition;

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

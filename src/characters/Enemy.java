package characters;

import board.Case;

public class Enemy extends Personnage implements Case {
    public Enemy(String name) {
        super(name);
    }
    @Override
    public String toString() {
        String message = "name : " + this.name;
        message += "\ntype : " + this.type;
        message += "\nlife : " + this.life;
        message += "\npower : " + this.power;
        return message;
    }

    @Override
    public void event() {
        System.out.println(this.toString());
    }

    @Override
    public void interaction(Personnage personnage) {
        this.life -= personnage.power;
        System.out.println("il reste" +this.life+ "pv a l'ennemi");
        if (this.life >0){
            personnage.life -= this.power;
            System.out.println(personnage.life);
        }}
}

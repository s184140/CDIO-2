package sample.die;
import java.util.Random;

public class dieModel {
    private int dice;

    public void rollDice() {
        this.dice = new Random().nextInt(6) + 1;
    }

    public int getDice() {
        return this.dice;
    }

}

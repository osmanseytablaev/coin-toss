import java.lang.Math;
import java.util.*;

class Coin {
    protected String state;
    private int getRandomResult(int max, int min) {
        int range = max - min + 1;
        return (int) (Math.random() * range) + min;
    }
    public void toss() {
        int rand = getRandomResult(2, 1);
        if (rand == 1) {
            // Орел
            System.out.println("Heads");
            state = "Heads";
        }
        if (rand == 2) {
            // Решка
            System.out.println("Tails");
            state = "Tails";
        }
    }
}
public class CoinToss2 {
    public static void main(String[] args) {
        while (true) {
            Coin coin = new Coin();
            Scanner in = new Scanner(System.in);
            System.out.print("Press 'Enter'");
            String enter = in.nextLine();
            if (enter.equals("exit")) {
                break;
            }
            coin.toss();
        }
    }
}

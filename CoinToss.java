import java.lang.Math;
import java.util.*;
public class CoinToss {
    public static void main(String[] args) {
        while (true) {
            Scanner in = new Scanner(System.in);
            System.out.print("Press 'Enter'");
            String enter = in.nextLine();
            if (enter.equals("exit")) {
                break;
            }
            int max = 2;
            int min = 1;
            int range = max - min + 1;
            int coin = (int) (Math.random() * range) + min;
            if (coin == 1) {
                // Орел
                System.out.println("Heads");
            }
            if (coin == 2) {
                // Решка
                System.out.println("Tails");
            }
        }
    }
}
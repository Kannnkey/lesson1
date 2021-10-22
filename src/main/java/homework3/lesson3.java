package homework3;

import java.util.Random;

public class lesson3 {
    public static void main(String[] args) {
        int[] b = new int[10];

        final Random random = new Random();
        for (int i = 0; i < b.length; i++) {
            b[i] = random.nextInt(100);
        }
        for (int i = 0; i < b.length; i++) {
        System.out.println("b[" + i + "] = " + b[i]);
        }
    }
}
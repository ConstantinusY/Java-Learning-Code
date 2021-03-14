package code10;

import java.util.Random;

public class code10 {
    public static void main(String[] args) {
        //Random rand = new Random(10000);
        Random rand = new Random((int)System.currentTimeMillis());
        System.out.println(rand.nextInt());
        System.out.println(rand.nextInt(10));
        System.out.println(rand.nextDouble());
        System.out.println(rand.nextFloat());
        for (int i = 0; i < 10; i++) {
            System.out.print(rand.nextInt(10)+"  ");
        }
    }
}

package rtti;

import java.util.Random;

public class TestRandom {
    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int n = random.nextInt(26);
            System.out.println(n);
        }
    }
}

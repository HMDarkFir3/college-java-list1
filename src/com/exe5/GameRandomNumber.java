package com.exe5;

import java.util.Random;

public class GameRandomNumber {
    Random random = new Random();
    int randomNumber = random.nextInt(100);

    void shuffle() {
        System.out.println(randomNumber);
    }
}

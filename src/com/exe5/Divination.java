package com.exe5;

public class Divination {
    int count = 0;

    GameRandomNumber gameRandomNumber = new GameRandomNumber();

    void kick(int userKick) {
        if(count < 5) {
            if(userKick == gameRandomNumber.randomNumber) {
                System.out.println("Chute: " + userKick);
                System.out.println("Acertou!!!");
            } else {
                System.out.println("Chute: " + userKick);
                System.out.println("Errou!!!");
            }
        } else {
            System.out.println("Acabou as tentativas!");
        }

        count++;
    }

    void showRandomNumber() {
        System.out.println("Número: " + gameRandomNumber.randomNumber);
    }
}

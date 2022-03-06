package com.exe5;

public class Main {
    public static void main(String[] args) {
        GameRandomNumber gameRandomNumber = new GameRandomNumber();
        Divination divination = new Divination();

        gameRandomNumber.shuffle();

        divination.kick(4);
    }
}

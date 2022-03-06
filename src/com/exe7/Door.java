package com.exe7;

public class Door {
    boolean isOpen;
    int count = 0;

    void open() {
        if(isOpen) {
            System.out.println("A Porta já está aberta!");
            return;
        }

        isOpen = true;
        count++;
    }

    void close() {
        if(isOpen == false) {
            System.out.println("A Porta já está fechada!");
            return;
        }

        isOpen = false;
    }

    void show() {
        System.out.println("Porta: " + (isOpen ? "Aberta" : "Fechada"));
        System.out.println("Quantas vezes a porta abriu: " + count);
        System.out.println("");
    }
}

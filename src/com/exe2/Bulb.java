package com.exe2;

public class Bulb {
    boolean isActive = false;
    int count = 0;

    void activeBulb() {
        if(count < 5) {
            if(isActive) {
                isActive = false;
            } else {
                isActive = true;
            }
        } else {
            isActive = false;
            System.out.println("Lâmpada queimou!!!");
        }

        count++;

        System.out.println("Lâmpada: " + (isActive ? "Acessa" : "Apagada"));
        System.out.println("Cliques: " + count);
        System.out.println("");
    }
}




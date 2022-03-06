package com.exe1;

public class Barbecue {
    double quantityMeet;

    void verifySpent(Person person) {
        if(person.age >= 0 && person.age <= 3) {
            quantityMeet = 0;
        } else if(person.vegetarian) {
            quantityMeet = 0;
        } else if(person.age >= 4 && person.age <= 12) {
            quantityMeet = 1;
        } else {
            quantityMeet = 2;
        }

        System.out.println("Consumo: " + quantityMeet + " KG");
    }
}

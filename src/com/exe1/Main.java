package com.exe1;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Henrique", "Masculino", 12, false);
        Barbecue barbecue = new Barbecue();

        person.showPerson();
        barbecue.verifySpent(person);
    }
}

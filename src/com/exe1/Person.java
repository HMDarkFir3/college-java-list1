package com.exe1;

public class Person {
    String name;
    String sex;
    int age;
    boolean vegetarian;

    public Person(String name, String sex, int age, boolean vegetarian) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.vegetarian = vegetarian;
    }

    void showPerson(){
        System.out.println("Nome: " + name);
        System.out.println("Sexo: " + sex);
        System.out.println("Idade: " + age);
        System.out.println("Vegetariano: " + (vegetarian ? "Sim" : "Não"));
    }
}

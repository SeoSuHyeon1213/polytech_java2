package com.survivalcoding;


public class Main {
    public static void main(String[] args) {

        System.out.println("Hello and welcome!");

        Cleric cleric = new Cleric();
        System.out.println(cleric.name);
        cleric.selfAid();
        cleric.pray(3);
        cleric.pray(5);
    }
}
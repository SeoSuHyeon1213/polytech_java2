package com.survivalcoding;

public class Slime {
    final String suffix;
    private int hp;

    public Slime(String suffix) {
        this.suffix = suffix;
    }

    public void attack(Hero hero) {
        System.out.println("slime " + suffix + " is attacked");
        System.out.println("-10 Damage");
        hero.setHp(hero.getHp() - 10);
    }
}

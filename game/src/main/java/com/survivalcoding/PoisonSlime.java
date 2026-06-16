package com.survivalcoding;

public class PoisonSlime extends Slime {

    private int poisonCount = 5;

    public PoisonSlime(String suffix) {
        super(suffix);
    }

    public void poisonSlimeAttack(Hero hero) {
        super.attack(hero);

        if (poisonCount <= 0) {
            System.out.println("poisoned!");
            int poisonDamage = hero.getHp() / 5;
            hero.setHp(hero.getHp() - poisonDamage);
            System.out.println(poisonDamage + " point damage");

        }
        poisonCount--;
    }
}

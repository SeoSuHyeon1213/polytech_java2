package com.survivalcoding;

import org.junit.jupiter.api.Test;

class HeroTest {

    @Test
        //("체력이 1식 감소 하는지 테스트")
    void attack() {
        //given
        Hero hero = new Hero();
        hero.hp = 10;
        hero.attack(); //9
        hero.attack(); //8


    }
}
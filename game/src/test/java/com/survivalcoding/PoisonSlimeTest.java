package com.survivalcoding;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class PoisonSlimeTest {
    //public static void main(String[] args) {

    //용사 생성 (ram 메모리에 용사 데이터 올리기)
    @Test
    //given
    void given() {
        Hero hero = new Hero();
        PoisonSlime slimeA = new PoisonSlime("A");
    }

    //when
    @Test
    @DisplayName("PoisonSlimeTest")
    void when() {

        for (int i = 0; i < 10; i++) {
            slimeA.poisonSlimeAttack(hero);
        }
    }

    //then
    void then() {
        assert (slimeA.poisonSlimeAttack(hero));
    }
}
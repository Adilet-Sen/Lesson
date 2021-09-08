package com.company.animal.house;

import com.company.animal.Animal;

import javax.sound.midi.Soundbank;

public class Cat extends Animal  {

    private int distRunLimit;
    private int distJumpLimit;
    private int distSwimLimit;

    public static int getCount() {
        return count;
    }

    private static int count;

    public Cat(String type, String name, String color, int age, int distRunLimit, int distJumpLimit, int distSwimLimit) {
        super(type, name, color, age);
        this.distRunLimit = distRunLimit;
        this.distJumpLimit = distJumpLimit;
        this.distSwimLimit = distSwimLimit;
        count++;
    }

    @Override
    public void run(int distRun) {
        if(distRun <= distRunLimit || distRun == 0){
            System.out.println("Пробежал: "+ distRun);
        }
        else {
            System.out.println("Кот не смог пробежать: "+distRun);
        }
    }

    @Override
    public void jump(int distJump) {
        if(distJump <= distJumpLimit || distJump == 0){
            System.out.println("Прыгнул: "+ distJump);
        }
        else {
            System.out.println("Кот не смог прыгнуть: "+distJump);
        }
    }

    @Override
    public void swim(int swim) {
        System.out.println("Кот не умеет плавать");
    }

    @Override
    public void voice() {
        System.out.println("Мяу Мяу");
    }
}

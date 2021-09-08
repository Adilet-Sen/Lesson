package com.company.animal.house;

import com.company.animal.Animal;

public class Dog extends Animal {
    private int distRunLimit;
    private int distJumpLimit;
    private int distSwimLimit;

    public static int getCount() {
        return count;
    }

    private static int count;

    public Dog(String type, String name, String color, int age, int distRunLimit, int distJumpLimit, int distSwimLimit) {
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
            System.out.println("Собака не смогла пробежать: "+distRun);
        }
    }

    @Override
    public void jump(int distJump) {
        if(distJump <= distJumpLimit || distJump == 0){
            System.out.println("Прыгнул: "+ distJump);
        }
        else {
            System.out.println("Собака не смог прыгнуть: "+distJump);
        }
    }

    @Override
    public void swim(int swim) {
        if(swim <= distSwimLimit || swim == 0){
            System.out.println("Проплыл: "+ swim);
        }
        else {
            System.out.println("Собака не смог проплыть: "+swim);
        }
    }

    @Override
    public void voice() {
        System.out.println("Гав гав");
    }
}

package com.company.animal;

public abstract class Animal {
    private String type;
    private String name;
    private String color;
    private int age;
    private static int count;
    protected int distRunLimit;
    protected int distJumpLimit;
    protected int distSwimLimit;
    protected String voice;

    public Animal(String type, String name, String color, int age, int distRunLimit, int distJumpLimit, int distSwimLimit, String voice) {
        this.type = type;
        this.name = name;
        this.color = color;
        this.age = age;
        this.distRunLimit = distRunLimit;
        this.distJumpLimit = distJumpLimit;
        this.distSwimLimit = distSwimLimit;
        this.voice = voice;
        count++;
    }

    public void run(int distRun) {
        if(distRun <= distRunLimit || distRun == 0){
            System.out.println("Пробежал: "+ distRun);
        }
        else {
            System.out.println("Животное не смог пробежать: "+distRun);
        }
    }


    public void jump(int distJump) {
        if(distJump <= distJumpLimit || distJump == 0){
            System.out.println("Прыгнул: "+ distJump);
        }
        else {
            System.out.println("Животное не смог прыгнуть: "+distJump);
        }
    }


    public void swim(int swim) {
        System.out.println("Животное не умеет плавать");
    }


    public void voice() {
        System.out.println();
    }

    public void info(){
        System.out.println("Вид: "+ type+ " Имя: "+ name+ " Цвет: "+ color+" Возраст: "+age);
    }

    public static void countInfo(){
        System.out.println(" Количество животных: "+ count);
    }

}

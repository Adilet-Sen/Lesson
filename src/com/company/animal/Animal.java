package com.company.animal;

public abstract class Animal {
    private String type;
    private String name;
    private String color;
    private int age;
    private static int count;


    public Animal(String type, String name, String color, int age) {
        this.type = type;
        this.name = name;
        this.color = color;
        this.age = age;
        count++;
    }

    public abstract void run(int a);

    public abstract void jump(int b);

    public abstract void swim(int c);

    public abstract void voice();

    public void info(){
        System.out.println("Вид: "+ type+ " Имя: "+ name+ " Цвет: "+ color+" Возраст: "+age+ " Количество животных: "+ count);
    }

}

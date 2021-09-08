package com.company.animal.house;
import com.company.animal.Animal;

public class Cat extends Animal  {


    public static int getCount() {
        return count;
    }

    private static int count;

    public Cat(String type, String name, String color, int age, int distRunLimit, int distJumpLimit, int distSwimLimit, String voice) {
        super(type, name, color, age, distRunLimit, distJumpLimit, distSwimLimit, voice);
        count++;
    }
}

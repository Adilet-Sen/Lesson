package com.company.animal.house;
import com.company.animal.Animal;

public class Dog extends Animal {

    private static int count;

    public Dog(String type, String name, String color, int age, int distRunLimit, int distJumpLimit, int distSwimLimit, String voice) {
        super(type, name, color, age, distRunLimit, distJumpLimit, distSwimLimit, voice);
        count++;
    }

    public static int getCount() {
        return count;
    }

}

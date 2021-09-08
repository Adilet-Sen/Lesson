package com.company;

import com.company.animal.Animal;
import com.company.animal.house.Cat;
import com.company.animal.house.Dog;

public class Main {

    public static void main(String[] args) {

        Animal animal[] = {
                new Cat("Кошка", "Барсик", "Черный", 1, 200, 2, 0),
                new Cat("Кошка", "Бара", "Желтый", 2, 200, 2, 0),
                new Cat("Кошка", "Баря", "красный", 3, 200, 2, 0),
                new Dog("Собака", "Барсук", "белый", 6, 500, 5, 100),
                new Dog("Собака", "Барсис", "Серый", 10, 500, 5, 100),

        };

        for (Animal animals: animal) {
            animals.info();
            animals.run(100);
            animals.run(505);
            animals.jump(2);
            animals.jump(11);
            animals.swim(55);
            animals.swim(105);

        }
        System.out.println("Кошек: "+Cat.getCount() +" Собак: "+Dog.getCount());

    }
}

package men.adilet.animal;

import men.adilet.animal.adnimals.*;

public class MainApp {
    public static void main(String[] args) {

        Animal animal[] ={
                new HouseCat("Боря", 200),
                new Dog("Борчик", 500, 50),
                new Tiger("Тигрера", 1000, 500),
                new Dog("Тайган",999, 150)
        };

        for (Animal animal1: animal){
            animal1.run(499);
            animal1.swim(50);
        }
        System.out.println("Количество животных: "+Animal.count);
        System.out.println("Количество собак: "+Dog.count);
        System.out.println("Количество домащних кошек: "+HouseCat.count);
        System.out.println("Количество тигров: "+Tiger.count);
    }
}

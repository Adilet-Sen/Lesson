package men.adilet.animal.adnimals;

public class Dog extends Animal {
    public static int count;

    public Dog(String name, int maxDistRun, int maxDistSwim) {
        super("Пес", name, maxDistRun, maxDistSwim);
        count++;
    }
}

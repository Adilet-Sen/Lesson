package men.adilet.animal.adnimals;

public abstract class Cat extends Animal {
    public static int count;
    public Cat(String type, String name, int maxDistRun, int maxDistSwim) {
        super(type, name, maxDistRun, maxDistSwim);
        count++;
    }
}

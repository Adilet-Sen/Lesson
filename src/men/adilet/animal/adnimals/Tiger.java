package men.adilet.animal.adnimals;

public class Tiger extends Animal{
    public static int count;

    public Tiger(String name, int maxDistRun, int maxDistSwim) {
        super("Тигр", name, maxDistRun, maxDistSwim);
        count++;
    }
}

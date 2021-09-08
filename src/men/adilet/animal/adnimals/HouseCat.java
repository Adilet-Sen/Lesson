package men.adilet.animal.adnimals;

public class HouseCat extends Animal{
    public  static int count;

    public HouseCat(String name, int maxDistRun) {
        super("Кошка домшняя", name, maxDistRun, 0);
        count++;
    }
}

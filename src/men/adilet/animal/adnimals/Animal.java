package men.adilet.animal.adnimals;

public abstract class Animal {
    public static  int count;

    String type;
    String name;

    int maxDistRun ;
    int maxDistSwim;

    public Animal(String type, String name, int maxDistRun, int maxDistSwim) {
        count++;
        this.type = type;
        this.name = name;
        this.maxDistRun = maxDistRun;
        this.maxDistSwim = maxDistSwim;
    }

    public void run(int distance)
    {

        if(distance<=maxDistRun){
            System.out.println(type + " "+ name + "Смог пробежать: "+ distance + "m.");
        }
        else {
            System.out.println(type + " "+ name + "Не смог пробежать: "+ distance + "m.");
        }

    }

    public void swim(int distance)
    {
        if(maxDistSwim == 0){
            System.out.println(type + " "+ name + "Не умеет плавать: "+ distance + "m.");
            return;
        }

        if(distance<=maxDistSwim){
            System.out.println(type + " "+ name + "Смог проплыть: "+ distance + "m.");
        }
        else {
            System.out.println(type + " "+ name + "Не смог проплыть: "+ distance + "m.");
        }

    }
}

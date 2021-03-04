public class Dog extends Animals {
    int runDistance;
    int swimDistance;

    public Dog(String name){
        super(name);
    }

    @Override
    public int getSwimDistance() {
        swimDistance=10;
        return swimDistance;
    }

    @Override
    public int getRunDistance() {
        runDistance=500;
        return runDistance;
    }
}

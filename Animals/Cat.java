public class Cat extends Animals{
    int runDistance;
    int swimDistance;


    public Cat(String name){
        super(name);
    }

    @Override
    public int getSwimDistance() {
        swimDistance=0;
        return swimDistance;
    }

    @Override
    public int getRunDistance() {
        runDistance = 200;
        return runDistance;
    }
}


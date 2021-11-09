public class Road implements Activitis  {

    int rundistance = 0;
    final int jchek = 0;

    public Road(int distance) {
        this.rundistance = distance;
    }

    @Override
    public int get_hight() {
        return jchek;
    }

    @Override
    public int get_distance() {
        return rundistance;

    }

}


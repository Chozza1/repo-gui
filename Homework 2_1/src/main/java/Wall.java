public class Wall implements Activitis {
    int jumpheight = 0;
    final int rchek = 0;

    public Wall(int hight) {
        this.jumpheight = hight;
    }


    @Override
    public int get_hight() {
        return jumpheight;
    }

    @Override
    public int get_distance() {
        return rchek;
    }
}


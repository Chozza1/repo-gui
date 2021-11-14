public class Empty implements Action1 {

    int max_run = 0;
    int max_jump = 0;

    @Override
    public void run() {

    }

    @Override
    public void jump() {

    }

    @Override
    public int getMax_run() {
        return max_run;
    }

    @Override
    public int getMax_jump() {
        return max_jump;
    }

    @Override
    public String getName() {
        return null;
    }
}

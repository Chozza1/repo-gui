public class Cat implements Action1{

    String name;
    int max_run = 0;
    int max_jump = 0;

    public Cat(String name,int max_jump,int max_run){
        this.name = name;
        this.max_run = max_run;
        this.max_jump = max_jump;
    }

    @Override
    public String getName(){
        return name;
    }

    @Override
    public void run() {
        System.out.println("Cat " + name +" run");
    }

    @Override
    public void jump() {
        System.out.println("Cat " + name +" jump");
    }

    @Override
    public int getMax_run() {
        return max_run;
    }

    @Override
    public int getMax_jump() {
        return max_jump;
    }
}


public class Animals {
    String name;
    int runDistance;
    int swimDistance;
    static int count;

    public Animals(){
    }

    public Animals(String name){
        count++;
        this.name = name;
        this.swimDistance = getSwimDistance();
        this.runDistance = getRunDistance();
    }

    public int getRunDistance() {
        return runDistance;
    }

    public int getSwimDistance() {
        return swimDistance;
    }

    public void run(int a) {
        if (a <= runDistance) {
            System.out.println(count + " " + name + " пробежал " + a + " метров");
        } else {
            System.out.println(count + " " + name + " не может столько пробежать");
        }
    }

    public void swim(int a){
            if (swimDistance > a) {
                System.out.println(name + " проплыл " + a + " метров");
            } else {
                System.out.println(name + " не может столько проплыть =(");
            }
    }

    public static void main(String[] args) {
       Dog dog = new Dog("Sharik");
       dog.run(500);
       dog.swim(10);
       Cat cat = new Cat("Barsik");
       cat.run(100);
       cat.swim(1);
       Dog dog1 = new Dog("Bobik");
       dog1.run(501);
    }
}


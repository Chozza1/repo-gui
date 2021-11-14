import java.sql.Array;

public class Main {

    public static void main(String[] args) {
        Empty empty = new Empty();
        Action1[] testers = new Action1[3];
        testers[0] = new Cat("Barsik",3,300);
        testers[1] = new Human("Vasiliy",2,350);
        testers[2] = new Robot("Fedor",10,800);

        Activitis[] tests = new Activitis[5];
       tests[0] = new Wall(2);
       tests[1] = new Road(150);
       tests[2] = new Wall(1);
       tests[3] = new Road(400);
       tests[4] = new Road(1000);


        for (int i = 0; i < testers.length;i++){
            for (int j = 0; j < tests.length;j++){
                if (tests[j].get_hight() != 0){
                    if (testers[i].getMax_jump() >= tests[j].get_hight()){
                        testers[i].jump();
                    }else {
                        System.out.println("Участник " + testers[i].getName() +" не смог и выбыл");
                        testers[i] = empty;
                    }
                }else if (tests[j].get_distance() != 0){
                    if (testers[i].getMax_run() >= tests[j].get_distance()){
                        testers[i].run();
                    }else {
                        System.out.println("Участник " + testers[i].getName() +" не смог и выбыл");
                        testers[i] = empty;
                    }
                }
            }
        }
    }

}




public class Homework {
    public static void main(String[] args) {
        int a = 1;
        double b = 0.1;
        float c = 0.001f;
        long d = 122200L;
        short e = 12;
        byte f = 127;
        char g = 12;
        boolean h = true;
    }


    public static float task_3(float a, float b, float c, float d) {
        return a*(b+(c/d));
    }

    public static boolean task_4(int a, int b) {
        if (a+b>=10 && a-b<=20){
          return true;}
          return falsw;
  

    public static void task_5(int a) {
       if (a>=0){
            System.out.println(" Число положительное");
        }
        else {
            System.out.println(" Число отрицательное");
        }
    }

    public static boolean task_6(int a) {

        if (a <= 0) {
            return true;
        }
        return false;
    }

    public static void task_7(String ch){
        System.out.println("Привет " + ch);
    }


    public static void task_8(int yaer){
        System.out.println();
        if ((yaer%400==0 || yaer%100!=0) &&(yaer%4==0)) {
            System.out.println("Год високосный");
        }
        else {
            System.out.println("Год не високосный");
        }

    }

}


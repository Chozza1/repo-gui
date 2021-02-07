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

    public static float task_3(float a, float b, float c, float d, float e) {
       a = 0.0002f;
       b = 0.00001f;
       c = 1.54333f;
       d = 1.123123f;
       e = a*(b+(c/d));
       return e;
    }

    public static boolean task_4(int a, int b, int c) {
        a = 2;
        b = 7;
        c = a + b;
        if (c>=10 && c<=20){
            return true;
        }
       else {
             return false;
       }
    }

    public static void task_5(int a) {
        a = -10;
        if (a>=0){
            System.out.println(" Число положительное");
        }
        else {
            System.out.println(" Число отрицательное");
        }
    }

    public static boolean task_6(int a) {
        a = 1;
        if (a <= 0) {
            return true;
        }
        return false;
    }

    public static void task_7(String Мир){
        Мир = "Мир";
        System.out.println("Привет" + Мир);
    }


    public static void task_8(int yaer){
        yaer=1968;
        System.out.println();
        if ((yaer%400==0 || yaer%100!=0) &&(yaer%4==0)) {
            System.out.println("Год високосный");
        }
        else {
            System.out.println("Год не високосный");
        }

    }

}


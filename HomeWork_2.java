import java.util.Arrays;

public class HomeWork_2 {
    public static void main(String[] args) {
        int[] task_1 = {0, 1, 1, 0, 1, 0, 1, 0};
        int[] task_2 = new int[8];
        int[] task_3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int[][] task_4 = new int[7][7];
        int[] task_5 = {4, 10, 20, 4, 9, 14, 5, 1};


        //task_1
        for (int i = 0; i < task_1.length; i++) {
            if (task_1[i] == 0) {
                task_1[i] += 1;
            } else {
                task_1[i] -= 1;
            }
        }


        //task_2
        for (int i = 0; i < task_2.length; i++) {
            task_2[i] = i * 3;
        }


        //task_3
        for (int i = 0; i < task_3.length; i++) {
            if (task_3[i] < 6) {
                task_3[i] *= 2;
            }
        }


        //task_4
        for (int i = 0; i < task_4.length; i++) {
            for (int j = 0; j < task_4[i].length; j++) {
                if (i == j || j == task_4[i].length - 1 - i) {
                    task_4[i][j] = 1;
                }
            }
        }


        //task_5
        int max = task_5[0], min = task_5[0];
        for (int i = 0; i < task_5.length; i++) {
            if (max < task_5[i]) {
                max = task_5[i];
            } else {
                min = task_5[i];
            }
        }
    }


    //task_6
    static boolean chekBalance(int[] task_6) {
        for (int i = 0; i < task_6.length; i++) {
            int sum_left = 0, sum_right = 0;
            for (int j = 0; j < i; j++) {
                sum_left += task_6[j];
            }
            for (int j = i; j < task_6.length; j++) {
                sum_right += task_6[j];
            }
            if (sum_left == sum_right) {
                return true;
            }
        }
        return false;
    }


    //task_7
    static void shiftNumbers(int[] task_7, int n) {
        if (Math.abs(n) > task_7.length){
            int s = n % task_7.length;
            n = s;
        }
            if(n != 0){
                if (n > 0) {
                    for (int i = 0; i <= n; i++) {
                        int buffer = task_7[0];
                        task_7[0] = task_7[task_7.length - 1];
                        for (int j = 1; j < task_7.length - 1; j++) {
                            task_7[task_7.length - j] = task_7[task_7.length - j - 1];
                        }
                        task_7[1] = buffer;
                    }
                }
                else if (n < 0) {
                    for (int i = 0; i >= n; i--) {
                        int buffer = task_7[task_7.length - 1];
                        task_7[task_7.length - 1] = task_7[0];
                        for (int j = 1; j < task_7.length - 1; j++) {
                            task_7[j - 1] = task_7[j];
                        }
                        task_7[task_7.length - 2] = buffer;
                    }
                }
            }
    }
}





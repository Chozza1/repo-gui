import java.util.Arrays;

public class Main {


    public static void firstMethod() {
        int size = 10_000_000;
        float[] arr = new float[size];
        Arrays.fill(arr, 1.0f);
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        System.out.println("One thread time: " + (System.currentTimeMillis() - startTime) + " ms.");
    }


    public static void secondMethod() {
        int size = 10_000_000;
        int half = size/2;
        float[] arr = new float[size];
        float[] leftArr = new float[half];
        float[] rightArr = new float[half];
        Arrays.fill(arr, 1.0f);
        long startTime = System.currentTimeMillis();
        System.arraycopy(arr,0,leftArr,0,half);
        System.arraycopy(arr, half,rightArr,0,half);
        Thread thread = new Thread(() -> {
            for (int i = 0; leftArr.length > i; i++) {
                leftArr[i] = (float) (leftArr[i] * Math.sin(0.2f + (float) i / 5) * Math.cos(0.2f + (float) i / 5) * Math.cos(0.4f + (float) i / 2));
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < rightArr.length; i++) {
                int j = i + half;
            rightArr[i] = (float) (rightArr[i] * Math.sin(0.2f + ((float)j) / 5) * Math.cos(0.2f + ((float) j) / 5) * Math.cos(0.4f + ((float) j) / 2));
        }
        });
        thread.start();
        thread2.start();
        try {
            thread.join();
            System.out.println("first thread time: " + (System.currentTimeMillis() - startTime) + " ms.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            thread2.join();
            System.out.println("second thread time: " + (System.currentTimeMillis() - startTime) + " ms.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        float[] mergedArr = new float[size];
        System.arraycopy(leftArr, 0 , mergedArr, 0, half);
        System.arraycopy(rightArr, 0, mergedArr, half, half);
        System.out.println("Two thread time: " + (System.currentTimeMillis() - startTime) + " ms.");

    }


    public static void main(String[] args) {
      firstMethod();
      secondMethod();
    }


}

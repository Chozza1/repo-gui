import java.util.Arrays;

public class Main  {

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
        for (int i = 0; i < leftArr.length; i++) {
            leftArr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        System.out.println("first thread time: " + (System.currentTimeMillis() - startTime) + " ms.");
        for (int i = 0; i < rightArr.length; i++) {
            rightArr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        System.out.println("second thread time: " + (System.currentTimeMillis() - startTime) + " ms.");
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

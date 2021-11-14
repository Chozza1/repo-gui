import java.util.zip.DataFormatException;

public class Main {

    public static int exception(String[][] arr) throws MyArraySizeException,MyArrayDataException {
        int sum = 0;
        if (arr.length != 4) {
            throw new MyArraySizeException();
        }
        for (String[] strings : arr) {
            if (strings.length != 4) {
                throw new MyArraySizeException();
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr[i].length; j++){
                try {
                    sum = sum + Integer.parseInt(arr[i][j]);
                }catch (NumberFormatException e){
                    e.printStackTrace();
                }
            }
        }
        return sum;

    }

    public static void main(String[] args) {
        String[][] array = new String[4][4];
        array[0][0] = "1";
        array[0][1] = "1";
        array[0][2] = "1";
        array[0][3] = "1";
        array[1][0] = "1";
        array[1][1] = "1";
        array[1][2] = "1";
        array[1][3] = "1";
        array[2][0] = "1";
        array[2][1] = "1";
        array[2][2] = "1";
        array[2][3] = "1";
        array[3][0] = "1";
        array[3][1] = "1";
        array[3][2] = "1";
        array[3][3] = "1";
         try {
            int sum = exception(array);
             System.out.println(sum);
         }catch (MyArraySizeException e){
             e.printStackTrace();
         }catch (MyArrayDataException e){
             e.printStackTrace();
         }


    }
}

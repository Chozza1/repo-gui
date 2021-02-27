import java.util.Scanner;

public class Homework3_2 {
    public static void main(String[] args) {
        GuesWord();
    }

    static Scanner gues1 = new Scanner(System.in);
    public static char [] Block(){
        char[] block = new char[15];
        for (int n = 0; n < block.length - 1; n++) {
            char b = '#';
            block[n] = b;
        }
        return block;
    }

    public static String RandomWord(){
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        String word = words[(int) (Math.random() * words.length)];
        return word;
    }

    public static void GuesWord(){
        String wprd = RandomWord();
        char[] block = Block();
        System.out.println("Угадайте слово");
        for (int i = 0; i < Integer.MAX_VALUE; i++){
            System.out.println(block);
            String answer = gues1.nextLine();
            if (answer.equals(wprd)) {
                System.out.println(wprd);
                break;
            } else {
                for (int j = 0; j < answer.length() - 1 && j < wprd.length() - 1; j++) {
                    char a = wprd.charAt(j);
                    char b = answer.charAt(j);
                    if (a == b) {
                        block[j] = a;
                    }
                }
            }
        }
    }
}





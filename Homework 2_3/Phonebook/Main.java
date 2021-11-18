public class Main {


    public static void main(String[] args) {

        Phonebook phoneBook = new Phonebook();

        phoneBook.add("Vanya","89999999999");
        phoneBook.add("Lesha","89999999998");
        phoneBook.add("Petya","89999999997");
        phoneBook.add("Vanya","89999999996");
        phoneBook.add("Masha","89999999995");

        System.out.println("Vanya");
        for (String phoneNumber : phoneBook.get("Vanya")) {
            System.out.println(" " + phoneNumber);
        }
    }
}

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Phonebook {
    Map<String, List<String>> phoneBook;


    public Phonebook() {
        this.phoneBook = new HashMap<>();
    }

    public void add(String name, String phoneNumber) {
        if (phoneBook.containsKey(name)){
            phoneBook.get(name).add(phoneNumber);
        }else{
            phoneBook.put(name, new ArrayList<>());
            phoneBook.get(name).add(phoneNumber);
        }
    }

    public List<String> get(String name) {
        return phoneBook.get(name);
    }
}

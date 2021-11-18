import java.util.*;

public class Main {

  public static void main(String[] args) {
    List<String> words = new ArrayList<>();
    words.add("A");
    words.add("R");
    words.add("N");
    words.add("B");
    words.add("C");
    words.add("V");
    words.add("A");
    words.add("B");
    words.add("C");
    words.add("D");
    words.add("E");
    words.add("F");
    words.add("G");

//    Set<String> uniqueWords = new HashSet<String>(words);
//    System.out.println(uniqueWords);
//     String [] count1 = new String[uniqueWords.size()];
//     uniqueWords.toArray(count1);
//     String [] count2 = new String[words.size()];
//    words.toArray(count2);

    Map<String, Integer> uniqueWords = new HashMap<>();

    for (String word : words) {
      if (uniqueWords.containsKey(word)) {
        uniqueWords.put(word, uniqueWords.get(word) + 1);
      } else {
        uniqueWords.put(word, 1);
      }
    }
    for (Map.Entry<String, Integer> entry : uniqueWords.entrySet()) {
      System.out.println(entry.getKey() + " " + entry.getValue());
    }
  }
}





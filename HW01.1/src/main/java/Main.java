import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;

public class Main {
    public static void main(String[] args) {

        Multimap<String, Integer> multimap = ArrayListMultimap.create();
        multimap.put("A", 1);
        multimap.put("B", 2);
        multimap.put("C", 3);
        multimap.put("D", 4);
        multimap.entries().forEach(e -> System.out.println("Key: " + e.getKey() + " Value: " + e.getValue()));

    }
}

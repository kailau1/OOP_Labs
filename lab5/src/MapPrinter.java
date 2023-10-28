import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class MapPrinter {
    public static void printKeys(Map<String, String> map) {
        //TODO: Check the keyset() method of the Map class
        //       and use it iterate over the keys and print them
        Set<String> s = map.keySet();
        System.out.println(s);

    }

    public static void printValues(Map<String, String> map) {
        //TODO: Check the values() method of the Map class
        //       and use it iterate over the values and print them
        Collection<String> v = map.values();
        System.out.println(v);
    }

    public static void printPairs(Map<String, String> map) {
        //TODO: Check the getKey() and getValues() methods
        //       of the Map.Entry class and use them to iterate
        //       over the keys and  values  of a Map.Entry object
        //       and print them
        for (Map.Entry<String, String> entry: map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println("Key: "+ key + "  Value:"+ value);
        }

    }
}

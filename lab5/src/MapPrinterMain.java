import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
public class MapPrinterMain {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        map.put("07497825015", "Alexis");
        map.put("07887053888", "Amir");
        map.put("07401137719", "David");
        map.put("07837492712", "Matthew");
        map.put("07986739572", "Jade");
        map.put("07392730127", "Marco");

        MapPrinter.printKeys(map);
        MapPrinter.printValues(map);
        MapPrinter.printPairs(map);

    }




}

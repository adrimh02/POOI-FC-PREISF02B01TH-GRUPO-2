import java.util.HashMap;
import java.util.Map;

public class Almacen2 {
    private Map<String, Integer> UtilesDeCasa = new HashMap<>();

    public void add(String item, int quantity) {
        UtilesDeCasa.put(item, quantity);
    }

    public void delete(String item) {
        UtilesDeCasa.remove(item);
    }

    public int search(String item) {
        return UtilesDeCasa.getOrDefault(item, 0);
    }
}

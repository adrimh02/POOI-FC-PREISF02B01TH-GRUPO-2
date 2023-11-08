import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Almacen1 {
  
    private Map<String, Integer> comida = new HashMap<>();

    public void add(String item, int quantity) {
        comida.put(item, quantity);
    }

    public void delete(String item) {
        comida.remove(item);
    }

    public int search(String item) {
        return comida.getOrDefault(item, 0);
    }
}
    


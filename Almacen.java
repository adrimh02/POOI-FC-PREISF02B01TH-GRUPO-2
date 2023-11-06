import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Almacen {
    private List<String> inventario;
    private Map<String, String> productoSectorMap;

    public Almacen() {
        inventario = new ArrayList<>();
        productoSectorMap = new HashMap<>();
    }

    public void agregarProducto(String producto, String sector) {
        if ("comida".equalsIgnoreCase(sector) || "útiles de casa".equalsIgnoreCase(sector)) {
            inventario.add(producto);
            productoSectorMap.put(producto, sector);
            System.out.println("Producto agregado al almacén en el sector: " + sector);
        } else {
            System.out.println("El sector especificado no es válido.");
        }
    }

    public void quitarProducto(String producto) {
        if (inventario.contains(producto)) {
            String sector = productoSectorMap.get(producto);
            inventario.remove(producto);
            productoSectorMap.remove(producto);
            System.out.println("Producto eliminado del almacén en el sector: " + sector);
        } else {
            System.out.println("Producto no encontrado en el almacén: " + producto);
        }
    }

    public void imprimirInventario() {
        if (inventario.isEmpty()) {
            System.out.println("Inventario del almacén: Vacío");
        } else {
            System.out.println("Inventario del almacén:");
            for (String producto : inventario) {
                String sector = productoSectorMap.get(producto);
                System.out.println(producto + " (Sector: " + sector + ")");
            }
        }
    }

    public String buscarProducto(String producto) {
        if (productoSectorMap.containsKey(producto)) {
            return productoSectorMap.get(producto);
        } else {
            return "Producto no encontrado en el almacén.";
        }
    }

    public static void main(String[] args) {
        Almacen almacen = new Almacen();
        Scanner scanner = new Scanner(System.in);

        int opcion;
        do {
            System.out.println("Menú de opciones:");
            System.out.println("1. Agregar producto");
            System.out.println("2. Eliminar producto");
            System.out.println("3. Imprimir inventario");
            System.out.println("4. Buscar producto por nombre");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir la línea en blanco

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre del producto a agregar: ");
                    String producto = scanner.nextLine();
                    System.out.print("Ingrese el sector del producto: ");
                    String sector = scanner.nextLine();
                    almacen.agregarProducto(producto, sector);
                    break;
                case 2:
                    System.out.print("Ingrese el nombre del producto a eliminar: ");
                    producto = scanner.nextLine();
                    almacen.quitarProducto(producto);
                    break;
                case 3:
                    almacen.imprimirInventario();
                    break;
                case 4:
                    System.out.print("Ingrese el nombre del producto a buscar: ");
                    producto = scanner.nextLine();
                    String sectorEncontrado = almacen.buscarProducto(producto);
                    System.out.println("El producto se encuentra en el sector: " + sectorEncontrado);
                    break;
                case 5:
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 5);
    }
}



package com.mycompany.almacen;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Almacen1 {
    private List<String> inventario;

    public Almacen1() {
        inventario = new ArrayList<>();
    }

    public void agregarProducto(String producto) {
        inventario.add(producto);
        System.out.println("Producto agregado al almacén: " + producto);
    }

    public void quitarProducto(String producto) {
        if (inventario.contains(producto)) {
            inventario.remove(producto);
            System.out.println("Producto eliminado del almacén: " + producto);
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
                System.out.println(producto);
            }
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
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir la línea en blanco
            
            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre del producto a agregar: ");
                    String producto = scanner.nextLine();
                    almacen.agregarProducto(producto);
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
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 4);
    }
}

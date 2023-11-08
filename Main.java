/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.map;

/**
 *
 * @author RODRIGO
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Usuario: ");
        String usuario = scanner.nextLine();
        System.out.print("Clave: ");
        String clave = scanner.nextLine();

        if (!Login.autenticar(usuario, clave)) {
        } else {
            System.out.println("Inicio de sesión exitoso.");

            System.out.println("Selecciona un almacén:");
            System.out.println("1. Almacen 1");
            System.out.println("2. Almacen 2");

            int opcion = scanner.nextInt();
            
            if (opcion == 1) {
                Almacen1 almacen1 = new Almacen1();
                
                // Métodos para Almacen 1
                System.out.println("Seleccionaste el Almacen 1.");
                System.out.println("1. Añadir producto");
                System.out.println("2. Eliminar producto");
                System.out.println("3. Buscar producto");
                
                int operacion = scanner.nextInt();
                scanner.nextLine();  // Consumir la nueva línea
                
                if (operacion == 1) {
                    System.out.print("Nombre del producto: ");
                    String producto = scanner.nextLine();
                    System.out.print("Cantidad: ");
                    int cantidad = scanner.nextInt();
                    almacen1.add(producto, cantidad);
                } else if (operacion == 2) {
                    System.out.print("Nombre del producto a eliminar: ");
                    String producto = scanner.nextLine();
                    almacen1.delete(producto);
                } else if (operacion == 3) {
                    System.out.print("Nombre del producto a buscar: ");
                    String producto = scanner.nextLine();
                    int cantidad = almacen1.search(producto);
                    System.out.println("Cantidad de " + producto + ": " + cantidad);
                } else {
                    System.out.println("Operación no válida.");
                }
            } else if (opcion == 2) {
                Almacen2 almacen2 = new Almacen2();
                
                // Métodos para Almacen 2
                System.out.println("Seleccionaste el Almacen 2.");
                System.out.println("1. Añadir producto");
                System.out.println("2. Eliminar producto");
                System.out.println("3. Buscar producto");
                
                int operacion = scanner.nextInt();
                scanner.nextLine();  // Consumir la nueva línea
                
                if (operacion == 1) {
                    System.out.print("Nombre del producto: ");
                    String producto = scanner.nextLine();
                    System.out.print("Cantidad: ");
                    int cantidad = scanner.nextInt();
                    almacen2.add(producto, cantidad);
                } else if (operacion == 2) {
                    System.out.print("Nombre del producto a eliminar: ");
                    String producto = scanner.nextLine();
                    almacen2.delete(producto);
                } else if (operacion == 3) {
                    System.out.print("Nombre del producto a buscar: ");
                    String producto = scanner.nextLine();
                    int cantidad = almacen2.search(producto);
                    System.out.println("Cantidad de " + producto + ": " + cantidad);
                } else {
                    System.out.println("Operación no válida.");
                }
            } else {
                System.out.println("Opción no válida.");
            }       }
    }
}

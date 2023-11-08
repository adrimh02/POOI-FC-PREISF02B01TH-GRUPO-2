/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.map;


public class Login {
    private static final String USUARIO = "Rodrigo";
    private static final String CLAVE = "24112005r";

    public static boolean autenticar(String usuario, String clave) {
        return USUARIO.equals(usuario) && CLAVE.equals(clave);
    }
}

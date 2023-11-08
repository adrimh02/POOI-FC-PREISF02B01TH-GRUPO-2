/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.map;

/**
 *
 * @author RODRIGO
 */

/**
 *
 * @author sop123
 */
public class Login {
    private static final String USUARIO = "TripleRmiPapi";
    private static final String CLAVE = "RodrigoCabro";

    public static boolean autenticar(String usuario, String clave) {
        return USUARIO.equals(usuario) && CLAVE.equals(clave);
    }
}

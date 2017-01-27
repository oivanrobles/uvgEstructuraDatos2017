/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listas;

import java.io.Console;

/**
 *
 * @author OscarIvan
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lista L = new Lista();
        L.AgregarNodo(5);
        L.AgregarNodo(6);
        L.AgregarNodo(7);
        
        System.out.println(L.ToString());
        
        // TODO code application logic here
    }
    
}

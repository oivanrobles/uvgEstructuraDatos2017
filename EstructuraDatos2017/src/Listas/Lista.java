/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listas;

import java.util.HashSet;
import java.util.Set;
import java.lang.Object;
/**
 *
 * @author OscarIvan
 */
public class Lista {
    
    Nodo Cabeza; 
    
    public void AgregarNodo(int valor)
    {
        if (Cabeza == null)
            Cabeza = new Nodo (valor);
        else
        {
            Nodo NodoActual = new Nodo(valor);
            NodoActual.setSiguiente(Cabeza);
            Cabeza = NodoActual;                       
        }
    
    }
    public Nodo EliminarNodo()
    {
        Nodo NodoADevolver = Cabeza; 
        Cabeza = Cabeza.getSiguiente();
        return NodoADevolver;
    
    }
    public String ToString()
    {
        StringBuilder sb = new StringBuilder();
        if (Cabeza != null)
        {
            Nodo NodoActual = Cabeza;
            while (NodoActual!= null)
            {
                sb.append(NodoActual.getValor());
                sb.append ("--");
                NodoActual = NodoActual.getSiguiente();
            }
            
        }
        sb.append("null");
        return sb.toString();

    }
    
    
}

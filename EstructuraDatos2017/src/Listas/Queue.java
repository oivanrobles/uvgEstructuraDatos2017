/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listas;

/**
 *
 * @author OscarIvan
 */
public class Queue<W extends Comparable> {
    protected Lista<W> lista;

    public Queue()
    {
        lista = new <W>Lista();
    }
    public void Enqueue(W valor)
    {
        lista.AgregarNodo(valor);
    }
    
    public Nodo Dequeue()
    {
        return lista.EliminarNodo();
    }
    
    public String toString()
    {
        return lista.toString();
    }
    
    
}

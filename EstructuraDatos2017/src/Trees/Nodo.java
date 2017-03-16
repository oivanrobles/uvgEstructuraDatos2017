/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trees;

/**
 *
 * @author OscarIvan
 */
public class Nodo<T extends Comparable> implements Comparable{
    private T Valor;
    private Nodo Izquierdo;
    private Nodo Derecho;
    
    public Nodo(T valor)
    {
        Valor = valor;        
    }
    
    public void setIzquierdo(Nodo izquierdo)
    {
        Izquierdo = izquierdo;
    }
    public void setDerecho(Nodo derecho)
    {
        Derecho = derecho;
    }
    public Nodo getIzquierdo()
    {
        return Izquierdo;
    }
    public Nodo getDerecho()
    {
        return Derecho;
    }
    
    public T getValor()
    {
        return Valor;
    }

    @Override
    public int compareTo(Object t) {
        return Valor.compareTo(t);
    }
    
    public String toString()
    {
        return Valor.toString();
    }
    
}

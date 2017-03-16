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
public class BST<U extends Comparable> {
    Nodo Root;
    
    public void Insert(U valor)
    {
        if (Root == null)
            Root = new Nodo(valor);
        else
        {
            Nodo  NodoActual= Root;
            while(NodoActual != null)
            {
                //el Nodo es menor que el Nodo Actual va del lado izquierdo
                if (NodoActual.compareTo(valor) > 0)     
                {
                    if (NodoActual.getIzquierdo()== null)
                    {
                        NodoActual.setIzquierdo(new Nodo(valor));
                        return;
                    }
                    else                        
                        NodoActual = NodoActual.getIzquierdo();
                }
                else //si el nodo es mayor, va de hijo del lado derecho
                {
                    if (NodoActual.getDerecho()== null)
                    {
                        NodoActual.setDerecho(new Nodo(valor));
                        return;
                    }
                    else
                        NodoActual= NodoActual.getDerecho();
                }
            }
        }
    }
    
    protected void InsertarHijo(Nodo padre, U hijo)
    {
        
        if (padre == null)
        {
            Nodo<U> NuevoNodo = new Nodo<>(hijo);
            padre = NuevoNodo;
        }
        else
        {           
            if (padre.compareTo(hijo)< 0)            
                InsertarHijo(padre.getIzquierdo(), hijo);
            else
                InsertarHijo(padre.getDerecho(), hijo);
        }
    }
    
    public String ImprimirPreOrden()
    {
        return preOrder(Root);
    }
    private String preOrder(Nodo Padre)
    {   
        StringBuilder sb = new StringBuilder();
        if (Padre == null)
            return "";
        
        sb.append(Padre.toString());
        if (Padre.getIzquierdo() != null)
        {
            sb.append(",");
            sb.append(preOrder(Padre.getIzquierdo()));
        }
        if (Padre.getDerecho()!= null)
        {
            sb.append(",");
            sb.append(preOrder(Padre.getDerecho()));
        }        
        
        return sb.toString();
    }
}

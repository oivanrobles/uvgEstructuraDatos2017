/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listas;

/**
 * @author OscarIvan
 */
public class Lista<U extends Comparable> implements Comparable {

    protected Nodo<U> Cabeza;

    public void AgregarNodoCabeza(U valor) {
        Nodo<U> NuevoNodo = new <U>Nodo(valor);
        NuevoNodo.setSiguiente(Cabeza);
        Cabeza = NuevoNodo;
    }

    public void AgregarNodo(U valor) {
        Nodo Cola = ObtenerUltimo();
        //si no existe ningun nodo, crea la cabeza, de lo contrario agrega el nuevo Nodo al siguiente de la cola
        if (Cola == null) {
            Cabeza = new Nodo(valor);
        } else {
            Cola.setSiguiente(new Nodo(valor));
        }
    }

    public Nodo ObtenerCabeza() {
        return Cabeza;
    }

    public Nodo ObtenerUltimo() {
        Nodo NodoActual = Cabeza;
        if (NodoActual == null) {
            return null;
        }
        while (NodoActual.getSiguiente() != null) {
            NodoActual = NodoActual.getSiguiente();
        }
        return NodoActual;

    }

    public Nodo EliminarNodo() {
        Nodo NodoADevolver = Cabeza;
        Cabeza = Cabeza.getSiguiente();
        return NodoADevolver;

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (Cabeza != null) {
            Nodo NodoActual = Cabeza;
            while (NodoActual != null) {
                sb.append(NodoActual.getValor());
                sb.append("->");
                NodoActual = NodoActual.getSiguiente();
            }

        }
        sb.append("null");
        return sb.toString();

    }

    @Override
    public int compareTo(Object t) {
        throw new UnsupportedOperationException(
                "Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    // Pieza de código cortesía de NoTengoBattery
    public void bubbleSort() {
        boolean l_wasChanged = true;
        // l_wasChanged es True durante el cuerpo de este while, después de las condiciones iniciales
        // si la lista ha sido modificada. Se sabe que la lista se modifica solo si no está ordenada
        while (l_wasChanged) {
            // 4 condiciones iniciales del estado conocido
            l_wasChanged = false;
            Nodo l_anterior = null;
            Nodo l_actual = Cabeza;
            Nodo l_siguiente = l_actual.getSiguiente();
            // Este While recorre toda la lista
            while (l_siguiente != null) {
                final int l_result = l_actual.compareTo(l_siguiente.getValor());
                if (l_result >= 1) {
                    final Nodo l_tercero = l_siguiente.getSiguiente();
                    // El primer nodo apunta al tercer nodo
                    l_actual.setSiguiente(l_tercero);
                    // El segundo nodo apunta al primer nodo
                    l_siguiente.setSiguiente(l_actual);
                    // El nodo anterior apunta al nodo siguiente si no es null
                    if (l_anterior != null) {
                        l_anterior.setSiguiente(l_siguiente);
                    }
                    // Indica que la lista ha cambiado
                    l_wasChanged = true;
                    // Cambia la cabeza si el nodo ordenado es la cabeza
                    Cabeza = ((l_actual == Cabeza) ? l_siguiente : Cabeza);
                    // "Actual" y "siguiente" están en orden inverso, actual es mayor
                    final Nodo l_intercambio = l_actual;
                    // Intercambia el actual con el siguiente (solamente los punteros)
                    l_actual = l_siguiente;
                    l_siguiente = l_intercambio;
                }// else:  No se mueven los nodos, ni los punteros
                // Estas tres asignaciones mueven los punteros a los 3 nodos siguientes
                l_anterior = l_actual;
                l_actual = l_anterior.getSiguiente();
                l_siguiente = l_actual.getSiguiente();
            }
        }
    }

}

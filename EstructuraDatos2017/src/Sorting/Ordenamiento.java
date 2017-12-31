package Sorting;

import java.util.Objects;

import Listas.Lista;
import Listas.Nodo;

/**
 * Esta clase contiene métodos de ordenamieto para listas (y sus herederos) que utilice
 * {@link Nodo} como clase base, o sus herederos.
 */
public enum Ordenamiento {
    ;

    /**
     * Ordena una {@link Lista} que contenga {@link Nodo}s de tipo {@link Comparable} utilizando
     * el método de Bubble Sort.
     *
     * @param lista la lista a ordenar
     */
    public static void bubbleSort(final Lista lista) {
        boolean l_wasChanged = true;
        // l_wasChanged es True durante el cuerpo de este while, después de las condiciones iniciales
        // si la lista ha sido modificada. Se sabe que la lista se modifica solo si no está ordenada
        while (l_wasChanged) {
            // 4 condiciones iniciales del estado conocido
            l_wasChanged = false;
            Nodo l_actual = lista.ObtenerCabeza();
            Nodo l_siguiente = l_actual.getSiguiente();
            // Este While recorre toda la lista
            while (l_siguiente != null) {
                final int l_result = l_actual.compareTo(l_siguiente.getValor());
                if (l_result >= 1) {
                    // El valor menor es el del nodo siguiente
                    final Comparable l_menor = l_siguiente.getValor();
                    // El valor mayor es el del nodo actual
                    final Comparable l_mayor = l_actual.getValor();
                    // El primer nodo debe contener el menor
                    l_actual.setValor(l_menor);
                    // El siguiente, el mayor
                    l_siguiente.setValor(l_mayor);
                    // Indica que la lista ha cambiado
                    l_wasChanged = true;
                }// else:  No se mueven los nodos, ni los punteros
                l_actual = l_siguiente;
                l_siguiente = l_actual.getSiguiente();
            }
        }
    }

    /**
     * Ordena una {@link Lista} que contenga {@link Nodo}s de tipo {@link Comparable} utilizando
     * el método de Selection Sort.
     *
     * @param lista la lista a ordenar
     */
    public static void selectionSort(final Lista lista) {
        // Recorrer la lista de forma indeterminada (Sería mejor utilizar {@link Iterable}?)
        Nodo l_actual = lista.ObtenerCabeza();
        while (l_actual != null) {
            Nodo l_siguiente = l_actual;
            Nodo l_menor = l_actual;
            while (l_siguiente != null) {
                // Si el nodo siguiente es menor al nodo menor, entonces el siguiente es menor
                // caso contario, el menor sigue siendo el menor
                l_menor = (l_siguiente.compareTo(l_menor.getValor()) >= 1) ? l_menor : l_siguiente;
                l_siguiente = l_siguiente.getSiguiente();
            }
            final Comparable l_valorMenor = l_menor.getValor();
            final Comparable l_valorActual = l_actual.getValor();
            l_actual.setValor(l_valorMenor);
            l_menor.setValor(l_valorActual);
            l_actual = l_actual.getSiguiente();
        }
    }

    /**
     * Ordena una {@link Lista} que contenga {@link Nodo}s de tipo {@link Comparable} utilizando
     * el método de Insertion Sort.
     *
     * @param lista la lista a ordenar
     */
    public static void insertionSort(final Lista lista) {
        Nodo l_actual = lista.ObtenerCabeza().getSiguiente();
        Nodo l_cabeza = lista.ObtenerCabeza();
        while (l_actual != null) {
            Nodo l_temporal = l_cabeza;
            // Buscar en la sublista ordenada el nodo donde insertar
            while (l_temporal != null && !Objects.equals(l_temporal, l_actual)) {
                // Si el nodo a insertar es mayor, este es la posición a insertar
                if (l_actual.compareTo(l_temporal.getValor()) <= 0) {
                    break;
                }
                l_temporal = l_temporal.getSiguiente();
            }

            if (l_temporal != null) {
                // Mover los valores 1 posición hasta el valor temporal
                Nodo l_tmpSiguiente = l_temporal.getSiguiente();
                Comparable l_valorTmpAnterior = l_temporal.getValor();
                while (l_tmpSiguiente != null) {
                    Comparable l_valorTmpSiguiente = l_tmpSiguiente.getValor();
                    l_tmpSiguiente.setValor(l_valorTmpAnterior);
                    l_tmpSiguiente = l_tmpSiguiente.getSiguiente();
                    l_valorTmpAnterior = l_valorTmpSiguiente;
                }
                l_actual.setValor(l_temporal.getValor());
            }
            // Esto es equivalente a aumentar el contador
            l_actual = l_actual.getSiguiente();
        }
    }

    /**
     *
     */
}

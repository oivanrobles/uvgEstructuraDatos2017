package com.gmail.notengobattery.postfix;

import org.jetbrains.annotations.Nullable;

/**
 * Elemento básico de una lista.
 */
public class Nodo<T> {
    private T m_elemento;
    private Nodo<T> m_siguiente;

    /**
     * Crea un nuevo Nodo
     *
     * @param elemento
     */
    public Nodo(@Nullable final T elemento) {
        m_elemento = elemento;
    }

    /**
     * Obtiene el valor del elemento
     *
     * @return el valor del elemento
     */
    @Nullable
    public T getElemento() {
        return m_elemento;
    }

    /**
     * Cambia el valor del elemento
     *
     * @param elemento el nuevo valor de elemento
     */
    public void setElemento(@Nullable final T elemento) {
        m_elemento = elemento;
    }

    /**
     * Devuelve el puntero al nodo siguiente
     *
     * @return el nodo siguiente
     */
    @Nullable
    public Nodo<T> getSiguiente() {
        return m_siguiente;
    }

    /**
     * Cambia el puntero al nodo siguiente
     *
     * @param siguiente el nuevo puntero
     */
    public void setSiguiente(@Nullable final Nodo<T> siguiente) {
        m_siguiente = siguiente;
    }
}

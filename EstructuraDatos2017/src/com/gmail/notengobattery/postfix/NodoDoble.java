package com.gmail.notengobattery.postfix;

import org.jetbrains.annotations.Nullable;

/**
 * Esta clase es un {@link Nodo} circular que es el elemento básico de la {@link ListaDoble}.
 */
public class NodoDoble<T> extends Nodo<T> {
    private NodoDoble<T> m_anterior;

    /**
     * Crea un nuevo Nodo
     *
     * @param elemento el nuevo elemento
     */
    public NodoDoble(final T elemento) {
        super(elemento);
    }

    /**
     * Devuelve un puntero al nodo anterior
     *
     * @return el nodo anterior
     */
    public NodoDoble<T> getAnterior() {
        return m_anterior;
    }

    /**
     * @param anterior
     */
    public void setAnterior(@Nullable final NodoDoble<T> anterior) {
        m_anterior = anterior;
    }
}

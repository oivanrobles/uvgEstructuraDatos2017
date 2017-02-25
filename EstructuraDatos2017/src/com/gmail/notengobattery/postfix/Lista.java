package com.gmail.notengobattery.postfix;

import org.jetbrains.annotations.Nullable;

/**
 * Implementación mínima de una lista
 */
public class Lista<T> implements Consumible<T> {
    @Nullable
    private Nodo<T> m_cabeza;
    // Llevar un puntero al último nodo aumenta el rendimiento y reduce el código
    @Nullable
    private Nodo<T> m_ultimo;

    @Nullable
    @Override
    public T quitarValorInicio() {
        T l_valor = null;
        if (m_cabeza != null) {
            l_valor = m_cabeza.getElemento();
        }
        m_cabeza = (m_cabeza != null) ? m_cabeza.getSiguiente() : null;
        return l_valor;
    }

    @Nullable
    @Override
    public T quitarValorFinal() {
        Nodo<T> l_anterior = m_cabeza;
        Nodo<T> l_actual = m_cabeza;
        Nodo<T> l_siguiente = m_cabeza;
        while (l_siguiente != null) {
            l_anterior = l_actual;
            l_actual = l_siguiente;
            l_siguiente = l_siguiente.getSiguiente();
        }
        if (l_anterior != null) {
            l_anterior.setSiguiente(null);
        }
        m_ultimo = l_actual;
        if (m_ultimo == m_cabeza) {
            m_ultimo = null;
            m_cabeza = null;
        }
        if (l_actual != null) {
            return l_actual.getElemento();
        }
        return null;
    }

    @Override
    public void ponerValorInicio(final T valor) {
        final Nodo<T> l_temp = new Nodo(valor);
        if ((m_ultimo == null) || (m_cabeza == null)) {
            m_ultimo = l_temp;
        } else {
            l_temp.setSiguiente(m_cabeza);
        }
        m_cabeza = l_temp;
    }

    @Override
    public void ponerValorFinal(final T valor) {
        final Nodo<T> l_temp = new Nodo(valor);
        if ((m_ultimo == null) || (m_cabeza == null)) {
            m_cabeza = l_temp;
        } else {
            m_ultimo.setSiguiente(l_temp);
        }
        m_ultimo = l_temp;
    }

    @Override
    public String toString() {
        Nodo<T> l_temp = m_cabeza;
        final StringBuilder l_sb = new StringBuilder(10);
        while (l_temp != null) {
            l_sb.append(l_temp.getElemento());
            l_sb.append("->");
            l_temp = l_temp.getSiguiente();
        }
        l_sb.append("null");
        return l_sb.toString();
    }
}

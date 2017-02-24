package com.gmail.notengobattery.postfix;

import org.jetbrains.annotations.Nullable;

/**
 * Implementación mínima de una lista doble
 */
public class ListaDoble<T> implements Consumible<T> {
    @Nullable
    private NodoDoble<T> m_cabeza;
    // Llevar un puntero al último nodo aumenta el rendimiento y reduce el código
    @Nullable
    private NodoDoble<T> m_ultimo;

    @Nullable
    @Override
    public T quitarValorInicio() {
        final T l_valor = (m_cabeza != null) ? m_cabeza.getElemento() : null;
        if (m_cabeza != null) {
            m_cabeza = (NodoDoble<T>) m_cabeza.getSiguiente();
        }
        if (m_cabeza != null) {
            m_cabeza.setAnterior(null);
        }
        return l_valor;
    }

    @Nullable
    @Override
    public T quitarValorFinal() {
        final T l_valor = (m_ultimo != null) ? m_ultimo.getElemento() : null;
        if (m_ultimo != null) {
            m_ultimo = m_ultimo.getAnterior();
        }
        if (m_ultimo != null) {
            m_ultimo.setSiguiente(null);
        }
        return l_valor;
    }

    @Override
    public void ponerValorInicio(final T valor) {
        final NodoDoble<T> l_temp = new NodoDoble<T>(valor);
        if ((m_ultimo == null) || (m_cabeza == null)) {
            m_ultimo = l_temp;
        } else {
            l_temp.setSiguiente(m_cabeza);
            m_cabeza.setAnterior(l_temp);
            l_temp.setAnterior(null);
        }
        m_cabeza = l_temp;
    }

    @Override
    public void ponerValorFinal(final T valor) {
        final NodoDoble<T> l_temp = new NodoDoble<T>(valor);
        if ((m_ultimo == null) || (m_cabeza == null)) {
            m_cabeza = l_temp;
        } else {
            l_temp.setSiguiente(null);
            m_ultimo.setSiguiente(l_temp);
            l_temp.setAnterior(m_ultimo);
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

package com.gmail.notengobattery.postfix;

import org.jetbrains.annotations.Nullable;

/**
 * Implementación mínima de una lista
 */
public class ListaCircular<T> implements Consumible<T> {
    @Nullable
    private NodoDoble<T> m_cabeza;

    @Nullable
    @Override
    public T quitarValorInicio() {
        final T l_valor = (m_cabeza != null) ? m_cabeza.getElemento() : null;
        final NodoDoble<T> l_cabeza = m_cabeza;
        final NodoDoble<T> l_anterior = (l_cabeza != null) ? l_cabeza.getAnterior() : m_cabeza;
        if ((l_cabeza != null) && (l_anterior != null)) {
            m_cabeza = (m_cabeza == l_anterior) ? null : (NodoDoble<T>) m_cabeza.getSiguiente();
            l_anterior.setSiguiente(m_cabeza);
        }
        if ((l_cabeza != null) && (m_cabeza != null)) {
            m_cabeza.setAnterior(l_cabeza.getAnterior());
        }
        if (l_anterior == null) {
            m_cabeza = null;
        }
        return l_valor;
    }

    @Nullable
    @Override
    public T quitarValorFinal() {
        NodoDoble<T> l_nodoFinal = (m_cabeza != null) ? m_cabeza.getAnterior() : null;
        final T l_valor;
        if (m_cabeza != null) {
            l_valor = (l_nodoFinal != null) ? l_nodoFinal.getElemento() : m_cabeza.getElemento();
            final NodoDoble<T> l_anterior =
                    (l_nodoFinal != null) ? l_nodoFinal.getAnterior() : m_cabeza;
            NodoDoble<T> l_tmp;
            l_tmp = (m_cabeza.getAnterior() == m_cabeza) ? null : m_cabeza;
            if (l_anterior != null) {
                l_anterior.setSiguiente(m_cabeza);
                m_cabeza.setAnterior(l_anterior);
            }
            m_cabeza = l_tmp;
            return l_valor;
        }
        return null;
    }

    @Override
    public void ponerValorInicio(final T valor) {
        final NodoDoble<T> l_temp = new NodoDoble<T>(valor);
        if ((m_cabeza != null) && (m_cabeza.getAnterior() != null)) {
            l_temp.setSiguiente(m_cabeza);
            m_cabeza.getAnterior().setSiguiente(l_temp);
            l_temp.setAnterior(m_cabeza.getAnterior());
            m_cabeza.setAnterior(l_temp);
        }
        m_cabeza = l_temp;
    }

    @Override
    public void ponerValorFinal(final T valor) {
        final NodoDoble<T> l_temp = new NodoDoble<T>(valor);
        if ((m_cabeza != null)) {
            if (m_cabeza.getAnterior() != null) {
                l_temp.setSiguiente(m_cabeza);
                m_cabeza.getAnterior().setSiguiente(l_temp);
                l_temp.setAnterior(m_cabeza.getAnterior());
                m_cabeza.setAnterior(l_temp);
            } else {
                l_temp.setSiguiente(m_cabeza);
                m_cabeza.setSiguiente(l_temp);
                l_temp.setAnterior(m_cabeza);
                m_cabeza.setAnterior(l_temp);
            }
        } else {
            m_cabeza = l_temp;
            m_cabeza.setAnterior(m_cabeza);
            m_cabeza.setSiguiente(m_cabeza);
        }
    }

    @Override
    public String toString() {
        @Nullable Nodo<T> l_temp = m_cabeza;
        final StringBuilder l_sb = new StringBuilder(10);
        // La condición NO puede ser buscar el null
        //while (l_temp != null) {
        while (l_temp != null) {
            l_sb.append(l_temp.getElemento());
            l_sb.append("->");
            l_temp = l_temp.getSiguiente();
            if (l_temp == m_cabeza) {
                l_temp = null;
            }
        }
        l_sb.append("null");
        return l_sb.toString();
    }
}
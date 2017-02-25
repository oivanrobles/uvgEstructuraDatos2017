package com.gmail.notengobattery.postfix;

import java.util.ArrayList;
import java.util.List;

/**
 * Esta clase implementa un {@code wrapper} para el {@link ArrayList}
 */
public class ArrayList2<T> implements Consumible<T> {
    private final List<T> m_arrayList;

    /**
     * Crea un nuevo {@code wrapper} para el {@link ArrayList}
     *
     * @param capacidad la capacidad inicial del {@link ArrayList}
     */
    public ArrayList2(final int capacidad) {
        m_arrayList = new ArrayList<>(capacidad);
    }

    @Override
    public T quitarValorInicio() {
        if (m_arrayList.isEmpty()) {
            return null;
        }
        final T l_elemento = m_arrayList.get(0);
        m_arrayList.remove(0);
        return l_elemento;
    }

    @Override
    public T quitarValorFinal() {
        if (m_arrayList.isEmpty()) {
            return null;
        }
        final T l_elemento = m_arrayList.get(m_arrayList.size() - 1);
        m_arrayList.remove(m_arrayList.size() - 1);
        return l_elemento;
    }

    @Override
    public void ponerValorInicio(final T valor) {
        m_arrayList.add(0, valor);
    }

    @Override
    public void ponerValorFinal(final T valor) {
        m_arrayList.add(valor);
    }

    @Override
    public String toString() {
        return "ArrayList2{" + "m_arrayList=" + m_arrayList + '}';
    }
}

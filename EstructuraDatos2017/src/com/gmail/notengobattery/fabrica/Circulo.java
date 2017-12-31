package com.gmail.notengobattery.fabrica;

/**
 * Representa una figura geométrica de círculo
 */
public class Circulo implements Figura {
    private final double m_radio;

    Circulo(final double radio) {
        m_radio = Math.abs(radio);
    }

    @Override
    public String dibujar() {
        return "Círculo de radio " + m_radio;
    }

    @Override
    public double getArea() {
        return 2 * Math.PI * Math.pow(m_radio, 2);
    }

    @Override
    public double getPerimetro() {
        return Math.PI * m_radio;
    }

    @Override
    public double getLados() {
        return 0;
    }
}

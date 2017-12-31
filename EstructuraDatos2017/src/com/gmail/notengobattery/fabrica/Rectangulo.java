package com.gmail.notengobattery.fabrica;

/**
 * Una figura geométrica que implementa un rectángulo
 */
public class Rectangulo implements Figura {
    private final double m_lado;
    private final double m_lado2;

    Rectangulo(final double lado, final double lado2) {
        m_lado = Math.abs(lado);
        m_lado2 = Math.abs(lado2);
    }

    @Override
    public String dibujar() {
        return "Rectangulo de lados (" + m_lado + ", " + m_lado2 + ')';
    }

    @Override
    public double getArea() {
        return m_lado2 * m_lado;
    }

    @Override
    public double getPerimetro() {
        return (2 * m_lado) + (2 * m_lado2);
    }

    @Override
    public double getLados() {
        return 4;
    }
}

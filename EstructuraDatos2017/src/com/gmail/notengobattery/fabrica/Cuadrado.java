package com.gmail.notengobattery.fabrica;

/**
 * Implementa una figura geométrica de tipo cuadrado
 */
public class Cuadrado implements Figura {
    private final double m_lado;

    Cuadrado(final double lado) {
        m_lado = Math.abs(lado);
    }

    @Override
    public String dibujar() {
        return "Cuadrado de lado " + m_lado;
    }

    @Override
    public double getArea() {
        return Math.pow(m_lado, 2);
    }

    @Override
    public double getPerimetro() {
        return 4 * m_lado;
    }

    @Override
    public double getLados() {
        return 4;
    }
}

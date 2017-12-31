package com.gmail.notengobattery.fabrica;

import java.io.PrintStream;

/**
 * Demostración del funcionamiento del patrón de fábrica
 */
public final class DemoPatronFabrica {
    // Demostración de la fábrica

    public static void main(String... args) {
        PrintStream l_out = System.out;
        l_out.println("Fabricando un círculo...");
        final Figura l_circulo = FigurasFabrica.getFigura(0, 1.0);
        l_out.println(l_circulo.dibujar());

        l_out.println("Fabricando un cuadrado...");
        final Figura l_cuadrado = FigurasFabrica.getFigura(4, 3.1);
        l_out.println(l_cuadrado.dibujar());

        l_out.println("Fabricando un rectángulo...");
        final Figura l_rectangulo = FigurasFabrica.getFigura(-4, 2.0, 4.0);
        l_out.println(l_rectangulo.dibujar());
    }
}

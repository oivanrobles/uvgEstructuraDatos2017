package com.gmail.notengobattery.postfix;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

/**
 * Una nueva clase que representa una calculadora POSTFIX.
 */
public final class CalculadoraPostfix {
    private static CalculadoraPostfix s_instancia;
    private int m_tipo = 0;

    // Constructor privado para evitar la instanciación
    private CalculadoraPostfix() {
    }

    /**
     * @return devuelve la instancia del singletón de esta clase
     */
    public static CalculadoraPostfix getInstancia(int tipo) {
        s_instancia = (s_instancia == null) ? new CalculadoraPostfix() : s_instancia;
        return s_instancia;
    }

    /**
     * Utiliza un {@link InputStream} como fuente de las operaciones a realizar. Esto significa
     * que puede funcionar para cualquier heredero de dicha clase como {@link java.io.File} o
     * {@code System.in}. Las operaciones soportadas son:
     * <ul>
     * <li>*: multiplicación</li>
     * <li>/: división</li>
     * <li>%: módulo</li>
     * <li>-: resta</li>
     * <li>+: suma</li>
     * <li>&lt&lt: desplazamiento lógico (entero) a la izquierda</li>
     * <li>&gt&gt: desplazamiento lógico (entero) a la derecha</li>
     * <li>**: exponenciación</li>
     * <li>//: raidical (del valor absoluto)</li>
     * </ul>
     * Las constantes predeterminadas son:
     * <ul>
     * <li>pi: el número <i>pi</i></li>
     * <li>e: el número base del logaritmo natural</li>
     * </ul>
     * La secuencia de escape es {@code EOF} (desde el teclado, ^D), o bien la palabra <b>FIN</b>
     * en mayúsculas.
     *
     * @param io la entrada de datos para la calculadora
     *
     * @return un arreglo que contiene todos los valores calculados hasta el EOF
     */
    public List<Double> calcular(final InputStream io) throws OperadorIlegalException {
        final List<Double> l_resultados = new ArrayList<>(10);
        // Realiza los cálculos línea por línea desde el Stream
        try (Scanner l_sc = new Scanner(io)) {
            // Vamos a construir 2 pilas, una para los números recolectados
            final IPila<Double> l_numeros = new PilaFabricada<>(false, m_tipo);
            // Otro para los operadores recolectados
            final IPila<String> l_operadores = new PilaFabricada<>(false, m_tipo);
            boolean l_quedarse = true;
            while (l_quedarse) {
                l_quedarse = l_sc.hasNextLine();
                final String l_next = l_sc.nextLine();
                final String[] l_iterable = l_next.split(" ");
                // Separa los números y los operadores
                for (String l_s : l_iterable) {
                    try {
                        switch (l_s) {
                            case "e":
                                l_s = String.valueOf(Math.E);
                                break;
                            case "pi":
                                l_s = String.valueOf(Math.PI);
                                break;
                        }
                        l_numeros.producir(Double.parseDouble(l_s));
                    } catch (final NumberFormatException l_e) {
                        if (Objects.equals("FIN", l_s)) {
                            l_quedarse = false;
                        } else {
                            l_operadores.producir(l_s);
                        }
                    }
                }
                // Realiza el cálculo y lo agrega al array
                l_resultados.add(operar(l_numeros, l_operadores));
            }
        }
        return l_resultados;
    }

    private static double operar(final IPila<Double> numeros, final IPila<String> operadores)
            throws OperadorIlegalException {
        // Sacar el operador de la pila y determinar la operación
        String l_operador = operadores.consumir();
        while (l_operador != null) {
            final Double l_arg1 = numeros.consumir();
            final Double l_arg2 = numeros.consumir();
            if ((l_arg1 == null) || (l_arg2 == null)) {
                throw new ArgumentosInvalidosException(l_arg1, l_arg2, l_operador);
            }
            switch (l_operador) {
                // Realiza la operación, y agrega a la pila el resultado
                case "*":
                    numeros.producir(l_arg1 * l_arg2);
                    break;
                case "/":
                    numeros.producir(l_arg1 / l_arg2);
                    break;
                case "%":
                    numeros.producir(l_arg1 % l_arg2);
                    break;
                case "-":
                    numeros.producir(l_arg1 - l_arg2);
                    break;
                case "+":
                    numeros.producir(l_arg1 + l_arg2);
                    break;
                case "<<":
                    numeros.producir((double) (Math.round(l_arg1) << Math.round(l_arg2)));
                    break;
                case ">>":
                    numeros.producir((double) (Math.round(l_arg1) >> Math.round(l_arg2)));
                    break;
                case "**":
                    numeros.producir(StrictMath.pow(l_arg1, l_arg2));
                    break;
                case "//":
                    numeros.producir(StrictMath.pow(Math.abs(l_arg2), 1.0 / l_arg2));
                    break;
                default:
                    throw new OperadorIlegalException(l_operador);
            }
            l_operador = operadores.consumir();
        }
        final Double l_resultado = numeros.consumir();
        final Double l_comprobado = numeros.consumir();
        if (l_comprobado != null) {
            throw new ArgumentosInvalidosException(l_resultado, l_comprobado, ",");
        }
        return l_resultado;
    }

    /**
     * El tipo del {@link Consumible} a utilizar.
     *
     * @param tipo el tipo de consumible a utilizar
     */
    public void setTipo(final int tipo) {
        m_tipo = tipo;
    }
}

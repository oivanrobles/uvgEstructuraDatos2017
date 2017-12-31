package com.gmail.notengobattery.postfix;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.List;
import java.util.Scanner;

/**
 * Programa principal e interfaz de usuario
 */
public final class Principal {
    public static void main(String[] args) throws OperadorIlegalException {
        // Abrir el archivo (hardcoded a lo #YOLO)
        final InputStream l_datos;
        try {
            l_datos = new FileInputStream(new File("datos.txt"));
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado.");
            System.out.println("PWD: " + new File(".").getAbsoluteFile());
            e.printStackTrace();
            return;
        }
        // Scanner
        final int l_consumible = makeMenu();
        // Hacer una calculadora posfix con una pila FIFO es súper trivial
        final CalculadoraPostfix l_calculadora = CalculadoraPostfix.getInstancia(l_consumible);
        System.out.println("Leyendo la expresión POSFIX...");
        // Comenzar el cálculo
        final List<Double> l_calculo = l_calculadora.calcular(l_datos);
        System.out.println("Resultados: " + l_calculo);
    }

    private static int makeMenu() {
        int l_tmp = 0;
        while ((l_tmp <= 0) || (l_tmp > 5)) {
            Scanner l_sc = new Scanner(System.in);
            StringBuilder l_sb = new StringBuilder("Seleccione una estructura de datos\n");
            l_sb.append("1. Vector (");
            l_sb.append(Vector.class.getCanonicalName());
            l_sb.append(")\n");
            l_sb.append("2. ArrayList (");
            l_sb.append(ArrayList2.class.getCanonicalName());
            l_sb.append(")\n");
            l_sb.append("3. Lista Simple (");
            l_sb.append(Lista.class.getCanonicalName());
            l_sb.append(")\n");
            l_sb.append("4. Lista doblemente enlazada (");
            l_sb.append(ListaDoble.class.getCanonicalName());
            l_sb.append(")\n");
            l_sb.append("5. Lista circular (");
            l_sb.append(ListaCircular.class.getCanonicalName());
            l_sb.append(")\n");
            l_sb.append("Seleccione: ");
            System.out.print(l_sb);
            l_tmp = l_sc.nextInt();
        }
        switch (l_tmp) {
            case 1:
                return FabricaConsumibles.VECTOR;
            case 2:
                return FabricaConsumibles.ARRAYLIST;
            case 3:
                return FabricaConsumibles.LISTA_SIMPLE;
            case 4:
                return FabricaConsumibles.LISTA_DOBLE;
            case 5:
                return FabricaConsumibles.LISTA_CIRCULAR;
            default:
                return -1;
        }
    }
}

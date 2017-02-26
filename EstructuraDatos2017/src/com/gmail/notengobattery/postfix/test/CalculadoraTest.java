import com.gmail.notengobattery.postfix.ArgumentosInvalidosException;
import com.gmail.notengobattery.postfix.CalculadoraPostfix;
import com.gmail.notengobattery.postfix.FabricaConsumibles;
import com.gmail.notengobattery.postfix.OperadorIlegalException;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.List;


import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Pruebas unitarias para el funcionamiento de la calculadora
 */
public class CalculadoraTest {

    /**
     * Comprueba el correcto funcionamiento de la calculadora, en específico de las operaciones
     * de la calculadora. Esto es, comprueba que las operaciones se realizan correctamente en
     * condiciones ideales.
     */
    @SuppressWarnings({"HardcodedFileSeparator", "HardcodedLineSeparator"})
    @Test
    public void testCalculadoraOperaciones() {
        final String l_operaciones =
                "9 9 * \n" + "81 9 / \n" + "13 10 % \n" + "1 -9 - \n" + "-10 -11 + \n" +
                        "10 1 <<\n" + "100 2 >>\n" + "32 3 **\n" + "49 2 //\n" + "FIN";
        final Double[] l_esperado = {81.0, 9.0, 3.0, 10.0, -21.0, 20.0, 25.0, 32768.0, 7.0};
        final InputStream l_flujo =
                new ByteArrayInputStream(l_operaciones.getBytes(StandardCharsets.UTF_8));
        final CalculadoraPostfix l_calc =
                CalculadoraPostfix.getInstancia(FabricaConsumibles.ARRAYLIST);
        final List<Double> l_resultados = l_calc.calcular(l_flujo);
        for (int l_i = 0; l_i < l_resultados.size(); l_i++) {
            assertThat("Operación fallida.", l_resultados.get(l_i), is(equalTo(l_esperado[l_i])));
        }
    }

    /**
     * Comprueba el correcto funcionamiento de la calculadora, en específico la identificación y
     * procesamiento de las constantes.
     */
    @Test
    public void testCalculadoraConstantes() {
        final String l_operaciones = "e 5 ** \n" + "pi 6 * \n" + "FIN";
        final Double[] l_esperado = {StrictMath.pow(Math.E, 5.0), Math.PI * 6.0};
        final InputStream l_flujo =
                new ByteArrayInputStream(l_operaciones.getBytes(StandardCharsets.UTF_8));
        final CalculadoraPostfix l_calc =
                CalculadoraPostfix.getInstancia(FabricaConsumibles.ARRAYLIST);
        final List<Double> l_resultados = l_calc.calcular(l_flujo);
        for (int l_i = 0; l_i < l_resultados.size(); l_i++) {
            assertThat("Constante incorrecta.", l_resultados.get(l_i),
                    is(equalTo(l_esperado[l_i])));
        }
    }

    @Rule
    public ExpectedException generico = ExpectedException.none();

    /**
     * Comprueba el correcto funcionamiento de la calculadora, en específico, el fallo ante un
     * operador no reconocido.
     */
    @Test
    public void testCalculadoraOperadorIncorrecto() {
        final String l_operaciones = "12 15 ilegal " + "FIN";
        final InputStream l_flujo =
                new ByteArrayInputStream(l_operaciones.getBytes(StandardCharsets.UTF_8));
        final CalculadoraPostfix l_calc =
                CalculadoraPostfix.getInstancia(FabricaConsumibles.ARRAYLIST);
        generico.expect(OperadorIlegalException.class);
        l_calc.calcular(l_flujo);
    }

    /**
     * Comprueba el correcto funcionamiento de la calculadora, en específico, el fallo ante mu
     * pocos operandos
     */
    @Test
    public void testCalculadoraArgumentosInvalidosMas() {
        // Falta 1 o más operandos
        final String l_operaciones = "12 + " + "FIN";
        final InputStream l_flujo =
                new ByteArrayInputStream(l_operaciones.getBytes(StandardCharsets.UTF_8));
        final CalculadoraPostfix l_calc =
                CalculadoraPostfix.getInstancia(FabricaConsumibles.ARRAYLIST);
        generico.expect(ArgumentosInvalidosException.class);
        l_calc.calcular(l_flujo);
    }

    /**
     * Comprueba el correcto funcionamiento de la calculadora, en específico, el fallo ante
     * demasiados operandos
     */
    @Test
    public void testCalculadoraArgumentosInvalidosMenos() {
        // Falta 1 o más operandos
        final String l_operaciones = "12 14 1 + " + "FIN";
        final InputStream l_flujo =
                new ByteArrayInputStream(l_operaciones.getBytes(StandardCharsets.UTF_8));
        final CalculadoraPostfix l_calc =
                CalculadoraPostfix.getInstancia(FabricaConsumibles.ARRAYLIST);
        generico.expect(ArgumentosInvalidosException.class);
        l_calc.calcular(l_flujo);
    }
}

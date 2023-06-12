/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

/**
 *
 * @author Roge
 */

/**
 * Clase de prueba para la clase Rango.
 */
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.Assert.assertEquals;

public class RangoTest {
    @Test
    public void imprimirNumerosEnRango_impresionCorrecta() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        Rango.imprimirNumerosEnRango(1, 10);

        System.setOut(System.out);

        String salida = outputStream.toString().trim();

        String resultadoEsperado = "2\n4\n6\n8";
        assertEquals(resultadoEsperado, salida);
    }
}


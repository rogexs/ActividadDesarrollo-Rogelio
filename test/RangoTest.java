/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Roge
 */

/**
 * Clase de prueba para la clase Rango.
 */
public class RangoTest {
    /**
     * Prueba unitaria para el método imprimirNumerosEnRango.
     */
    @Test
    public void testImprimirNumerosEnRango() {
        Rango.imprimirNumerosEnRango(2, 6);
        // Esperamos que se imprima: 3, 4, 5

        Rango.imprimirNumerosEnRango(10, 20);
        // Esperamos que se imprima: 11, 12, 13, 14, 15, 16, 17, 18, 19

        Rango.imprimirNumerosEnRango(7, 7);
        // Esperamos que se imprima: No hay números en el rango especificado.
    }
}
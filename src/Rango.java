/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Roge
 */
import java.util.Scanner;

/**
 * Clase que imprime los números entre dos valores ingresados por el usuario.
 */
public class Rango {

    /**
     * Método principal que solicita dos números al usuario y llama al método
     * imprimirNumerosEnRango para imprimir los números en el rango.
     *
     * @param args Los argumentos de la línea de comandos (no se utilizan en
     * este programa).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer numero: ");
        int numero1 = scanner.nextInt();

        System.out.print("Ingrese el segundo numero: ");
        int numero2 = scanner.nextInt();

        scanner.close();

        imprimirNumerosEnRango(numero1, numero2);
    }

    /**
     * Imprime los números en el rango especificado (sin incluir los números de
     * entrada).
     *
     * @param inicio El primer número del rango (excluido).
     * @param fin El segundo número del rango (excluido).
     */
    public static void imprimirNumerosEnRango(int inicio, int fin) {
        if (inicio >= fin - 1) {
            System.out.println("No hay números en el rango especificado.");
            return;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = inicio + 1; i < fin; i++) {
            if (i % 2 == 0) {
                sb.append(i).append("\n");
            }
        }
        System.out.print(sb.toString());
    }

}

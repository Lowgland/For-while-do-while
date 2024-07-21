/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.contadordedigitos;

/**
 *
 * @author thelo
 */
import java.util.Scanner;

public class ContadorDeDigitos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
         // Solicitar al usuario que ingrese un número entero
        System.out.print("Por favor, ingresa un número entero: ");
        int numero = scanner.nextInt();

        // Convertir el número a su valor absoluto para manejar números negativos
        int numeroAbsoluto = Math.abs(numero);

        // Contar la cantidad de dígitos
        int cantidadDeDigitos = contarDigitos(numeroAbsoluto);

        // Mostrar el resultado
        System.out.println("El número " + numero + " tiene " + cantidadDeDigitos + " dígitos.");
    }

    // Método para contar la cantidad de dígitos de un número
    public static int contarDigitos(int numero) {
        if (numero == 0) {
            return 1;
        }

        int contador = 0;
        while (numero > 0) {
            numero /= 10;
            contador++;
        }

        return contador;

    }
}

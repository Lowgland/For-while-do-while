/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sumaaritmetica;

/**
 *
 * @author thelo
 */
import java.util.Scanner;

public class SumaAritmetica {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Ingrese el primer número de la secuencia: ");
        int primerNumero = scanner.nextInt();
        
        
        System.out.print("Ingrese la diferencia entre los números: ");
        int diferencia = scanner.nextInt();
        
        
        System.out.print("Ingrese el número máximo hasta el cual la secuencia debe continuar: ");
        int numeroMaximo = scanner.nextInt();
        
        int numeroActual = primerNumero;
        System.out.println("Secuencia aritmética:");
        
        do {
            System.out.print(numeroActual + " ");
            numeroActual += diferencia;
        } while (numeroActual <= numeroMaximo);

        scanner.close();
    }
}

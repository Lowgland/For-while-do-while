/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.contadornumerosimpares;

/**
 *
 * @author thelo
 */
import java.util.Scanner;

public class ContadorNumerosImpares {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
                
        // Solicitar un número entero positivo al usuario
        do {
            System.out.print("Escribe un número entero positivo: ");
            num = scanner.nextInt();  
            
           if (num <= 0) {
                System.out.println("Intente otra vez.");
            }
        } while (num <= 0); 
        
         System.out.println("Números impares desde 1 hasta " + num + ":");

        // Imprimir los números impares desde 1 hasta el número ingresado
        int i = 1;
        do {
            if (i % 2 != 0) {
                System.out.println(i);
            }
            i++;
        } while (i <= num);

        scanner.close();
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.secuenciadecuadrados;

/**
 *
 * @author thelo
 */
import java.util.Scanner;

public class SecuenciaDeCuadrados {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        
         // Solicitar un número entero positivo al usuario
        do {
            System.out.print("Ingresa un número entero positivo: ");
            num = scanner.nextInt();
            
            if (num <= 0) {
                System.out.println("El numero debe ser mayor que cero");
            }
        } while (num <= 0);
        
        System.out.println("Cuadrados de los números desde 1 hasta " + num + ":");

        // Imprimir los cuadrados de los números desde 1 hasta el número ingresado usando do-while
        int i = 1;
        do {
            System.out.println(i + "^2 = " + (i * i));
            i++;
        } while (i <= num);

        scanner.close();
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.factorial;
import java.util.Scanner;
/**
 *
 * @author al-ro
 */
public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese un numero positivo: ");
        int numero = scanner.nextInt();

        if (numero < 0) {
            System.out.println("El numero debe ser positivo.");
        } else {
            long factorial = 1;
            for (int i = 1; i <= numero; i++) {
                factorial *= i;
            }
            System.out.printf("El factorial de: " + numero + "es: " + factorial);
        }

        scanner.close();
    }
}

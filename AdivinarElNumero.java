/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.adivinarelnumero;

/**
 *
 * @author thelo
 */
import java.util.Scanner;
import java.util.Random;

public class AdivinarElNumero {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numeroAleatorio = random.nextInt(100) + 1;
        int suposicion;
        boolean adivinado = false;
        
       System.out.println("He generado un número aleatorio entre 1 y 100. ¡Intenta adivinarlo!");

        do {
            System.out.print("Ingresa tu suposición: ");
            suposicion = scanner.nextInt();

            if (suposicion < numeroAleatorio) {
                System.out.println("Demasiado bajo. Intenta de nuevo.");
            } else if (suposicion > numeroAleatorio) {
                System.out.println("Demasiado alto. Intenta de nuevo.");
            } else {
                System.out.println("¡Felicidades! Adivinaste el número.");
                adivinado = true;
            }
        } while (!adivinado);

        scanner.close();

        
    }
}

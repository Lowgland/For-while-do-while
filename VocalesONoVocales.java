/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.vocalesonovocales;

/**
 *
 * @author thelo
 */
import java.util.Scanner;

public class VocalesONoVocales {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char letra;
        
        System.out.println("Ingresa una letra (o un espacio para salir):");
        
        while (true) {
            letra = scanner.next().charAt(0);
            
            if (letra == ' ') {
                break;
            } else if (esVocal(letra)) {
                System.out.println(letra + " es una vocal.");
            } else if (Character.isLetter(letra)) {
                System.out.println(letra + " es una consonante.");
            } else {
                System.out.println(letra + " no es una letra válida.");
            }
        }

        System.out.println("Programa terminado.");
        scanner.close();
    }

    public static boolean esVocal(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';

    }
}

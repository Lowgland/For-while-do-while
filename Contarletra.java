/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.contarletra;
import java.util.Scanner;
/**
 *
 * @author al-ro
 */
public class Contarletra {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese una palabra: ");
        String pal = scanner.nextLine();

        pal = pal.toLowerCase();

        int contador = 0;

        for (int i = 0; i < pal.length(); i++) {
            if (pal.charAt(i) == 'a') {
                contador++;
            }
        }

        System.out.println("La letra 'a' aparece " + contador + " veces.");

        scanner.close();
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.contarnumeros;
import java.util.Scanner;
/**
 *
 * @author al-ro
 */
public class Contarnumeros {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese los numeros que desea ingresar: ");
        int cn = scanner.nextInt();

        int mascero = 0;
        int menocero = 0;
        int igcero = 0;

        for (int i = 0; i < cn; i++) {
            System.out.print("Ingrese el numero " + (i + 1) + ": ");
            int numero = scanner.nextInt();

            if (numero > 0) {
                mascero++;
            } else if (numero < 0) {
                menocero++;
            } else {
                igcero++;
            }
        }

        System.out.println("Cantidad de numeros mayores que 0: " + mascero);
        System.out.println("Cantidad de numeros menores que 0: " + menocero);
        System.out.println("Cantidad de numeros iguales a 0: " + igcero);

        scanner.close();
    }
}

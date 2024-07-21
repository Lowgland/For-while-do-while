/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.numerosdivisibles;

/**
 *
 * @author al-ro
 */
public class Numerosdivisibles {

    public static void main(String[] args) {
        System.out.println("Numeros entre 1 y 100 divisibles por 3 y por 5:");

        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i);
            }
        }
    }
}

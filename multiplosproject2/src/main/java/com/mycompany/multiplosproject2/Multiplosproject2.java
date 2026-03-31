/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.multiplosproject2;

/**
 *
 * @author 32611916
 */
public class Multiplosproject2 {
    public static void main(String[] args) {

        int count2 = 0;
        int count3 = 0;
        int count5 = 0;

        for (int i = 1; i <= 1000; i++) {
            if (i % 2 == 0) {
                count2++;
            }
            if (i % 3 == 0) {
                count3++;
            }
            if (i % 5 == 0) {
                count5++;
            }
        }

        System.out.println("Quantidade de múltiplos entre 1 e 1000:");
        System.out.println("Múltiplos de 2: " + count2);
        System.out.println("Múltiplos de 3: " + count3);
        System.out.println("Múltiplos de 5: " + count5);
    }
}
    


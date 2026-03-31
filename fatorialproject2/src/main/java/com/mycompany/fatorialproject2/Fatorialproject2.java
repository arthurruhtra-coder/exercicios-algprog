/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.fatorialproject2;
import java.util.Scanner;
/**
 *
 * @author 32611916
 */
public class Fatorialproject2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        long fatorial = 1;

        if (numero < 0) {
            System.out.println("Fatorial não é definido para números negativos.");
        } else {
            for (int i = 1; i <= numero; i++) {
                fatorial *= i;
            }

            System.out.println("O fatorial de " + numero + " é: " + fatorial);
        }

        scanner.close();
    }
}
    


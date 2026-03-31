/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tabuadaproject1;
import java.util.Scanner;
/**
 *
 * @author 32611916
 */
public class Tabuadaproject1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n;
        System.out.println("Digite um numero para N: ");
            n = scanner.nextInt();
        
        System.out.println("Tabuada do " + n + ":");
        
        for(int i = 1; i <= 10; i++){
            System.out.println(n + " x " + i + " = " + (n * i));
        }
        scanner.close();
    }
}

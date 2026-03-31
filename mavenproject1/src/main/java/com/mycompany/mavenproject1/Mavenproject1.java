/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;
import java.util.Scanner;

/**
 *
 * @author 32611916
 */
public class Mavenproject1 {

    public static void main(String[] args) {
        System.out.println("HORA DA TABUADA!!");
        // PRIMEIRO FOR = controla qual tabuada (1 até 10)
        for(int n = 1; n <= 10; n++){           
            System.out.println("Tabuada do " + n + ":");
        // SEGUNDO FOR = faz as contas de 1 até 10 para cada número    
            for(int i = 1; i <= 10; i++){
                System.out.println(n + " x " + i + " = " + (n * i));
            }
            System.out.println(); // pular linha <- organizar
        }
        
        
    }
}

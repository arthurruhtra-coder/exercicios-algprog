/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.for2project1;
import java.util.Scanner;
/**
 *
 * @author 32611916
 */
public class For2project1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n;
        
        System.out.println("Digite n: ");
        n = entrada.nextInt();
        
        for(int i = 1; i <= n; i++){
            System.out.println(i*2);
            
        }
    }
}

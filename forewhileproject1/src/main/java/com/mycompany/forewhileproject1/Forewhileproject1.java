/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.forewhileproject1;
import java.util.Scanner;
/**
 *
 * @author 32611916
 */
public class Forewhileproject1 {

    public static void main(String[] args) {
        Scanner sc = new
            Scanner(System.in);
        String senha = " ";
        
        while (!senha.equals("una2026")) {
            System.out.print("Digite a senha: ");
                senha = sc.nextLine();
        }
        
        System.out.println("Acesso Liberado!");
        sc.close();
    }
}

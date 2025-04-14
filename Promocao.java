/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.promocao;

import java.util.Scanner;

/**
 *
 * @author gabri
 */
public class Promocao {

    public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);
         
         double preco, desconto, total;
         
          System.out.print("Qual e o preco original: ");
         preco = entrada.nextDouble();
         
         desconto = preco * 15/100;
         total = preco - desconto;
                 
          System.out.print("O valor com desconto e: " + total);
         
    }
}

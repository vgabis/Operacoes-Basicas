/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.casa;

import java.util.Scanner;

/**
 *
 * @author gabriella
 */
public class Casa {

    public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);
         
         double area, largura, comprimento;
         
        System.out.print("Qual a largura da casa: ");
         largura = entrada.nextDouble();
         
          System.out.print("Qual e o comprimento da casa: ");
         comprimento = entrada.nextDouble();
         
         area = comprimento * largura;
         
         System.out.print("A area total da casa e: " + area);
    }   
    
}

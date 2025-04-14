/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.media;

import java.util.Scanner;

/**
 *
 * @author gabri
 */
public class Media {

    public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);
         
         System.out.print("Digite a nota 1: ");
         double nota1 = entrada.nextDouble();
         
         System.out.print("Digite a nota 2: ");
         double nota2 = entrada.nextDouble();
         
         System.out.print("Digite a nota 3: ");
         double nota3 = entrada.nextDouble();
         
         double media = (nota1 + nota2 + nota3) / 3;
         
         System.out.print("A media das notas e: " + media);
         
    }
}

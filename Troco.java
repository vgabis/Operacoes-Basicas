/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.troco;

import java.util.Scanner;

/**
 *Maria foi ao supermercado e comprou 3 produtos diferentes. Ela quer saber o total que gastou e quanto dinheiro ela 
 * precisará dar de troco. Crie um programa que peça o preço de cada produto e o valor dado por Maria, calcule o total e o troco.
 * @author gabriella
 */
public class Troco {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
       
        System.out.print("Qual o valor do primeiro produto: ");
        double produto1 = entrada.nextDouble();
        
        System.out.print("Qual o valor do segundo produto: ");
        double produto2 = entrada.nextDouble();
        
        System.out.print("Qual o valor do terceiro produto: ");
        double produto3 = entrada.nextDouble();
        
        double total = produto1 + produto2 + produto3;
        
        System.out.print("Qual o valor dado pelo cliente: ");
        double valor = entrada.nextDouble();
        
        double troco = valor - total;
        
        System.out.print("Troco: " + troco);
        
        
    }
}

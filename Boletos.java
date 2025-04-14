/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.boletos;

import java.util.Scanner;

/**
 *
 * @author gabri
 */
public class Boletos {

    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
         
         System.out.print("Digite o boleto 1: ");
         double boleto1 = entrada.nextDouble();
         
         System.out.print("Digite o boleto 2: ");
         double boleto2 = entrada.nextDouble();
         
         System.out.print("Digite o boleto 3: ");
         double boleto3 = entrada.nextDouble();
         
         System.out.print("Digite o boleto 4: ");
         double boleto4 = entrada.nextDouble();
         
         System.out.print("Digite o salario bruto: ");
         double salarioB = entrada.nextDouble();
         
         double desconto = salarioB * 14/100;
         double salarioL = salarioB - desconto;
         
         System.out.print("O salario liquido e: " + salarioL);       
          
         double total = boleto1 + boleto2 + boleto3 + boleto4;         
         System.out.print("\nO total das contas e: " + total);
         
         double valor = salarioL - total;       
         System.out.print("\nO valor que ira sobrar e: " + valor);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.viagem;

import java.util.Scanner;

/**
 *Lucas está planejando uma viagem para a Europa e quer converter seu dinheiro de Reais (BRL) para Euros (EUR). 
 * Crie um programa que peça o valor em Reais e a taxa de conversão atual, e calcule o valor equivalente em Euros.

 * @author gabri
 */
public class Viagem {

    public static void main(String[] args) {
          Scanner entrada = new Scanner(System.in);
        
        System.out.print("Qual o valor em reais: ");
        double reais = entrada.nextDouble();
        
        System.out.print("Qual e a taxa de conversao atual: ");
        double taxa = entrada.nextDouble();
        
        double conversao = reais / taxa;
                
        System.out.print("O valor equivalente em Euros e: " + conversao);
        
    }
}

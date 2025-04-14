/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.segundos;

import java.util.Scanner;

/**}

 *Faça um programa que calcule o número de segundos que existem em X anos, onde X é um valor informado pelo usuário via teclado.

 * @author gabriella
 */
public class Segundos {

    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       
        System.out.print("Informe o numero de anos que gostaria de calcular: ");
        int anos = entrada.nextInt();
        
        int calculo, segundos = 31536000;
        calculo = anos * segundos;
        
         System.out.println(" o numero de segundos que existem em " + anos + " anos e: " + calculo);
        
    }
}

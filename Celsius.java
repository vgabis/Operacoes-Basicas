/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.celsius;

import java.util.Scanner;

/**
 *
 * @author gabri
 */
public class Celsius {

    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       double celsius, fahrenheit;
       
       System.out.println("Digite a temperatura em graus celsius: ");
       celsius = entrada.nextDouble();
       
       fahrenheit = 1.8 * celsius + 32;
       
       System.out.println(+ celsius + " Graus Celsius e igual a: " + fahrenheit + " em Fahrenheit");
       
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class grados {

    /**
     * @param args the command line arguments
     * Dada una cantidad de grados centígrados se debe mostrar su equivalente 
      en grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float num1, resultado;
        Scanner num = new Scanner(System.in);
        System.out.println("Ingresa una cantidad de grados centígrados y lo convertimos en Farenheit");
        num1 = num.nextFloat();
        resultado = 32 + (9 * num1 / 5);
        System.out.println("Estamos en este momento a " + resultado + "° Farenheit");
    }
    
}

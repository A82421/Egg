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
public class calculos {

    /**
     * @param args the command line arguments
     * Escribir un programa que lea un número entero por teclado y 
     * muestre por pantalla el doble, el triple y la raíz cuadrada de ese número. 
    Nota: investigar la función Math.sqrt().
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1, r, t, d;
        
        Scanner num = new Scanner(System.in);
        System.out.println("Ingresa un número y tendrás su raíz, doble y triple");
        num1 = num.nextInt();
        r = (int) Math.sqrt(num1);
        t = num1 * 3;
        d = num1 * 2;
        System.out.println("Su raíz es " + r);
        System.out.println("Su doble es " + d);
        System.out.println("Su Triple es " + t);
    }
    
}

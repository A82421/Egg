/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;


import java.util.Scanner;

public class SumaDeDosNumeros {
    public static void main(String[] args) {
        int num1, num2, suma;

        Scanner num = new Scanner(System.in);
        System.out.print("Introduce el primer número: ");
        num1 = num.nextInt();
        System.out.print("Introduce el segundo número: ");
        num2 = num.nextInt();

        suma = num1 + num2;

        System.out.println("La suma de " + num1 + " y " + num2 + " es: " + suma);
    }
}

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
public class NewMain {

    /**
     * @param args the command line arguments
     * Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por pantalla.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre;
        Scanner leer = new Scanner(System.in);
 
        System.out.println("Ingresa tu nombre");
        nombre = leer.nextLine();
        System.out.println(nombre);
    }
    
}

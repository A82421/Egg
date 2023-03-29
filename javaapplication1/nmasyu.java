/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toLowerCase;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

/**
 *
 * @author Usuario
 */
public class nmasyu {

    /**
     * @param args the command line arguments
     * Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda en minúsculas. 
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String frase;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa tu frase");
        frase = leer.nextLine();
        System.out.println("Tu frase en mayúsculas es: " + toUpperCase(frase));
        System.out.println("Tu frase en mayúsculas es: " + toLowerCase(frase));
    }
    
}


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class ex1 {

    /**
     * @param args the command line arguments
     * Crear un programa que dado un número determine si es par o impar.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1;
        Scanner num = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        num1 = num.nextInt();
        if (num1 % 2 != 0) {
            System.out.println("El número " + num1 + " es impar");
        } else {
            System.out.println("El número " + num1 + " es par");
        }
        
    }
    
}

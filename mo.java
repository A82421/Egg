
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
public class mo {

    /**
     * @param args the command line arguments
     * Implementar un programa que le pida dos números enteros al usuario
     * y determine si ambos o alguno de ellos es mayor a 25.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1, num2;
        
        Scanner num = new Scanner(System.in);
        System.out.println("Ingresa dos números");
        num1 = num.nextInt();
        num2 = num.nextInt();
        if (num1 > 25) {
            System.out.println("El número " + num1 + " es mayor a 25");
        }else if (num2 > 25) 
        {
            System.out.println("El número " + num2 + " es mayor a 25");
        } else {
            System.out.println("Los números " + num1 + " y " + num2 + " no son mayores a 25");
        }
        
    }
    
}

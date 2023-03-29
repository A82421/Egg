
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
public class ex2g3 {

    /**
     * @param args the command line arguments
     * Diseñe una función que pida el nombre y la edad de N personas e imprima los datos de las personas 
     * ingresadas por teclado e indique si son mayores o menores de edad. Después de cada persona, el programa 
     * debe preguntarle al usuario si quiere seguir mostrando personas y frenar cuando el usuario ingrese la palabra “No”.

     */
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        // TODO code application logic here
        int n;
        System.out.println("Ingresa el número de personas: ");
        n = num.nextInt();
        nombres(num.nextInt());
        
    }
    public ex2g3(int n){
        Scanner num = new Scanner(System.in);
        int cont=0;
        
        while (cont < n)
        {
            cont = cont + 
       System.out.println("Ingresa el nombre de la persona: ");
            String nombre = num.nextLine();
       System.out.println("Nombre ingresado.");
       }
    }
    
}
0
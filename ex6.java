
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
public class ex6 {

    /**
     * @param args the command line arguments
     * Realizar un programa que pida dos números enteros positivos por teclado y muestre por pantalla el siguiente menú:
     * El usuario deberá elegir una opción y el programa deberá mostrar el resultado por pantalla y luego volver al menú. 
     * El programa deberá ejecutarse hasta que se elija la opción 5. Tener en cuenta que, si el usuario selecciona 
     * la opción 5, 
     * en vez de salir del programa directamente, se debe mostrar el siguiente mensaje de confirmación: 
     * ¿Está seguro que desea salir del programa (S/N)? 
     * Si el usuario selecciona el carácter ‘S’ se sale del programa, caso contrario se vuelve a mostrar el menú.
     */
    public static void main(String[] args) {
        // TODO code application logic here
                int num1, num2, opcion = 0, resultado;
                String opcion2 = null;
                
resultado = 0;
        Scanner num = new Scanner(System.in);
        System.out.print("Introduce el primer número: ");
        num1 = num.nextInt();
        System.out.print("Introduce el segundo número: ");
        num2 = num.nextInt();
        System.out.print("Ingresa una opción: ");
        boolean opcion1 = true;
        
        do {
          
            System.out.println("MENÚ (elija su opción");
            System.out.println("1: sumar");
            System.out.println("2: restar");
            System.out.println("3: multiplicar");
            System.out.println("4: dividir");
            System.out.println("5: salir");
            opcion = num.nextInt();
            
        
        switch(opcion)
        {
            case 1:
                resultado = num1 + num2;
                System.out.println("La suma de "+ num1 + " y " + num2 + " es: " + resultado);
                break;
            case 2:
                resultado = num1 - num2;
                System.out.println("La resta de "+ num1 + " y " + num2 + " es: " + resultado);
                break; 
            case 3:
                resultado = num1 * num2;
                System.out.println("La multiplicación de "+ num1 + " y " + num2 + " es: " + resultado);
                break;
            case 4:
                resultado = num1 / num2;
                System.out.println("La división de "+ num1 + " y " + num2 + " es: " + resultado);
                break;
            case 5:
              
                System.out.println("¿Seguro que desea salir? (S/N)");
                opcion2 = num.nextLine();
                if (opcion2 == "S"){
                opcion1 = false;
            }else {
                   continue;
               }
                opcion1 = false;
               
                break;
        }
        }while(opcion1 == true && opcion2 == "S");
    }
    
}

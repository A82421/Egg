
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
public class ex1g3 {

    /**
     * @param args the command line arguments
     * Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar, restar,
     * multiplicar y dividir. La aplicación debe tener una función
     * para cada operación matemática y deben devolver sus resultados para imprimirlos en el main. 
     */
    public static void main(String[] args) {
        // TODO code application logic here
       int opcion =0, num1, num2, resultado = 0;
        Scanner num = new Scanner(System.in);
        System.out.print("Introduce el primer número: ");
        num1 = num.nextInt();
        System.out.print("Introduce el segundo número: ");
        num2 = num.nextInt();
        System.out.print("Ingresa una opción: ");
        boolean salir = true;
        
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
                resultado = suma(num1, num2);
                System.out.println("La suma de "+ num1 + " y " + num2 + " es: " + resultado);
                break;
            case 2:
                resultado = resta(num1, num2);
                System.out.println("La resta de "+ num1 + " y " + num2 + " es: " + resultado);
                break; 
            case 3:
                resultado = mul(num1, num2);
                System.out.println("La multiplicación de "+ num1 + " y " + num2 + " es: " + resultado);
                break;
            case 4:
               resultado = div(num1, num2);
                System.out.println("La división de "+ num1 + " y " + num2 + " es: " + resultado);
                break;
            case 5:
            {
                String op = null;
                op = num.nextLine();
                if ("S".equals(op)){
                    salir = false;
                            }
            }
              break;
        }
        }while(salir = true);
    }
    public static int suma(int num1, int num2)
   {
       
       int resultado = num1 + num2;
        return resultado;
        
    }
     public static int resta(int num1, int num2)
   {
       
     int  resultado = num1 - num2;
        return resultado;
        
    }
     public static int mul(int num1, int num2)
   {
       int resultado = num1 * num2;
        return resultado;
        
    }
      public static int div(int num1, int num2)
   {
       int resultado = num1 / num2;
        return resultado;
    }
       public static int exit()
   {
       
        return 0;
        
    }
}

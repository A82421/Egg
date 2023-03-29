
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
public class ex5ex {

    /**
     * @param args the command line arguments
     * Realice un programa para que el usuario adivine el resultado de una multiplicación entre dos 
     * números generados aleatoriamente entre 0 y 10. El programa debe indicar al usuario si su respuesta es o no correcta.
     * En caso que la respuesta sea incorrecta se debe permitir al usuario ingresar su respuesta nuevamente.
     * Para realizar este ejercicio investigue como utilizar la función Math.random() de Java.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
       int n1 = (int)(Math.random() * 10), n2 = (int)(Math.random() * 10); /* [0.0 , 1.0) */  
        int rta;
        
       do{
        System.out.println("Intente adivinar el resultado de la mult");
        rta = leer.nextInt();
        if(rta == n1*n2){
            System.out.println("Bien ahí master");
        }else{
            System.out.println("Intento incorrecto.");
            if(rta < n1*n2){
                System.out.println("El resultado es mayor");
            } else {
                System.out.println("El resultado es menor");
            }
        }
       }while(rta!=n1*n2);
        
    }
    
}

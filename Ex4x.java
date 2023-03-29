
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
public class Ex4x {

    /**
     * @param args the command line arguments
     * Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal.
     * Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la clase String.
     */
    public static void main(String[] args) {
        // TODO code application logic here
      Scanner leer= new Scanner(System.in);
        System.out.println("Ingrese una letra");
        String letra = leer.next();
        if(letra.equalsIgnoreCase("A") || letra.equalsIgnoreCase("E") || letra.equalsIgnoreCase("I") || letra.equalsIgnoreCase("O") || letra.equalsIgnoreCase("U")){
            System.out.println("Usted a ingresado una vocal");
        }else{
            System.out.println("Usted a ingresado una consonante");
        }
    }
    
}


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
public class ex2 {

    /**
     * @param args the command line arguments
     * Crear un programa que pida una frase y si esa frase es igual a 
     * “eureka” el programa pondrá un mensaje de Correcto,
     * sino mostrará un mensaje de Incorrecto. Nota: investigar la función equals() en Java.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String frase;
        String clave;
        clave = "eureka";
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa tu clave");
        frase = leer.nextLine();
        if (frase.equals(clave)){
            System.out.println("Correcto");
        }else {
            System.out.println("Incorrecto, inicie de nuevo el programa");
        }
        
    }
    
}

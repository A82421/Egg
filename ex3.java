
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
public class ex3 {

    /**
     * @param args the command line arguments
     * Realizar un programa que solo permita introducir solo frases o palabras de 8 
     * de largo. Si el usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje 
     * por pantalla que diga “CORRECTO”, en caso contrario, se deberá
     * imprimir “INCORRECTO”. Nota: investigar la función Lenght() en Java.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String frase;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa una frase o una palabra");
        frase = leer.nextLine();
        if (frase.length() == 8){
            System.out.println("Correcto");
        }else {
            System.out.println("Incorrecto. Tu palabra/frase tiene " + frase.length() + " carácteres, inicie de nuevo el programa");
        }
    }
    
}

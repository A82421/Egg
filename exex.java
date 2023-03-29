
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
public class exex {

    /**
     * @param args the command line arguments
     * Realizar un algoritmo que calcule la suma de todos los elementos de un 
     * vector de tamaño N, con los valores ingresados por el usuario.

     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Tamaño de vector:");
        int x=leer.nextInt(), suma=0;
        int[]vector=new int[x];
        
        for(int i=0;i<vector.length;i++){
           suma = leer.nextInt();
           
           vector[i] = suma;
            }
         for(int i=0;i<vector.length;i++){
        System.out.println(suma);
            
        }
        }
   
}


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
public class ex2g4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         /**
     * Realizar un algoritmo que llene un vector de tamaño N con valores aleatorios
     * y le pida al usuario un número a buscar en el vector.
     * El programa mostrará dónde se encuentra el numero y si se encuentra repetido
     * 
     * @param args the command line arguments
     */
    
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Tamaño de vector:");
        int x=leer.nextInt();
        int[]vector=new int[x];
        
        for(int i=0;i<vector.length;i++){
        vector[i]=(int)(Math.random()*10);
        }
        
        System.out.println("Que nº buscas?");
        int numbuscado=leer.nextInt();
        
        
        for(int i=0;i<vector.length;i++){
            if(vector[i]==numbuscado){
                int c=0;
                if(c==0){
                System.out.print("El numero es correcto");
                c++;
            }
            }else { 
                System.out.print("El número es incorrecto");
            }
        }
        System.out.println("");
    }
}
    
    


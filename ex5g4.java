
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
public class ex5g4 {

     /**Realice un programa que compruebe si una matriz dada es antisimétrica.
     * Se dice que una matriz A es antisimétrica cuando ésta es igual a su propia traspuesta, pero cambiada de signo.
     * Es decir, A es antisimétrica si A = -AT.
     * La matriz traspuesta de una matriz A se denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
//        int x=leer.nextInt();
        int[][]matriz=new int[3][3];
        int[][]matriz2=new int[3][3];
        
        for(int i=0;i<matriz[0].length;i++){//leer y valor de resultado
            for(int j=0;j<matriz.length;j++){
                matriz[i][j]=leer.nextInt();
            }
        }
        
        for(int i=0;i<matriz[0].length;i++){
            for(int j=0;j<matriz.length;j++){
                System.out.print(matriz[i][j]+", ");
            }
             System.out.println("");
        }
        System.out.println("");
    }
    
}
  
            
            

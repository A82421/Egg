
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
public class ex4g4 {

     /**
     * Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la traspuesta de la matriz.
     * La matriz traspuesta de una matriz A se denota por B y se obtiene cambiando sus filas por columnas (o viceversa).
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
//        int x=leer.nextInt();
        int[][]matriz=new int[4][4];
        
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz.length;j++){
                matriz[i][j]=(int)(Math.random()*10);
            }
        }
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz.length;j++){
                System.out.print(matriz[i][j]+", ");
            }
             System.out.println("");
        }
        System.out.println("");
        System.out.println("Invertido:");
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz.length;j++){
                System.out.print(matriz[j][i]+", ");
            }
             System.out.println("");
        }
       
}
}

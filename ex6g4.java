
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
public class ex6g4 {

    /**Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la suma de sus filas,
     * sus columnas y sus diagonales son idénticas.
     * Crear un programa que permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no.
     * El programa deberá comprobar que los números introducidos son correctos, es decir, están entre el 1 y el 9.
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
//        int x=leer.nextInt();
        int[][]matriz=new int[3][3];
        
        int resultado=0;
        int suma=0;
        int c=0;
        
        for(int i=0;i<matriz[0].length;i++){//leer y valor de resultado
            for(int j=0;j<matriz.length;j++){
                matriz[i][j]=leer.nextInt();
                if(c<3){
                    resultado=resultado+Math.abs(matriz[i][j]);
                    c++;
                }
            }
        }

        for(int i=0;i<matriz[0].length;i++){//filas
            for(int j=0;j<matriz.length;j++){
                suma=suma+Math.abs(matriz[i][j]);
            }
            if(suma!=resultado){
                System.out.println("No es magico.");
                break;
            }
            suma=0;
        }
        for(int i=0;i<matriz[0].length;i++){//columnas
            for(int j=0;j<matriz.length;j++){
                suma=suma+Math.abs(matriz[j][i]);
            }
            if(suma!=resultado){
                System.out.println("No es magico.");
                break;
            }
            suma=0;
        }
        
        int diag1=(matriz[0][0]+matriz[1][1]+matriz[2][2]);
        int diag2=(matriz[0][2]+matriz[1][1]+matriz[2][0]);
        
        if(diag1!=resultado || diag2!=resultado){
            System.out.println("No es magico.");
        }else{
            System.out.println("Es magico.");
            System.out.println("");
        for(int i=0;i<matriz[0].length;i++){
            for(int j=0;j<matriz.length;j++){
                System.out.print(matriz[i][j]+", ");
            }
             System.out.println("");
        }
        System.out.println("");
        }  
}
}


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
public class ex3g4 {
/**
     * Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito,
     * cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Tamaño de vector:");
        int x=leer.nextInt();
        int[]vector=new int[x];
        
        for(int i=0;i<vector.length;i++){
            vector[i]=(int)(Math.random()*10);
            vector[i]=(int)(Math.random()*100);
            vector[i]=(int)(Math.random()*1000);
            vector[i]=(int)(Math.random()*10000);
            vector[i]=(int)(Math.random()*100000);
            System.out.print(vector[i]+", ");
        }
        System.out.println("");
        int d1=0,d2=0,d3=0,d4=0,d5=0;
        for(int i=0;i<vector.length;i++){
            if(vector[i]>=0 && vector[i]<=9){
                d1++;
            } else if(vector[i]>=10 && vector[i]<=99){
                d2++;
            } else if(vector[i]>=100 && vector[i]<=999){
                d3++;
            } else if(vector[i]>=1000 && vector[i]<=9999){
                d4++;
            } else if(vector[i]>=10000 && vector[i]<=99999){
                d5++;
            }
        }
        System.out.println("Hay "+d1+" nº de un digito.");
        System.out.println("Hay "+d2+" nº de dos digitos.");
        System.out.println("Hay "+d3+" nº de tres digitos.");
        System.out.println("Hay "+d4+" nº de cuatro digitos.");
        System.out.println("Hay "+d5+" nº de cinco digitos.");
}
}

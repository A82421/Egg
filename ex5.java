
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
public class ex5 {

    /**
     * @param args the command line arguments
     * Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación 
     * solicite números al usuario hasta que la suma de los números introducidos supere el límite inicial.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1 = 0, lim, suma;
        
        Scanner num = new Scanner(System.in);
        lim = 50;

        suma = 0;
       
            while (suma <= lim){
                if (suma<lim){
                    
                suma = suma + num1;
                System.out.println("Ingresa un número");
                num1 = num.nextInt();
                
                }else if (suma == 50 && suma > 50) {
                    break;
                }
            }
    }
    
}

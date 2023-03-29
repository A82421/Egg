
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
public class ex2ex {

    /**
     * @param args the command line arguments
     * Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada una. 
     * A continuación, realizar las instrucciones necesarias para que: B tome el valor de C, C tome el valor de A,
     * A tome el valor de D y D tome el valor de B. Mostrar los valores iniciales
     * y los valores finales de cada variable. Utilizar sólo una variable auxiliar.
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        Scanner num = new Scanner(System.in);
         int  A, B, C, D, aux;
        System.out.println("Ingresa 4 valores distintos:");
        A = num.nextInt();
        B = num.nextInt();
        C = num.nextInt();
        D = num.nextInt();
         System.out.println("Acá está: " + A+ ", " + B + ", " + ", "+ C + ", "+D );
            aux = B;
            B = C;
            C = A;
            A = D;
            D = aux;
         System.out.println("Acá está: " + A+ ", " + B+", " + ", "+ C +", "+ D );
        }
    
}

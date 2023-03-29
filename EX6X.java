
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
public class EX6X {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer= new Scanner(System.in);
        System.out.println("Ingrese el tipo de socio y el valor del analisis a realizar");
        String tipo= leer.next();
        tipo=tipo.toUpperCase();
        int valor= leer.nextInt();
        switch(tipo){
            case "A":{System.out.println("Usted tiene que pagar " + (valor*0.5));
            }
            break;
            case "B":{System.out.println("Usted tiene que pagar " + (valor*0.75));
            }
            break;
            case "C":{System.out.println("No le descontamos nada por POBRE. Pague " + valor);
            }
            break;
        }
    }
    
}

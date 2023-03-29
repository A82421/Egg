
import static java.lang.Math.round;
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
public class ex1ex{

    /**
     * @param args the command line arguments
     * Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo,
     * si el usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int min, h;
        double d;
        Scanner num = new Scanner(System.in);
        System.out.println("Ingresa un tiempo en minutos");
        min = num.nextInt();
        h = min / 60;
        d = min/1440;
        System.out.println("El tiempo en días es: " + round(d) + " o " + round(h) + " horas");
    }
    
}

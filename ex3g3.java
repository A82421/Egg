
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
public class ex3g3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        do {
           System.out.println("Ingrese la cantidad de euros que desea convertir:");
        System.out.print("€ ");
        double euro = leer.nextDouble();
        String opcion;
        do {
            System.out.println("A qué moneda desea convertirlos:");
            System.out.println("A: libras");
            System.out.println("B: U$S");
            System.out.println("C: yenes");
            opcion = leer.next();
            if (opcion.equals("A")||opcion.equals("B")||opcion.equals("C")) {
                break;
            } else {
                System.out.println("Opción incorrecta!");
            }
        } while (true);
        conversor(euro,opcion);
        System.out.println("Desea continuar realizando conversiones? s/n");
        String r = leer.next();
        if (r.equals("n")) {
            System.out.println("Hasta la próxima!");
            break;
        } 
        } while (true);
        
    }   

public static void conversor(double euro, String opcion){
    switch (opcion) {
        case "A":
           System.out.println("Los " + euro + " euros ingresados equivalen a " + (euro * 0.86) + " libras.");
            break;
        case "B":
           System.out.println("Los " + euro + " euros ingresados equivalen a " + (euro * 1.28611) + " U$S.");
            break;
        case "C":
           System.out.println("Los " + euro + " euros ingresados equivalen a " + (euro * 129.852) + " yenes.");
           break;
    }
}
}
    
    


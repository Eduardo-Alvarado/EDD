
import static java.time.Clock.system;
import java.util.Scanner;

/*Proyecto incial para conocer e identificar los tipos de datos primitivos en java*/


/**
 * @author 16550558 Eduardo Alvarado
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int iEdad;
        String sNom;
        double dSal;
        Scanner scScanner = new Scanner(System.in);
        System.out.println("introduce tu nombre: ");
        sNom = scScanner.nextLine();
        System.out.println("introduce tu edad: ");
        iEdad = scScanner.nextInt();
        System.out.println("introduce tu salario: ");
        dSal = scScanner.nextDouble();
        
        haceralgo(sNom, iEdad, dSal);
    }
    
    /**
     *
     * @param sNombrem - ejemplo usando String
     * @param iEdad    - ejemplo usando Enteros
     * @param dSalario - ejemplo usando Double
     */
    public static void haceralgo(String sNombre, int iEdad, double dSalario){
        System.out.println(sNombre + " " + iEdad + " " + dSalario);
    }
    
}

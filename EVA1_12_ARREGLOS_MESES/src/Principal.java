
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author temporal2
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String asMeses[] = {"ENERO","FEBRERO","MARZO","ABRIL","MAYO","JUNIO","JULIO","AGOSTO","SEPTIEMBRE","OCTUMBRE","NOVIEMBRE","DICIEMBRE"};
        int aiDias[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int iMes;
        Scanner sCaptu = new Scanner(System.in);
        System.out.println("NUMERO DEL MES (1 - 12): ");
        iMes = sCaptu.nextInt();
        System.out.println("El mes es " + asMeses[iMes-1] + " Y tiene " + aiDias[iMes-1] + " dias");
    }
    
}


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
        float iPromedio=0;
        Scanner sCaptu = new Scanner(System.in);
        System.out.println("Cuantas edades vas a capturar? ");
        int iCant = sCaptu.nextInt();
        int aiEdades[] = new int [iCant];
        for (int i = 0; i < iCant; i++) {
            System.out.println("Introduce la edad:");
            aiEdades[i] = sCaptu.nextInt();
            iPromedio += aiEdades[i];
        }
        System.out.println("El promedio de sus edades es: " + (iPromedio/iCant));
    }
    
}

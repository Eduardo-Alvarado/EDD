
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author administrador
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static final int TAMA_ARRE = 5;
    public static void main(String[] args) {
        // TODO code application logic here
        int arr[] = new int[TAMA_ARRE];
        Scanner sCaptu = new Scanner(System.in);
        for (int i = 0; i < TAMA_ARRE; i++) {
            System.out.println("Introduce una edad: ");
            arr[i] = sCaptu.nextInt();
        }
        for(int x:arr)
        {
            System.out.println("Edades: " + x);
        }
        //duplicado de arreglo
        int copiarr[];
        copiarr = new int[TAMA_ARRE];
        for (int i = 0; i < TAMA_ARRE; i++) {
            copiarr[i] = arr[i];
        }
        for(int x: copiarr)
        {
            System.out.println("Copia Edad = " + x);
        }
        System.out.println(copiarr);
        System.out.println(arr);
    }
    
}

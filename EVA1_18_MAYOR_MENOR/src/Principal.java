
import java.util.Arrays;
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
        System.out.println("Ingrese tamaño del arreglo: ");
        Scanner sc = new Scanner(System.in);
        int x;
        x=sc.nextInt();
        int ar[];
        ar = new int [x];
        int arr[];
        System.out.println("Ingrese datos del arreglo");
        for (int i = 0; i < x; i++) {
            ar[i]=sc.nextInt();
        }
        Arrays.sort(ar,0,x);
        System.out.println("El dato menor de su lista es: " + ar[0] + " El dato mayor de su lista es: " + ar[x-1]);
    }
    
}

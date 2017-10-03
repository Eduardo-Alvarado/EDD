
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
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int x;
        System.out.println("Tamaño del arreglo: ");
        x=sc.nextInt();
        int y[] = new int [x];
        System.out.println("Ingrese valores de su lista: ");
        for (int i = 0; i < x; i++) {
            y[i]=sc.nextInt();
        }
        System.out.println("Su arreglo invertido es: ");
        for (int i = 0; i < x; i++) {
            System.out.println(y[(x-i)-1]);
        }
    }
    
}

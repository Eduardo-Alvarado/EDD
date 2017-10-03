
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
        Scanner sc = new Scanner(System.in);
        int x,prom=0,y=0, z=0;   
        System.out.println("Numero de grupos: ");
        x=sc.nextInt();
        int ar[][] = new int [x][x];
        for (int i = 0; i < x; i++) {
            System.out.println("Cuantos alumnos tiene su grupo: ");
            z = sc.nextInt();
            for (int j = 0; j < z; j++) {
                System.out.println("Edad del almno: ");
                ar[i][j] = sc.nextInt();
                prom += ar[i][j];
            }
            System.out.println("El promedio de las edades del grupo " + (i+1) + " es: " + (prom/z));
        }
    }
    
}

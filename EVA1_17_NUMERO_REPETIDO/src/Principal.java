
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
        int x,Z,a=0;
        System.out.println("Tamaño del arreglo: ");
        x=sc.nextInt();
        int y[] = new int [x];
        System.out.println("Ingrese valores de su lista: ");
        for (int i = 0; i < x; i++) {
            y[i]=sc.nextInt();
        }
        System.out.println("Que numero buscas? ");
        Z=sc.nextInt();
       
        for (int i = 0; i < x; i++) {
           if(Z==y[i]){
               a++;
           }
        }
        System.out.println("La variable se repite: " + a + " veces");
    }
    
}

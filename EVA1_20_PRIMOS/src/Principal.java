
import static java.lang.Math.sqrt;
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
        int n;
        double x;
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        for (int i = 2; i < n; i++) {
            if((n%i)==0)
            {
                System.out.println("No es un Numero Primo");
                i+=n;
            }
            if((i+1)>=n)
            {
                System.out.println("Es un numero primo");
            }
        }
        x=n;
        x=Math.sqrt(x);
        for (int i = 2; i < x; i++) {
            if((n%i)==0)
            {
                System.out.println("No es un Numero Primo");
                i+=n;
            }
            if((i+1)>=x)
            {
                System.out.println("Es un numero primo");
            }
        }
    }
    
}

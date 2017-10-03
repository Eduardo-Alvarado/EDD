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
        int aiMisNume[] = new int[10];
        for(int i=0; 0<i; i++)
        {
            aiMisNume[i] = (int)(Math.random() * 10 ) + 1;
        }
        //for each
        for(int x : aiMisNume)
        {
            System.out.println(" x = " + x);
        }
        //multiples arreglos
        int [] arr1, arr2, arr3;
        arr1 = new int[3];
        arr2 = new int[10];
        arr3 = new int[100];
        //arreglos y variables
        int arre1[], ivar, ivar2;
        arre1 = new int[10];
        ivar = 10;
        ivar2 = 10;
    }
    
}

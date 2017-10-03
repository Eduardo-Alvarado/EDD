/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_19_million_dollar_baby;

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
        int aiMillion[] = new int[300000000];
        for (int i = 0; i < 300000000; i++) {
            aiMillion[i] = (int)(Math.random()*1000)+1;
        }
    }
    
}

//criba de eratosteles

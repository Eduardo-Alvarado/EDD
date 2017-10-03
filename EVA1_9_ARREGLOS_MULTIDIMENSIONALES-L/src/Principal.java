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
        //arreglos multidimensionales - arreglos de arreglos
        //matriz de  2x2 dimensiones filas x columnas
        int a=2,b=2;
        int aiMatriz[][] = new int [a] [b];
        for (int i = 0; i < a; i++) { //recorre cada fila
            for (int j = 0; j < 2; j++) { //recorre cada columna
                aiMatriz[i][j] = (int)(Math.random()*10) +1;
            }
        }
        for (int i = 0; i < b; i++) { //recorre cada fila
            for (int j = 0; j < 2; j++) { //recorre cada columna
                System.out.print("[" + aiMatriz[i][j]+"] ");
            }
            System.out.println("");
        }
        System.out.println("");
        for (int[] aiMatriz1 : aiMatriz) {
            for (int c : aiMatriz1) {
                System.out.print("[" + c + "] ");
            }
            System.out.println("");
        }
    }
    
}

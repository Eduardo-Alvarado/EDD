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
       int i= 5;
        System.out.println("i="+i);
        //crear una copia de i
        int iCopia=i;//Asignamos el valor de i a la variable iCopia
        System.out.println("copia de i="+iCopia);
        i++;
        System.out.println("i++="+i);
        System.out.println("iCopia="+iCopia);
        // Declarar objeto de tipo numero
        Numero nVal= new Numero();//creamos el objeto
        System.out.println("Valor de nVal.i= "+nVal.i);
        Numero nCopiaVal=nVal;//CREAMOS UNA COPIA, NO ES UNA COPIA
        System.out.println("Valoe de nCopiaVal.i"+nCopiaVal.i);
        nVal.i++;
        //IMPRIMIMOS nVal y nCopuaVal
        System.out.println("Valor de nVal= "+ nVal.i);
        System.out.println("Valor de nCopiaVal.i= "+nCopiaVal.i);
        //Imprimir objetos
        System.out.println(nVal);
        System.out.println(nCopiaVal);
        //COPIA REAL DE UN OBJETO
        Numero nCopiaReal = new Numero();
        nCopiaReal.i = nVal.i;
        System.out.println("Valor de nVal.i =" + nVal.i);
        System.out.println("Valor de nCopiaReal.i =" + nCopiaReal.i);
        
    }
    
}
class Numero{
    public int i= 10;
    
    
}
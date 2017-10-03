/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 16550558 Eduardo Alvardo
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MiClasePrubea nuevo = new MiClasePrubea();
        nuevo.imprimirmensaje();
        System.out.println(nuevo.sNom);
        MiClasePrubea2.imprimirmensaje();
        System.out.println(MiClasePrubea2.sNom);
    }
    
}

/*
    ventajas y uso de "static"
    explicaciones de memoria estatica y dinamica
*/

class MiClasePrubea{
    public String sNom = "Eduardo";
    public void imprimirmensaje(){        
        System.out.println("Hola Mundo!!");
    }
}
class MiClasePrubea2{
    public static String sNom = "Eduardo";
    public static void imprimirmensaje(){        
        System.out.println("Hola Mundo!!");
    }
}


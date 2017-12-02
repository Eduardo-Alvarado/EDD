/*
 * Practica 4
 * Edaurdo Alvarado 16550558
 * Aprendiendo ciclos recursivos y sus utilidades
 */
public class Principal 
{
    public static void main(String[] args) 
    {
        int n=1, z=0;
        /*for (int i = 1; i <= 10; i++) 
        {
            System.out.println("Cadena: " + cadenaRecursiva(i));
        }
        System.out.println("Cadena: " + cadenaRecursiva(11));
        for (int i = 10; i >= 1; i--) 
        {
            System.out.println("Cadena: " + cadenaRecursiva(i));
        }*/
        while(n!=0)
        {
            if(n<10 && z==0)
            {
                System.out.println("Cadena: " + cadenaRecursiva(n));
                n++;
            }
            if(n==10 && z==0)
            {
                System.out.println("Cadena: " + cadenaRecursiva(n));
                z=1;
                n=9;
            }                                           
            if(z==1)
            {
                System.out.println("Cadena: " + cadenaRecursiva(n));
                n--;
            }
        }
    }
    public static String cadenaRecursiva(int iNum)
    {
        if(iNum>1)
        {
            return "*" + cadenaRecursiva(iNum-1);
        }
        else
        {
            return "*";
        }
    }
}

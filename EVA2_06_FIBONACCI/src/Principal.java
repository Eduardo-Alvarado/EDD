/*
 * Practica 6
 * Edaurdo Alvarado 16550558
 * Recursion para serie de Fibonacci "n" veces
 */
public class Principal 
{
    public static void main(String[] args) 
    {
        for (int i = 0; i <= 10; i++) 
        {
            System.out.println("fibonacci " + i + ":  " + fibo(i));
        }
    }
    public static int fibo(int vez)
    {
        if(vez==1)
        {
            return 1;
        }
        if( vez==0)
        {
            return 0;
        }
        if(vez>1)
        {
            return fibo(vez-1) + fibo(vez-2);
        }
        return 0;
    }
}

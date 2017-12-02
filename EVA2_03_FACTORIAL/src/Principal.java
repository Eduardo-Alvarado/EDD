/*
 * Practica 3
 * Eduardo Alvarado 16550558
 * Aprendiendo recursion con un metodo factorial
 */
public class Principal 
{
    public static void main(String[] args) 
    {
        System.out.println(factorial(5));
    }
    public static int factorial(int x)
    {
        if(x>0)
        {
            return x*factorial((x-1));
        }
        else
            return 1;
    }
}

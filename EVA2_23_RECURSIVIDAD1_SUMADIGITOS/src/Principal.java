/*
 * Practica 23
 * Edaurdo Alvarado 16550558
 * Practica 1 de recursividad, sumar digitos de un numero entero
 */
public class Principal 
{
    public static void main(String[] args) 
    {
        int n=123456789;
        System.out.println("La suma de los digitos es: " + suma(n));
    }
    public static int suma(int num)
    {
        if (num == 0) 
        {     
            return num;
        }
        else 
        {
            return suma(num/10)+(num%10);
        }
    }
}
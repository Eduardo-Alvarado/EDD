/*
 * Practica 25
 * Edaurdo Alvarado 16550558
 * Practica 3 de recursividad, elevar un numero a n potencia
 */
public class Principal 
{
    public static void main(String[] args) 
    {
        int n=3,i=3;
        System.out.println(potencia(n,i));
    }
    public static int potencia(int num, int pot)
    {
        if(pot==1)
        {
            return num;
        }
        else
        {
            pot--;
            return  num*potencia(num,pot);
        }
    }
}

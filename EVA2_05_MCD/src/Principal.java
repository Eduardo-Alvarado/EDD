/*
 * Practica 5
 * Edaurdo Alvarado 16550558
 * Recursion para obtener el MCD de dos numeros cualquiera
 */
public class Principal 
{
    public static void main(String[] args) 
    {
        gcd(180,48);
        System.out.println(gcd(180,48));
    }
    public static int gcd (int iDend, int iDsor)
    {
        if(iDsor == 0)
        {
            return iDend;
        }
        else
        {
            int iResi;
            iResi = iDend % iDsor;
            return gcd(iDsor, iResi);
        }
    }
}

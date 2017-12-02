/*
 * Practica 2
 * Eduardo Alvarado 16550558
 * Emular un "FOR" usando recursion
 */
public class Principal 
{
    public static void main(String[] args) 
    {
        for (int i = 5; i >= 1; i--) 
        {
            System.out.println("i = " + i);
        }
        FalsoForDown(10);
        System.out.println();
        FalsoForUp(1,10);
    }
    public static void FalsoForDown(int x)
    {
        if(x>=1)
        {
            System.out.print(x + " - ");
            FalsoForDown((x-1));
        }
    }
    public static void FalsoForUp(int x,int y)
    {
        if(x<=y)
        {
            System.out.print(x + " - ");
            FalsoForUp((x+1),y);
        }
    }
}

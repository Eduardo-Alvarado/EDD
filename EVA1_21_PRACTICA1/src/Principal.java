import static java.lang.Math.sqrt;
import java.util.Scanner;
/*
 * @author 16550558
 */
public class Principal 
{
    public static void main(String[] args) 
    {
        int x,max=0,moda=0;
        double prom=0,des=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese tamaño deseado del arreglo: ");
        x=sc.nextInt();
        int arr[] = new int[x];
        System.out.println("Ingrese datos del arreglo: ");
        for (int i = 0; i < x; i++) 
        {
            arr[i] = sc.nextInt();
            prom+=arr[i];
        }
        prom=(prom/x);
        for(int i=0; i<x; i++)
        {
            des=((arr[i]-prom)*(arr[i]-prom))+des;
            int Rep = 0;
            for(int j=0; j<x; j++)
            {
                if(arr[i] == arr[j])
                Rep++;
            }
            if(Rep > max)
            {
                moda = arr[i];
            }
        }
        des=(des/x);
        des=(double)sqrt(des);
        System.out.println("Media: " + prom + "\n" + "Moda: " + moda + "\n" + "Desviacion: " + des);
    }
}    




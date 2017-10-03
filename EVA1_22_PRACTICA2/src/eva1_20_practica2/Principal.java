package eva1_20_practica2;

/**
 * @author 16550558
 */
public class Principal 
{
    public static void main(String[] args) 
    {
        int x[][] = new int [10][10];
        int c=0;
        for (int i = 0; i < 10; i++) {
            x[c][c] = 1;
            c++;
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("[ " + x[i][j] + " ]");
            }
            System.out.println();
        }
    }
    
}

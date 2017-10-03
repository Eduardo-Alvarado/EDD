/*
 * @author 16550558
 */
public class Principal 
{
    public static void main(String[] args) 
    {
        int x[][] = new int [5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                x[i][j] = (int)(Math.random() * 100 ) +1;
                System.out.print("[ " + x[i][j] + " ]");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 4; i >= 0; i--) {
            for (int j = 4; j >= 0; j--) {
                System.out.print("[ " + x[i][j] + " ]");
            }
            System.out.println();
        }
    }
    
}

/**
 * @author 16550558
 */
public class Principal 
{
    public static void main(String[] args) 
    {
        double x[][]=new double [5][5];
        double y[][]=new double [5][5];
        double z[][]=new double [5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                x[i][j] = (double)(Math.random() * 10 ) +1;
                y[i][j] = (double)(Math.random() * 10 ) +1;
                z[i][j] = ((x[i][j])*(y[i][j]));
                System.out.print("[ " + z[i][j] + " ]");
            }
        }
    }
    
}

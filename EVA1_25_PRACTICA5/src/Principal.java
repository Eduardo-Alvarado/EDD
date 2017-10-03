
import java.util.Scanner;

/*
 * @author EDUARDO
 */
public class Principal 
{
    public static void main(String[] args) 
    {
        int mes[] = {1,2,3,4,5,6,7,8,9,10,11,12,13};
        int dato[] = {1,2,3,4,5,6,7,8,9,10};
        double inf[][] = new double[13][10];
        int x,y;
        Scanner sc = new Scanner(System.in);
        System.out.println("Que desea buscar?");
        System.out.println("Ingrese el numero que contenga la opcion que desea");
        System.out.println("primero el mes, seguido el dato sobre temperatura");
        System.out.println("1:Enero    2:Febrero    3:Marzo    4:Abril \n "
                         + "5:Mayo    6:Junio    7:Julio    8:Agosto \n "
                         + "9:Septiembre    10:Octubre    11:Noviembre    12:Diciembre "
                         + "\n 13:Por Año");
        System.out.println("1:Mas Alta    2:Priomedio Alto    \n"
                         + "3:Promedio Diario    4:Promedio Bajo \n "
                         + "5:Mas Baja    6:Promedio de Precipitaciones (mm)    \n"
                         + "7:Promedio de Precipitaciones (dias)    8:Promedio de Nieve (dias) \n "
                         + "9:Promedio de Humedad    10:Promedio de horas de sol");
        System.out.println("mes: ");
        x=sc.nextInt();
        System.out.println("dato: ");
        y=sc.nextInt();
        inf [0][0]=30.0;
        inf [0][1]=18.1;
        inf [0][2]=10.1;
        inf [0][3]=2.0;
        inf [0][4]=-12.8;
        inf [0][5]=9.9;
        inf [0][6]=2.5;
        inf [0][7]=0.30;
        inf [0][8]=55;
        inf [0][9]=185;
        inf [1][0]=32.0;
        inf [1][1]=21.2;
        inf [1][2]=12.9;
        inf [1][3]=4.5;
        inf [1][4]=-18.0;
        inf [1][5]=3.7;
        inf [1][6]=1.6;
        inf [1][7]=0.18;
        inf [1][8]=49;
        inf [1][9]=204;
        inf [2][0]=34.0;
        inf [2][1]=24.2;
        inf [2][2]=15.7;
        inf [2][3]=7.1;
        inf [2][4]=-5.8;
        inf [2][5]=7.7;
        inf [2][6]=1.5;
        inf [2][7]=0.09;
        inf [2][8]=39;
        inf [2][9]=254;
        inf [3][0]=38.8;
        inf [3][1]=27.9;
        inf [3][2]=19.2;
        inf [3][3]=10.4;
        inf [3][4]=-3.4;
        inf [3][5]=12.9;
        inf [3][6]=2.5;
        inf [3][7]=0.09;
        inf [3][8]=37;
        inf [3][9]=278;
        inf [4][0]=39.6;
        inf [4][1]=32.2;
        inf [4][2]=23.6;
        inf [4][3]=14.9;
        inf [4][4]=3.8;
        inf [4][5]=26.1;
        inf [4][6]=4.0;
        inf [4][7]=0.00;
        inf [4][8]=37;
        inf [4][9]=299;
        inf [5][0]=41.4;
        inf [5][1]=34.0;
        inf [5][2]=26.3;
        inf [5][3]=18.6;
        inf [5][4]=6.1;
        inf [5][5]=34.7;
        inf [5][6]=6.7;
        inf [5][7]=0.00;
        inf [5][8]=42;
        inf [5][9]=273;
        inf [6][0]=41.6;
        inf [6][1]=32.1;
        inf [6][2]=25.6;
        inf [6][3]=19.1;
        inf [6][4]=10.6;
        inf [6][5]=49.7;
        inf [6][6]=11.4;
        inf [6][7]=0.00;
        inf [6][8]=53;
        inf [6][9]=240;
        inf [7][0]=39.2;
        inf [7][1]=30.3;
        inf [7][2]=24.3;
        inf [7][3]=18.2;
        inf [7][4]=10.0;
        inf [7][5]=89.3;
        inf [7][6]=12.0;
        inf [7][7]=0.00;
        inf [7][8]=61;
        inf [7][9]=242;
        inf [8][0]=39.0;
        inf [8][1]=29.2;
        inf [8][2]=22.6;
        inf [8][3]=16.0;
        inf [8][4]=3.7;
        inf [8][5]=66.4;
        inf [8][6]=8.0;
        inf [8][7]=0.00;
        inf [8][8]=61;
        inf [8][9]=229;
        inf [9][0]=35.0;
        inf [9][1]=26.8;
        inf [9][2]=18.7;
        inf [9][3]=10.7;
        inf [9][4]=-2.4;
        inf [9][5]=21.6;
        inf [9][6]=4.0;
        inf [9][7]=0.00;
        inf [9][8]=56;
        inf [9][9]=238;
        inf [10][0]=34.6;
        inf [10][1]=21.9;
        inf [10][2]=13.7;
        inf [10][3]=5.5;
        inf [10][4]=-6.1;
        inf [10][5]=8.7;
        inf [10][6]=2.0;
        inf [10][7]=0.50;
        inf [10][8]=55;
        inf [10][9]=191;
        inf [11][0]=29.0;
        inf [11][1]=18.2;
        inf [11][2]=10.3;
        inf [11][3]=2.4;
        inf [11][4]=-11.5;
        inf [11][5]=9.9;
        inf [11][6]=2.3;
        inf [11][7]=0.88;
        inf [11][8]=57;
        inf [11][9]=174;
        inf [12][0]=41.6;
        inf [12][1]=26.3;
        inf [12][2]=18.6;
        inf [12][3]=10.8;
        inf [12][4]=-18.0;
        inf [12][5]=385.7;
        inf [12][6]=58.4;
        inf [12][7]=2.04;
        inf [12][8]=50;
        inf [12][9]=2807;
        System.out.println("Resultado: " + inf[(x-1)][(y-1)]);
    }
    
}

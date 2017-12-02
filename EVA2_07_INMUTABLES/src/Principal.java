/*
 * Practica 7
 * Edaurdo Alvarado 16550558
 * Metodo torpe e ineficiente para cambiar el tamaño a un arreglo (se ocupa un vector)
 */
public class Principal 
{
    public static void main(String[] args) 
    {
        int[] aiDatos = new int[3];
        aiDatos[0] = 100;
        aiDatos[1] = 200;
        aiDatos[2] = 300;
        int i=0;
        int[] aiBackUp = new int [3];
        
        for (int aiDato : aiDatos) 
        {
            System.out.println(aiDato);
            aiBackUp[i] = aiDato;
            i++;
        }
        aiDatos = new int[4];
        for (int j = 0; j < aiBackUp.length; j++) 
        {
            aiDatos[j] = aiBackUp[j];
        }
        for (int b : aiDatos) 
        {
            System.out.println(b);
        }
    }
}

/*
 * Practica 8
 * Edaurdo Alvarado 16550558
 * Creando nodos y trabajando entre ellos (inicios de vectores)
 */
public class Principal 
{
    public static void main(String[] args) 
    {
        nodo nObj = new nodo();
        nObj.iVal = 100;
        nodo nObj2 = new nodo();
        nObj2.iVal = 200;
        nodo nObj3 = new nodo();
        nObj3.iVal = 300;
        nObj.nSig = nObj2;
        nObj2.nSig = nObj3;
        nodo nMover = nObj;
        while(nMover != null)
        {
            System.out.println(nMover.iVal);
            nMover = nMover.nSig;
        }
    }
}
class nodo
{
    public int iVal;
    public nodo nSig;
    public nodo()
    {
    nSig = null;
    }
}
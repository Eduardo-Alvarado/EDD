import java.util.logging.Level;
import java.util.logging.Logger;
/*
 * Practica 20
 * Edaurdo Alvarado 16550558
 * Practica de arboles y sus metodos a mano
 */
public class Principal 
{
    public static void main(String[] args) 
    {
        try 
        {
            Arbol Palmera = new Arbol();
            Palmera.agegarNuevoNodo(new nodo(100));
            Palmera.agegarNuevoNodo(new nodo(105));
            Palmera.agegarNuevoNodo(new nodo(97));
            Palmera.agegarNuevoNodo(new nodo(87));
            Palmera.agegarNuevoNodo(new nodo(101));
            Palmera.agegarNuevoNodo(new nodo(114));
            Palmera.agegarNuevoNodo(new nodo(99));
            System.out.println("Palmera PreOrden: ");
            Palmera.imprimirPreOrden();
            System.out.println("");
            System.out.println("Palmera InOrden: ");
            Palmera.imprimirInOrder();
            System.out.println("");
            System.out.println("Palmera PosOrden: ");
            Palmera.imprimirPosOrden();
        } catch (Exception ex) 
        {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
class nodo
{
    private int iVal;
    private nodo nIzq;
    private nodo nDer;
    public nodo() 
    {
        iVal=0;
        nIzq=null;
        nDer=null;
    }
    public nodo(int iVal) 
    {
        this.iVal = iVal;
        nIzq=null;
        nDer=null;
    }
    public int getiVal() 
    {
        return iVal;
    }
    public void setiVal(int iVal) 
    {
        this.iVal = iVal;
    }
    public nodo getnIzq() 
    {
        return nIzq;
    }
    public void setnIzq(nodo nIzq) 
    {
        this.nIzq = nIzq;
    }
    public nodo getnDer() 
    {
        return nDer;
    }
    public void setnDer(nodo nDer) 
    {
        this.nDer = nDer;
    }
}
class Arbol
{
    private nodo nRoot;
    public Arbol()
    {
        nRoot=null;
    }
    public Arbol(nodo nNodo)
    {
        nRoot=nNodo;
    }
    public void agegarNuevoNodo(nodo nNodo)throws Exception
    {
        agregarNodo(nRoot, nNodo);
    }
    public void agregarNodo(nodo nActual, nodo nNodo)throws Exception
    {
        if(nRoot==null)
        {
            nRoot=nNodo;
        }
        else
        {
            if(nNodo.getiVal()<nActual.getiVal())
            {
                if(nActual.getnIzq()==null)
                {
                    nActual.setnIzq(nNodo);
                }
                else
                {
                    agregarNodo(nActual.getnIzq(),nNodo);
                }
            }
            else if(nNodo.getiVal()>nActual.getiVal())
            {
                if(nActual.getnDer()==null)
                {
                    nActual.setnDer(nNodo);
                }
                else
                {
                    agregarNodo(nActual.getnDer(),nNodo);
                }
            }
            else
            {
                throw new Exception("NO SE ACEPTAN NUMEROS REPETIDOS");
            } 
        }
    }
    public void imprimirPreOrden()
    {
        impPreO(nRoot);
    }
    public void impPreO(nodo nActual)
    {
        if(nActual != null){
            System.out.print(nActual.getiVal()+" - ");
            impPreO(nActual.getnIzq());
            impPreO(nActual.getnDer());
        }
    }
    public void imprimirInOrder()
    {
        impIO(nRoot);
    }
     public void impIO(nodo nActual) 
    {
        if(nActual!=null)
        {
            impIO(nActual.getnIzq());
            System.out.print(nActual.getiVal()+" - ");
            impIO(nActual.getnDer());
        }           
    }
    public void imprimirPosOrden()
    {
        impPosO(nRoot);
    }
    public void impPosO(nodo nActual)
    {
        if(nActual!=null)
        {
            impPosO(nActual.getnIzq());
            impPosO(nActual.getnDer());
            System.out.print(nActual.getiVal()+" - ");
        }
    }
}

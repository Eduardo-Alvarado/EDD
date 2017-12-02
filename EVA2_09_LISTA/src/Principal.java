import static java.lang.System.exit;
import java.util.logging.Level;
import java.util.logging.Logger;
/*
 * Practica 9
 * Edaurdo Alvarado 16550558
 * Listas y sus metodos a mano
 */
public class Principal 
{
    public static void main(String[] args) 
    {
        Lista ldeMiLista = new Lista();
        for (int i = 0; i < 10; i++) { 
            ldeMiLista.agregarNodo(new Nodo((int)(Math.random()*100)+1));
        }
        ldeMiLista.imprimirElementos();
        ldeMiLista.agregarNodo(new Nodo(1234));
        System.out.println("");
        ldeMiLista.imprimirElementos();
        ldeMiLista.Tamaño();
        ldeMiLista.valor(5);
        ldeMiLista.Busca(1234);
        ldeMiLista.Tamaño();
        ldeMiLista.remove(5);
        ldeMiLista.imprimirElementos();
        System.out.println("");
        ldeMiLista.isEmpty();
        ldeMiLista.insertar(7, new Nodo(77));
        ldeMiLista.imprimirElementos();
        ldeMiLista.Vaciado();
        System.out.println("");
        ldeMiLista.isEmpty();
    }
}
class Nodo
{
    private int iVal;
    private Nodo nSig;
    public Nodo()
    {
        iVal=0;
        nSig= null;
    }
    public Nodo(int iValor)
    {
        iVal=iValor;
        nSig= null;
    }
    public Nodo(int iVal, Nodo nod)
    {
        iVal=iVal;
        nSig= nod;
    }
    public int getiVal() 
    {
        return iVal;
    }
    public void setiVal(int iVal) 
    {
        this.iVal = iVal;
    }
    public Nodo getnSig() 
    {
        return nSig;
    }
    public void setnSig(Nodo nSig) 
    {
        this.nSig = nSig;
    }
}

class Lista{
    Nodo nIni;
    Nodo nFin;
    int cont=0;
    public Lista()
    {
        nIni = null;
        nFin = null;
    }
    public Lista(Nodo nNodo)
    {
        nIni = nNodo;
        nFin = nNodo;
    }
    public void agregarNodo(Nodo nNodo)
    { //NO VOLVER A USAR JAMAS!!!!!
        //MOVERNOS AL FINAL DE LA LISTA
        Nodo nTemp= nIni;
        if(nIni== null)
        {
            nIni= nNodo;//SOLO CUANDO LAS LISTA ESTA VACIA
            cont++;
        }
        else
        {
            while(nTemp.getnSig() != null)
            {
                nTemp= nTemp.getnSig();
            }
            nTemp.setnSig(nNodo);
            cont++;
        }
    }
    public void agregarNodoMejorado(Nodo nNodo)
    {
        if(nIni == null)
        {
        nIni = nNodo;
        nFin = nNodo;    
        cont++;
        }
        else
        {
            nFin.setnSig(nNodo);
            nFin = nNodo;
            cont++;
        }
    }
    public void valor(int n)
    {     
        Nodo nNodo = nIni;
        for (int i = 0; i < (n-1); i++) {
            nNodo = nNodo.getnSig();
        }
        System.out.println("El Valor en la posicion " + n + " es de: " + nNodo.getiVal());
    }
    public void imprimirElementos()
    {
        Nodo nTemp = nIni;
        if(nTemp == null)
        {
            System.out.println("La lista esta vacia...");
        }
        while(nTemp != null)
        {
            System.out.print(nTemp.getiVal() + " - ");
            nTemp = nTemp.getnSig();
        }
    }
    public void isEmpty()
    {
        if(nIni == null)
        {
            System.out.println("La lista esta vacia");
        }
        else
        {
            System.out.println("La lista contiene elementos");
        }
    }
    public void remove(int j)
    {
        Nodo nNodo = nIni;
        if(j==1)
        {
            nIni=nNodo.getnSig();
            cont--;
        }
        else
        {
            for (int i = 0; i < (j-2); i++) 
            {
                nNodo = nNodo.getnSig();
            }
            nNodo.setnSig(nNodo.getnSig().getnSig());
            cont--;
        }       
    }
    public void Vaciado()
    {
        nIni = null;
        cont=0;
    }
    public void Tamaño()
    {
        System.out.println("El tamaño de la lista es de: " + cont);
    }
    public void Busca(int j)
    {
        Nodo nNodo=nIni;
        int cuenta=1;
        while(nNodo!=nFin)
        {
            if(j==nNodo.getiVal())
            {
                System.out.println("El valor: " + j + " se encuentra en la posicion: " + cuenta);
                nNodo=null;
            }
            if(null!=nNodo)
            {
                if(nNodo.getnSig()==nFin)
                {
                    nNodo = nNodo.getnSig();
                    if(j==nNodo.getiVal())
                    {
                        cuenta++;
                        System.out.println("El valor: " + j + " se encuentra en la posicion: " + cuenta);
                        nNodo=null;
                    }
                    if(nNodo!=null)
                    {
                        System.out.println("El valor que busca no existe");
                    }                   
                }
            }
            if(nNodo!=null)
            {
                nNodo = nNodo.getnSig();
                cuenta++;

            }
            if(nNodo==null)
            {
                nNodo=nFin;
            }
        }        
    }
    public void insertar(int j, Nodo nIns)
    {
        Nodo nNodo = nIni;
        if(j==1)
        {
            nIni=nNodo.getnSig();
            nIns.setnSig(nNodo);
            nIni=nIns;
            cont++;
        }
        else
        {
            for (int i = 0; i < (j-2); i++) 
            {
                nNodo = nNodo.getnSig();
            }
            nIns.setnSig(nNodo.getnSig());
            nNodo.setnSig(nIns);
            cont++;
        } 
    }
}
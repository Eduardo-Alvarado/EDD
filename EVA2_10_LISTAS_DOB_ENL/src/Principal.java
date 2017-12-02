/*
 * Practica 10
 * Edaurdo Alvarado 16550558
 * Listas doblemente enlazadas y sus metodos a mano
 */
public class Principal 
{
    public static void main(String[] args) 
    {
        ListaDE ldeMiLista = new ListaDE();
        for (int i = 0; i < 10; i++) 
        { 
            ldeMiLista.agregarNodo(new Nodo((int)(Math.random()*100)+1));
        }
        ldeMiLista.agregarNodo(new Nodo(123));
        System.out.println("");
        ldeMiLista.imprimirElementos();
        System.out.println("");
        ldeMiLista.imprimirElementosInv();
        System.out.println("");
        ldeMiLista.Tamaño();
        System.out.println("");
        ldeMiLista.isEmpty();
        System.out.println("");
        ldeMiLista.remove(11);
        System.out.println("");
        ldeMiLista.imprimirElementos();
        System.out.println("");
        ldeMiLista.Tamaño();
        System.out.println("");
        ldeMiLista.Busca(45);
        System.out.println("");
        ldeMiLista.insertar(4, new Nodo(321));
        System.out.println("");
        ldeMiLista.imprimirElementos();
        System.out.println("");
        ldeMiLista.Vaciado();
        System.out.println("");
        ldeMiLista.isEmpty();
        System.out.println("");
        ldeMiLista.Tamaño();
        System.out.println("");
        ldeMiLista.imprimirElementos();
        System.out.println("");
    }
}
class Nodo
{
    private int iVal;
    private Nodo nPrev;
    private Nodo nSig;
    public Nodo()
    {
        iVal=0;
        nPrev = null;
        nSig = null;
    }
    public Nodo(int inum)
    {
        iVal=inum;
        nPrev = null;
        nSig = null;
    }
    public int getiVal() 
    {
        return iVal;
    }
    public void setiVal(int iVal) 
    {
        this.iVal = iVal;
    }
    public Nodo getnPrev() 
    {
        return nPrev;
    }
    public void setnPrev(Nodo nPrev) 
    {
        this.nPrev = nPrev;
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
class ListaDE
{
    Nodo nIni;
    Nodo nFin;
    int cont=0;
    public ListaDE()
    {
        nIni = null;
        nFin = null;
    }
    public ListaDE(Nodo nNodo)
    {
        nIni = nNodo;
        nFin = nNodo;
    }
    public void agregarNodo(Nodo nNodo)
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
            nNodo.setnPrev(nFin);
            nFin = nNodo;
            cont++;
        }
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
    public void imprimirElementosInv()
    {
        Nodo nTemp = nFin;
        if(nTemp == null)
        {
            System.out.println("La lista esta vacia...");
        }
        while(nTemp != null)
        {
            System.out.print(nTemp.getiVal() + " - ");
            nTemp = nTemp.getnPrev();
        }
    }
    public void valor(int n)
    {     
        Nodo nNodo = nIni;
        for (int i = 0; i < (n-1); i++) 
        {
            nNodo = nNodo.getnSig();
        }
        System.out.println("El Valor en la posicion " + n + " es de: " + nNodo.getiVal());
    }
    public void isEmpty()
    {
        if(nIni == null)
        {
            System.out.println("La lista esta vacia");
        }else{
            System.out.println("La lista contiene elementos");
        }
    }
    public void remove(int j)
    {
        Nodo nNodo = nIni;
        Nodo nOtro;
        if(j>cont || j<1)
        {
            System.out.println("El valor a remover no existe");
        }
        if(j==1)
        {
            nIni=nNodo.getnSig();
            cont--;
        }
        if(j==cont)
        {
            nNodo=nFin.getnPrev();
            nNodo.setnSig(null);
            nFin=nNodo;
            cont--;
        }
        if(cont>=j)
        {  
            for (int i = 0; i < (j-1); i++) 
            {
                nNodo = nNodo.getnSig();
            }
            nOtro = nNodo;
            nOtro = nOtro.getnPrev();
            nNodo = nNodo.getnSig();
            nOtro.setnSig(nNodo);
            nNodo.setnPrev(nOtro);
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
        int contador=1, o=0;
        Nodo nNodo=nIni;
        Nodo nOtro;
        if(j==1)
        {
            nIns.setnSig(nIni.getnSig());
            nIns.setnPrev(null);
            nIni=nIns;
            cont++;
            o++;
        }
        if(j==cont)
        {
            nIns.setnPrev(nFin);
            nIns.setnSig(null);
            nFin.setnSig(nIns);
            nFin=nIns;
            cont++;
            o++;
        }
        if(j>cont || j<1)
        {
            System.out.println("Pon un valor valido");
            o++;
        }
        while(contador<j && j!=1 && j!=cont && j<cont && j>0)
        {
            nNodo=nNodo.getnSig();
            contador++;
        }   
        if(o==0)
        {
            nOtro=nNodo;
            nNodo = nNodo.getnPrev();
            nIns.setnSig(nOtro);
            nIns.setnPrev(nNodo);
            nNodo.setnSig(nIns);
            nOtro.setnPrev(nIns);
            cont++;
        }   
    }
}
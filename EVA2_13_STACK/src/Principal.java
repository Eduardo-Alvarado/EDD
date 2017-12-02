/*
 * Practica 13
 * Edaurdo Alvarado 16550558
 * pilas y sus metodos a mano
 */
public class Principal 
{
    public static void main(String[] args)
    {
        Stack FiladeSuper = new Stack();
        FiladeSuper.push(new Nodo(1));
        FiladeSuper.push(new Nodo(2));
        FiladeSuper.push(new Nodo(3));
        FiladeSuper.push(new Nodo(4));
        FiladeSuper.imprimirElementos();
        System.out.println("");
        System.out.println(FiladeSuper.peek());
        FiladeSuper.Tamaño();
        System.out.print(FiladeSuper.pop());
        System.out.println("");
        FiladeSuper.imprimirElementos();
        System.out.println("");
        System.out.println(FiladeSuper.pop());
        FiladeSuper.imprimirElementos();
        System.out.println("");
        FiladeSuper.Tamaño();
        FiladeSuper.Vaciado();
        FiladeSuper.isEmpty();
        FiladeSuper.imprimirElementos();
    } 
}
 class Nodo
{
    private int iVal;
    private Nodo nPrev;
    private Nodo nSig;
    public Nodo(){
        iVal=0;
        nPrev = null;
        nSig = null;
    }
    public Nodo(int inum){
        iVal=inum;
        nPrev = null;
        nSig = null;
    }

    public int getiVal() {
        return iVal;
    }

    public void setiVal(int iVal) {
        this.iVal = iVal;
    }

    public Nodo getnPrev() {
        return nPrev;
    }

    public void setnPrev(Nodo nPrev) {
        this.nPrev = nPrev;
    }

    public Nodo getnSig() {
        return nSig;
    }

    public void setnSig(Nodo nSig) {
        this.nSig = nSig;
    }

}
class Stack{
    Nodo nIni;
    Nodo nFin;
    int cont=0;
    public Stack(){
        nIni = null;
        nFin = null;
    }
    public Stack(Nodo nNodo){
        nIni = nNodo;
        nFin = nNodo;
    }
    public int peek()
    {       
        if(nFin!=null)
        {
            return nFin.getiVal();
        }
        else
        {
            return -1;
        }
    }
    public int pop()
    {
        if(nFin!=null)
        {
            Nodo nTemp;
            int c=nFin.getiVal();
            nTemp=nFin.getnPrev();
            nTemp.setnSig(null);
            nFin=nTemp;
            cont--;
            return c;
        }
        else
        {
            return -1;
        }
    }
    public void push(Nodo nNodo)
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
    public void Tamaño()
    {
        System.out.println("El tamaño de la Pila es de: " + cont);
    }
    public void Vaciado()
    {
        nIni = null;
        cont=0;
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
}
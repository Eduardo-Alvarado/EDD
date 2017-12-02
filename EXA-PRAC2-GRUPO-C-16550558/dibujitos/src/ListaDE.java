/*
como en las practicas pasadas se crea una clase para manejar la lista como el
ejemplo visto en clase.
fuera de nuestro JFrame para tener un codigo mas limpio.
*/
class ListaDE {
//nodos "Centinelas"
        Nodo nIni;
        Nodo nFin;
//constructores
    public ListaDE(){
        nIni = null;
        nFin = null;
    }
    public ListaDE(Nodo nNodo){
        nIni = nNodo;
        nFin = nNodo;
    }
//funciones a utilizar (vistas en clase)
    public void agregarNodo(Nodo nNodo){
        if(nIni == null){
        nIni = nNodo;
        nFin = nNodo;    
        }else{
            nFin.setnSig(nNodo);
            nNodo.setnPrev(nFin);
            nFin = nNodo;
        }
    }
    public void Vaciado(){
        nIni = null;
    }
}

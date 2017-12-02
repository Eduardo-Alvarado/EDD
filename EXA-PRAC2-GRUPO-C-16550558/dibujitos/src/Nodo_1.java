/*
como en las practicas pasadas se crea una clase nodo para recibir dos variables,
las coordenadas en X y en Y de cada punto hecho en el dibujo.
fuera de nuestro JFrame para tener un codigo mas limpio.
*/
class Nodo {
//las variables que recibira nuestro nodo, las coordenadas 
    private int PosX,PosY; 
//referencias vistas en clase
    private Nodo nPrev; 
    private Nodo nSig;
//constructores
    public Nodo(){
        PosX=0;
        PosY=0;
        nPrev = null;
        nSig = null;
    }
    public Nodo(int x, int y){
        PosX=x;
        PosY=y;
        nPrev = null;
        nSig = null;
    }
//get adn set
    public int getPosX() {
        return PosX;
    }
    public void setPosX(int PosX) {
        this.PosX = PosX;
    }
    public int getPosY() {
        return PosY;
    }
    public void setPosY(int PosY) {
        this.PosY = PosY;
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

package Arboles;
public class NodoAVL<B> {
  private B data;
  int Factbalance;
  NodoAVL Derecho;
  NodoAVL Izquierdo;
  
  public NodoAVL(B data) { this.data = data;
    Factbalance = 0;
    Derecho = null;
    Izquierdo = null;
  }
  
  public B getData() { return data; }
}
package Arboles;
//Nodo splay
class NodoSplay <B>{
  private B datos;
  NodoSplay Hiz;
  NodoSplay Hde;
  
  public NodoSplay (B data){
	    datos = data;
	    Hiz = null;
	    Hde = null;
	  }
  public B getData(){
      return  datos;
  }
  public void setData(B data){
      datos = data;
  }
  
  
  
}
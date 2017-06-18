package Arboles;
import java.io.*;



//Definicion del arbol splay	
public class Splay<B>{
  int cont;
  String codigot;
  NodoSplay raiz;
  NodoSplay auxp;
  NodoSplay auxh;
  boolean bandera = true;
  String searchresult = "";
    
  //Contructor
  public Splay(){
    raiz = null;
  }
  //Inserta un elemento en un arbol splay
  public NodoSplay Insertar (B data){
	    try{
	      FileWriter fw = new FileWriter (codigot+".txt", true);
	      BufferedWriter bw = new BufferedWriter (fw);
	      PrintWriter salida = new PrintWriter (bw);
	      salida.println("Elemento: " + data);
	      salida.close();
	      if (raiz == null)
	        raiz = new NodoSplay (data);
	      else{
	        auxp = null;
	        auxh = raiz;
	        while (auxh != null){
	          if (((Comparable)data).compareTo(auxh.getData()) <= 0 ){
	            auxp = auxh;
	            auxh = auxh.Hiz;
	          }
	          else{
	            auxp = auxh;
	            auxh = auxh.Hde;
	          }
	        }
	        NodoSplay nuevo = new NodoSplay (data);
	        if (((Comparable)auxp.getData()).compareTo((B)data) < 0){
	          auxp.Hde = nuevo;
	          Subir (auxp, nuevo);
	        }
	        else{
	          auxp.Hiz = nuevo;
	          Subir (auxp, nuevo);
	        }
	      }
	    }
	    catch (IOException ioex){
	    }
	return raiz;
  }

  
  //rotacion zag zag
  public void zagzag(NodoSplay abuelo){
  	try{
  		FileWriter fw = new FileWriter (codigot+".txt", true);
  		BufferedWriter bw = new BufferedWriter (fw);
  		PrintWriter salida = new PrintWriter (bw);
  		if(cont<2){
	  		salida.print("zag ");
	  		cont++;
	        NodoSplay nuevo = new NodoSplay (abuelo.getData());
	        nuevo.Hiz = abuelo.Hiz;
	        nuevo.Hde = abuelo.Hde;
	        nuevo.Hde = auxp.Hiz;
	        abuelo.Hiz = nuevo;
	        abuelo.Hde = auxp.Hde;
	        abuelo.setData(  auxp.getData());
	        if (abuelo == raiz)
	        	bandera = false;
	        auxp = abuelo;
	    }
  		else{
  			salida.println("");
  			cont=0;
  		}	
       	salida.close();
  	}
  	catch(Exception e){
  	}
  }
  
  //rotacion zag zig
  public void zagzig(NodoSplay abuelo){
  	try{
  		FileWriter fw = new FileWriter (codigot+".txt", true);
  		BufferedWriter bw = new BufferedWriter (fw);
  		PrintWriter salida = new PrintWriter (bw);
  		if(cont==1 || cont ==2)
  			salida.println("");
  		salida.println("zag zig");
       	salida.close();
       	cont=0;
       	NodoSplay nuevo = new NodoSplay (abuelo.getData());
        nuevo.Hiz = abuelo.Hiz;
        nuevo.Hde = abuelo.Hde;
        abuelo.setData( auxh.getData());
        nuevo.Hde = auxh.Hiz;
        abuelo.Hiz = nuevo;
        auxp.Hiz = auxh.Hde;
        abuelo.Hde = auxp;
        if (abuelo == raiz){
        	raiz = abuelo;
        	bandera = false;
        }
        auxh = abuelo;
        auxp = TieneAbuelo (auxh);
  	}
  	catch(Exception e){
  	}
  }
  
  //rotacion zig zig
  public void zigzig(NodoSplay abuelo){
  	try{
  		FileWriter fw = new FileWriter (codigot+".txt", true);
  		BufferedWriter bw = new BufferedWriter (fw);
  		PrintWriter salida = new PrintWriter (bw);
  		if(cont<2){
  			salida.print("zig ");
  			cont++;
  			NodoSplay nuevo = new NodoSplay (abuelo.getData());
  			nuevo.Hiz = abuelo.Hiz;
        	nuevo.Hde = abuelo.Hde;
        	nuevo.Hiz = auxp.Hde;
        	abuelo.Hde = nuevo;
        	abuelo.Hiz = auxp.Hiz;
        	abuelo.setData( auxp.getData());
        	if (abuelo == raiz)
          		bandera = false;
        	auxp = abuelo;
  		}
  		else{
  			salida.println("");
  			cont=0;
  		}	
       	salida.close();
  	}
  	catch(Exception e){
  	}
  }
  
  //rotacion zig zag
  public void zigzag(NodoSplay abuelo){
  	try{
  		FileWriter fw = new FileWriter (codigot+".txt", true);
  		BufferedWriter bw = new BufferedWriter (fw);
  		PrintWriter salida = new PrintWriter (bw);
  		if(cont==1 || cont ==2)
  			salida.println("");
  		salida.println("zig zag");
       	salida.close();
       	cont=0;
       	NodoSplay nuevo = new NodoSplay (abuelo.getData());
	  	nuevo.Hiz = abuelo.Hiz;
      	nuevo.Hde = abuelo.Hde;
      	abuelo.setData( auxh.getData());
      	nuevo.Hiz = auxh.Hde;
      	abuelo.Hde = nuevo;
      	auxp.Hde = auxh.Hiz;
      	abuelo.Hiz = auxp;
      	if (abuelo == raiz){
        	raiz = abuelo;
        	bandera = false;
      	}
      	auxh = abuelo;
      	auxp = TieneAbuelo (auxh);
  	}
  	catch(Exception e){

  	}
  }
  
  //rotacion zig
  public void zig(){
  	try{
  		FileWriter fw = new FileWriter (codigot+".txt", true);
  		BufferedWriter bw = new BufferedWriter (fw);
  		PrintWriter salida = new PrintWriter (bw);
  		if(cont==2)
        	salida.println("");
  		salida.println("zig ");
       	salida.close();
       	raiz.Hiz = auxh.Hde;
        auxh.Hde = raiz;
        raiz = auxh;
        cont=0;
  	}
  	catch(Exception e){
  		
  	}
  }
  
  //rotacion zag
  public void zag(){
  	try{
  		FileWriter fw = new FileWriter (codigot+".txt", true);
  		BufferedWriter bw = new BufferedWriter (fw);
  		PrintWriter salida = new PrintWriter (bw);
  		if(cont==2)
       		salida.println("");
  		salida.println("zag");
       	salida.close();
       	raiz.Hde = auxh.Hiz;
        auxh.Hiz = raiz;
        raiz = auxh;
        cont=0;
  	}
  	catch(Exception e){
  	}
  }
  
  //sube el recien insertado a la raiz
  public void Subir (NodoSplay padre, NodoSplay hijo){
  	  bandera=true;
  	  auxp=padre;
  	  auxh=hijo;
      while ((bandera == true) && (TieneAbuelo (auxp) != null)){
        NodoSplay abuelo = TieneAbuelo (auxp);
        //zag zag
        if ((abuelo.Hde == auxp) && (auxp.Hde == auxh)){
          zagzag(abuelo);
        }
        else{
          //zag zig
          if ((abuelo.Hde == auxp) && (auxp.Hiz == auxh)){
         	zagzig(abuelo);
          }
          else{
          	//zig zig
            if ((abuelo.Hiz == auxp) && (auxp.Hiz == auxh)){
              zigzig(abuelo);
            }
            //zig zag
            else{
              zigzag(abuelo);
            }
          }
        }
      }
      if (auxh != raiz){
      	//zag
        if (raiz.Hde == auxh){
          zag();
        }
        //zig
        else{
          zig();
        }
      }
  }
  
  //retorna el abuelo de un nieto  
  public NodoSplay TieneAbuelo (NodoSplay nodo){
    if (nodo == raiz)
      return null;
    else{
      NodoSplay padre = null;
      NodoSplay hijo = raiz;
      while (hijo != nodo){
        if (((Comparable)nodo.getData()).compareTo(hijo.getData()) <= 0){
          padre = hijo;
          hijo = hijo.Hiz;
        }
        else{
          padre = hijo;
          hijo = hijo.Hde;
        }
      }
      return padre;
    }
  }
  

  
  //elimina un elemento de un arbol splay y coloca su antecesor
  //en la raiz	
  public NodoSplay Eliminar (B codl){
    if (codl == raiz.getData()){
      NodoSplay borrado = raiz;
      if ((raiz.Hiz == null) && (raiz.Hde == null)){
        raiz = null;
        return borrado;
      }
      else{
        if ((raiz.Hiz != null) && (raiz.Hde != null)){
          NodoSplay aux = raiz;
          raiz = MayordeMenores (raiz);
          raiz.Hiz = aux.Hiz;
          raiz.Hde = aux.Hde;
          return borrado;
        }
        else{
          if (raiz.Hde != null){
            raiz = raiz.Hde;
            return borrado;
          }
          else{
            raiz = raiz.Hiz;
            return borrado;
          }
        }
      }
    }
    else{
      NodoSplay padre = null;
      NodoSplay hijo = raiz;
      while (hijo.getData() != codl){
        if (((Comparable)codl).compareTo(hijo.getData()) <= 0){
          padre = hijo;
          hijo = hijo.Hiz;
        }
        else{
          padre = hijo;
          hijo = hijo.Hde;
        }
      }
      Subir (padre, hijo);
      NodoSplay rai = raiz;
      Eliminar ((B)raiz.getData());
      return rai;
    }
  }
  
  //buscar el mayor de los menores
  public NodoSplay MayordeMenores (NodoSplay nodo){
    NodoSplay padre = nodo;
    NodoSplay aux = nodo.Hiz;
    while (aux.Hde != null){
      padre = aux;
      aux = aux.Hde;
    }
    padre.Hde = aux.Hiz;
    return aux;
  }
  
    //buscar un elemento y lo sube a la raiz
  public NodoSplay Buscar (B codl){
  
  	try{
  		FileWriter fw = new FileWriter (codigot+".txt", true);
      	BufferedWriter bw = new BufferedWriter (fw);
      	PrintWriter salida = new PrintWriter (bw);
	    if (codl == raiz.getData()){
	    	salida.println("Rotacion para busqueda: ");
	    	salida.println("Sin rotacion");
	      	salida.println("Elemento encontrado. Raiz: " + raiz.getData());
          	salida.close();
	 	}
	    else{
	      NodoSplay padre = null;
	      NodoSplay hijo = raiz;
	      salida.println("Rotacion para busqueda: ");
	      salida.close();
	      while ((hijo != null) && (hijo.getData()!= codl)){
	        if (((Comparable)codl).compareTo(hijo.getData()) <= 0){
	          padre = hijo;
	          hijo = hijo.Hiz;
	        }
	        else{
	          padre = hijo;
	          hijo = hijo.Hde;
	        }
	      }
	      if (hijo == null){
	        NodoSplay aux = TieneAbuelo (padre);
	        if (padre != raiz)
	          Subir (aux, padre);
	        FileWriter fw1 = new FileWriter (codigot+".txt", true);
      		BufferedWriter bw1 = new BufferedWriter (fw1);
	        PrintWriter salida1 = new PrintWriter (bw1);
			salida1.println("El elemento no se encuentra. Raiz: " + raiz.getData());
          	salida1.close();
	      }
	      else{
	        Subir (padre, hijo);
	        FileWriter fw2 = new FileWriter (codigot+".txt", true);
      		BufferedWriter bw2 = new BufferedWriter (fw2);
	        PrintWriter salida2 = new PrintWriter (bw2);
	        salida2.println("Elemento encontrado. Raiz: " + raiz.getData());
          	salida2.close();
	      }
	    }
	 }
	 catch(Exception e){
	 	
	 }
	 return raiz;
  }
  
  
  //buscar un elemento y lo sube a la raiz
  public NodoSplay Buscar (String codl){
  
  	try{
  		FileWriter fw = new FileWriter (codigot+".txt", true);
      	BufferedWriter bw = new BufferedWriter (fw);
      	PrintWriter salida = new PrintWriter (bw);
	    if (codl == raiz.getData()){
	    	salida.println("Rotacion para busqueda: ");
	    	salida.println("Sin rotacion");
	      	salida.println("Elemento encontrado. Raiz: " + raiz.getData());
          	salida.close();
	 	}
	    else{
	      NodoSplay padre = null;
	      NodoSplay hijo = raiz;
	      salida.println("Rotacion para busqueda: ");
	      salida.close();
	      while ((hijo != null) && (hijo.getData()!= codl)){
	        if (((Comparable)codl).compareTo(hijo.getData()) <= 0){
	          padre = hijo;
	          hijo = hijo.Hiz;
	        }
	        else{
	          padre = hijo;
	          hijo = hijo.Hde;
	        }
	      }
	      if (hijo == null){
	        NodoSplay aux = TieneAbuelo (padre);
	        if (padre != raiz)
	          Subir (aux, padre);
	        FileWriter fw1 = new FileWriter (codigot+".txt", true);
      		BufferedWriter bw1 = new BufferedWriter (fw1);
	        PrintWriter salida1 = new PrintWriter (bw1);
			salida1.println("El elemento no se encuentra. Raiz: " + raiz.getData());
          	salida1.close();
	      }
	      else{
	        Subir (padre, hijo);
	        FileWriter fw2 = new FileWriter (codigot+".txt", true);
      		BufferedWriter bw2 = new BufferedWriter (fw2);
	        PrintWriter salida2 = new PrintWriter (bw2);
	        salida2.println("Elemento encontrado. Raiz: " + raiz.getData());
          	salida2.close();
	      }
	    }
	 }
	 catch(Exception e){
	 	
	 }
	 return raiz;
  }
  

  
  
  
  //retorna si es miembro un elemento
  public boolean Miembro (String dat,NodoSplay rai){
  	raiz=rai;
    NodoSplay hijo = raiz;
    while ((hijo != null) && (hijo.getData() != dat)){
      if (((Comparable)dat).compareTo(hijo.getData()) <= 0){
        hijo = hijo.Hiz;
      }
      else{
        hijo = hijo.Hde;
      }
    }
    if (hijo == null)
      return false;
    else
      return true;
  }

  
    public String Postorden(){
        searchresult = "";
        Postorden(raiz);
        return searchresult;
    }

  
    private void Postorden(NodoSplay root){
        if(root!=null){
            Postorden (root.Hiz);
            Postorden (root.Hde);
            searchresult += root.getData()+" - ";
        }
    }  

    public String Preorden(){
        searchresult = "";
        Preorden(raiz);
        return searchresult;
    }

  
    private void Preorden(NodoSplay root){
        if(root!=null){
            searchresult += root.getData()+" - ";
            Preorden (root.Hiz);
            Preorden (root.Hde);
            
        }
    }  
    
    public String Inorden(){
        searchresult = "";
        Inorden(raiz);
        return searchresult;
    }

  
    private void Inorden(NodoSplay root){
        if(root!=null){
            Inorden (root.Hiz);
            searchresult += root.getData()+" - ";
            Inorden (root.Hde);
        }
    }  
  

  
  
}

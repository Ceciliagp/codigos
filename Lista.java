/**
 * @author UNIVERSIDAD AUTONOMA DE CAMPECHE
 * @author ISC
 * @author PACHECO CANUL CECILIA GABRIELA 4B
 */
package listasenlazadas;

public class Lista {
    
    NodoLista Primero, ultimo, aux, nuevo, ant, post;
   
    public Lista(){
        Primero = ultimo = aux = nuevo = ant = post = null;
    }
   
    public void insertarAlFrente(Object dato){
        if(Primero==null){
            Primero = new NodoLista(dato);
            ultimo=Primero;
        }
        else{
            nuevo = new NodoLista(dato);
            ultimo.Liga = nuevo;
            ultimo = nuevo;
        }despliegaLista();         
    }
   
    public void insertarAtras(Object dato){
        if(Primero==null){
            Primero = new NodoLista(dato);
            ultimo=Primero;
        }
        else{
            nuevo = new NodoLista(dato,Primero);
            Primero = nuevo;
        }despliegaLista();
    }   
   
    public void despliegaLista(){
        aux = Primero;
        System.out.println ("      "   +"LA LISTA ESTA COMPLETA");
        while (aux != null) {
            System.out.println (aux.Info);
            aux = aux.Liga;
        }
         System.out.println ("************************************************************************************************");
    }
    /////////INSERTAR ANTES DE //////////
    public void insertarAntesDe(Object DatoB,Object DatoI){
        if(Primero==null){
            System.out.println ("La lista esta vacia");
        }
        else{
            if(buscar(DatoB)== true){
                if(aux==Primero){
                nuevo= new NodoLista(DatoI,Primero);
                Primero = nuevo;
                }
                else{
                    nuevo = new NodoLista(DatoI , aux);
                    ant.Liga = nuevo;
                }
            }   
        }
        despliegaLista();
    }
    //////////////INSERTAR DESPUES DE//////////////////
    public void insertarDespuesDe(Object DatoB, Object DatoI){
        if(Primero==null){
            System.out.println ("La lista esta vacia");
        }
        else{///hay metodos
            if(buscar(DatoB)== true){
                if(aux==Primero){
                    nuevo=new NodoLista(DatoI);
                    Primero.Liga=nuevo;
                }
                else{
                    nuevo= new NodoLista(DatoI, aux.Liga);
                    aux.Liga=nuevo;
                }
               
            }
        }despliegaLista();
    }
   
    ///////////////METODO ELIMINAR NODO//////////////
    public void eliminarNodo(Object DatoB){
        if(Primero==null){
            System.out.println ("La lista esta vacia");
        }
        else{
            if(buscar(DatoB)==true){
                if(Primero==ultimo){
                    Primero=ultimo=null;
                }
                else if(aux==Primero){
                    Primero=aux.Liga;
                    aux=null;
                }
                else if(aux==ultimo){
                    ultimo=ant;
                    ultimo.Liga=null;
                    aux=null;
                }
                else{
                    ant.Liga=aux.Liga;
                    aux=null;
                }
            }
        }despliegaLista();
    }
   
    /////////////METODO PARA SUSTITUIR DATO///////////////
    public void modificaLista(Object DatoB,Object DatoI){
        if(Primero==null){
            System.out.println ("La lista esta vacia");
        }
        else{
            if(buscar(DatoB)==true){
                aux.Info=DatoI;
            }
        }despliegaLista();
    }
    //////////////////////////METODO BUSCAR/////////
    public boolean  buscar(Object DatoB){
        aux = Primero;
        boolean bandera = false;
        while (aux != null && bandera != true) {
            if(DatoB.equals(aux.Info)){
                bandera = true;
            }
            else{
                ant = aux;
                aux = aux.Liga;
                post = aux.Liga;
            }
        }
        if(bandera == true){
            return true;
        }
        else{
            System.out.println ("EL datos no existe");
            return false;
        }
    }
   
}

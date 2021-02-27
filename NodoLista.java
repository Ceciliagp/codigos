/**
 * @author UNIVERSIDAD AUTONOMA DE CAMPECHE
 * @author ISC
 * @author PACHECO CANUL CECILIA GABRIELA 4B
 */
package listasenlazadas;

public class NodoLista {
    
    Object Info;
    NodoLista Liga;
   
    public NodoLista(Object dato){
        Info = dato;
        Liga = null;
    }
    public NodoLista(Object dato, NodoLista liga){
        Info = dato;
        this.Liga = liga;  
    }                          
}

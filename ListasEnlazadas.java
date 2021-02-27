/**
 * @author UNIVERSIDAD AUTONOMA DE CAMPECHE
 * @author ISC
 * @author PACHECO CANUL CECILIA GABRIELA 4B
 */

package listasenlazadas;

import java.util.Scanner;


public class ListasEnlazadas {

    public static void main(String[] args) {
      Lista lista = new Lista();
        Integer DatoB,DatoI;
        int opcion;
        
        Scanner Teclado = new Scanner(System.in);
        
   do{
       
       System.out.println ("NOTA: Sólo puede ingresar números del 1 al 5 : ");
       
            System.out.println ("");
            System.out.println ("");
       
       
            System.out.println ("1) Insertar al frente");
            System.out.println ("2) Insertar al atrás");
            System.out.println ("3) Insertar antes de");
            System.out.println ("4) Insertar después de");
            System.out.println ("5) Eliminar dato");
            System.out.println ("6) Modificar dato");
            System.out.println ("7) Desplegar lista");
            System.out.println ("8) Salir");
            
            System.out.println ("");
            System.out.println ("");
            
            System.out.println ("Digite el numero de la opción a realizar:");
            
            
            opcion = Teclado.nextInt();
            
            System.out.println ("");
             
     switch (opcion) {
                 
                 
               case 1: System.out.println ("¿Qué dato quiere insertar al frente de la lista?");
                        DatoI = new Integer(Teclado.nextInt());
                        lista.insertarAlFrente(DatoI);
                        break;
                case 2: System.out.println ("¿Qué dato quiere insertar atrás de la lista?");
                        DatoI = new Integer(Teclado.nextInt());
                        lista.insertarAtras(DatoI);
                        break;
                case 3: System.out.println ("¿Qué dato quiere insertar antes de la lista?");
                        DatoI = new Integer(Teclado.nextInt());
                        System.out.println ("¿Atrás de que dato quiere insertar el? :"  + "    " + DatoI);
                        DatoB = new Integer(Teclado.nextInt());
                        lista.insertarAntesDe(DatoB,DatoI);
                        break;
                case 4: System.out.println ("¿Qué dato quiere insertar después de la lista?");
                        DatoI = new Integer(Teclado.nextInt());
                        System.out.println ("¿Después de que dato quiere insertar el?   :" +  "    " +DatoI);
                        DatoB = new Integer(Teclado.nextInt());
                        lista.insertarDespuesDe(DatoB,DatoI);
                        break;
                case 5: System.out.println ("¿Qué dato quiere eLiminar de la lista?");
                        DatoB = new Integer(Teclado.nextInt());
                        lista.eliminarNodo(DatoB);
                        break;
                   case 6: System.out.println ("¿Qué dato quiere buscar para sustituir?");
                           DatoB = new Integer(Teclado.nextInt());
                           System.out.println ("¿Qué dato quiere poner en el numero "  + "   " + DatoB + "    :");
                           DatoI = new Integer(Teclado.nextInt());
                           lista.modificaLista(DatoB,DatoI);
                        break;
                   case 7: lista.despliegaLista();
                        break;
                case 8: System.out.println ("\tUsted salió...\n");
                        break;                               
                default :System.out.println ("\topcion no valida intenta de nuevo\n");
            }
        }while (opcion != 8);

    }
}
            
            
            
        
        
        
        
        
    
    


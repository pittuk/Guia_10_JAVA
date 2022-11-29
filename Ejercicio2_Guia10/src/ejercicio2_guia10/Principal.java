

package ejercicio2_guia10;

//@author pittu

import Entidad.Electrodomesticos;
import Entidad.Lavadora;
import Entidad.Televisor;
import java.util.ArrayList;


public class Principal {

    public static void main(String[] args) {
      
      ArrayList<Electrodomesticos> electro=new ArrayList();
        
      
      
        //Televisor t1=new Televisor(30, true, 1500.0, "Negro", 'B', 20.0);
        /* electro.add(t1);
        Televisor t2=new Televisor(55, true, 3500.0, "verde", 'r', 81.0);
        electro.add(t2);
        Lavadora l1=new Lavadora(25, 1200.0, "Blanco", 'A', 30.0);
        electro.add(l1);
        Lavadora l2=new Lavadora(40, 1750.0, "Rosa", 'k', 40.0);
        electro.add(l2);*/
        Televisor t1=new Televisor();
        t1.crearTelevisor();
        electro.add(t1);
        Televisor t2=new Televisor();
        t2.crearTelevisor();
        electro.add(t2);
        Lavadora l1=new Lavadora();
        l1.crearLavadora();
        electro.add(l1);
        Lavadora l2=new Lavadora();
        l2.crearLavadora();
        electro.add(l2);
        
        
        int suma=0;
        for (Electrodomesticos aux : electro) {
            aux.precioFinal();
            suma+=aux.getPrecio();
        }
        int sumatv=0,sumalv=0;
        for (Electrodomesticos aux1 : electro) {
            if (aux1 instanceof Televisor) {
                //Televisor obj = (Televisor) aux1;
                sumatv+=aux1.getPrecio();
                
            }else {
            
            sumalv+=aux1.getPrecio();
            
            }
            
            
        }
        System.out.println("La suma de televisores es: "+sumatv);
        System.out.println("----------------------------");
        System.out.println("La suma de las lavadoras es: " +sumalv);
        System.out.println("----------------------------");
        System.out.println("El precio total es: " +suma);
         
         
        
       
        
        
        
        
        
        
    }

}

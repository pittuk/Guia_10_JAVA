

package manosalaobra1_guia10;

//@author pittu

import Entidad.Animal;
import Entidad.Gato;
import Entidad.Perro;
import java.util.ArrayList;


public class Principal {

    public static void main(String[] args) {
       ArrayList<Animal>animales=new ArrayList(); 
        
        
        Animal a=new Animal();
        animales.add(a);
        Animal b=new Perro();
        animales.add(b);
        Animal c=new Gato();
        animales.add(c);
        
        for (Animal aux : animales) {
            aux.hacerRuido();
        }
        
        
    }

}

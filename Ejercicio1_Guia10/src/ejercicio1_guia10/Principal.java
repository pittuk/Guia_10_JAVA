

package ejercicio1_guia10;

//@author pittu

import Entidad.Animal;
import Entidad.Caballo;
import Entidad.Gato;
import Entidad.Perro;
import java.util.ArrayList;


public class Principal {

    public static void main(String[] args) {
       ArrayList<Animal>animales=new ArrayList(); 
        
        //declaramos 1 perro
        Animal perro1=new Perro("Chiquito", "Dog-Show", 5, "Pastor Aleman");
        perro1.Alimentarse();
        
        //declaramos 2 perro
        Animal perro2=new Perro("Gigante", "Perrarina", 7, "Chiguagua");
        perro2.Alimentarse();
        
        //declaramos 1 gato
        Animal gato1=new Gato("Melon", "Pescado", 2, "Siames");
        gato1.Alimentarse();
        
        //declaramos 1 Caballo
        Animal caballo1=new Caballo("Lady Laura", "Paja", 10, "Percheron");
        caballo1.Alimentarse();
        
        
      
        
        
        
    }

}

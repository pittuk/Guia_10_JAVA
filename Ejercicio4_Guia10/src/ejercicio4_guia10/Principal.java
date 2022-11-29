

package ejercicio4_guia10;

//@author pittu

import Entidad.Circulo;
import Entidad.Rectangulo;
import Entidad.calculosFormas;


public class Principal {

    public static void main(String[] args) {
       
        Circulo c1=new Circulo(5.0);
        Rectangulo r1=new Rectangulo(15.0, 7.0);
        
        c1.calcularArear();
        c1.calcularPerimetro();
        
        System.out.println("-----------------");
        
        r1.calcularArear();
        r1.calcularPerimetro();
        
        
                
        
        
        
        
        
    }

}

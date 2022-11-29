/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Entidad;

/**
 *
 * @author pittu
 */

public class Televisor extends Electrodomesticos{
    private Integer resolucion;
    private Boolean sintonizador;

    public Televisor() {
    }

  

    public Televisor(Integer resolucion, Boolean sintonizador, Double precio, String color, char consumo, Double peso) {
        super(precio, color, consumo, peso);
        this.resolucion = resolucion;
        this.sintonizador = sintonizador;
    }

    public Integer getResolucion() {
        return resolucion;
    }

    public void setResolucion(Integer resolucion) {
        this.resolucion = resolucion;
    }

    public Boolean getSintonizador() {
        return sintonizador;
    }

    public void setSintonizador(Boolean sintonizador) {
        this.sintonizador = sintonizador;
    }
    
    public void crearTelevisor(){
    crearElectrodomestico();
        System.out.println("Ingrese las pulgadas");
        resolucion=leer.nextInt();
        System.out.println("¿Tiene sontonizador digital? S/N");
        
        if (leer.next().equalsIgnoreCase("s")) {
            sintonizador=true;
        } else{
        
        sintonizador=false;
        }
        
    
    }
    
    /*Método precioFinal(): este método será heredado y se le sumará la siguiente
funcionalidad. Si el televisor tiene una resolución mayor de 40 pulgadas, se
incrementará el precio un 30% y si tiene un sintonizador TDT incorporado, aumentará
$500. Recuerda que las condiciones que hemos visto en la clase Electrodomestico
también deben afectar al precio.*/

    @Override
    public void precioFinal() {
        super.precioFinal(); //To change body of generated methods, choose Tools | Templates.
        if (resolucion>40) {
            precio=precio+(precio*0.3);
            
        } 
        if (sintonizador) {
            precio+=500;
            
        }
        
        System.out.println("El precio final del televisor: "+precio);
        System.out.println("El color es: "+color);
        System.out.println("El consumo es: "+ consumo);
        System.out.println("La pulgadas: "+resolucion);
        
        
        
    }
    
    
    

}

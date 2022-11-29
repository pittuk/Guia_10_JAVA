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

public class Circulo implements calculosFormas{
    private Double radio;

    public Circulo() {
    }

    public Circulo(Double radio) {
        this.radio = radio;
    }
    
    

    @Override
    public void calcularArear() {
        Double area=PI*Math.pow(radio, 2);
        System.out.println("El área de círculo es: "+ area);
    }

    @Override
    public void calcularPerimetro() {
        Double perimetro=PI*(radio*2);
        System.out.println("El perímetro del círculo es: "+perimetro);
    }

}

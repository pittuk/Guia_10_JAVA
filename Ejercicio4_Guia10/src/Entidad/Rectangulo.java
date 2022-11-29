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

public class Rectangulo implements calculosFormas {
    private Double base;
    private Double altura;

    public Rectangulo() {
    }

    public Rectangulo(Double base, Double altura) {
        this.base = base;
        this.altura = altura;
    }
    
    

    @Override
    public void calcularArear() {
        Double area=base*altura;
        System.out.println("El área del rectángulo es: "+area);
    }

    @Override
    public void calcularPerimetro() {
        Double perimetro=(base+altura)*2;
        System.out.println("El perímetro del rectángulo es: "+perimetro);
    }

}

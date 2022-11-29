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
public class Lavadora extends Electrodomesticos {

    private Integer carga;

    public Lavadora() {

    }

    public Lavadora(Integer carga, Double precio, String color, char consumo, Double peso) {
        super(precio, color, consumo, peso);
        this.carga = carga;
    }

    public Integer getCarga() {
        return carga;
    }

    public void setCarga(Integer carga) {
        this.carga = carga;
    }

    public void crearLavadora() {
        //Scanner leer = new Scanner(System.in).useDelimiter("\n");
        crearElectrodomestico();
        System.out.println("Ingrese la carga");
        carga=leer.nextInt();

    }

    @Override
    public void precioFinal() {
        super.precioFinal(); //To change body of generated methods, choose Tools | Templates.
        if (carga>30) {
            precio+=500;
        }
        
         System.out.println("El precio final de la lavadora es: "+precio);
        
        
    }
    
    
    

}

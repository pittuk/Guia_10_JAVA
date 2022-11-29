/*
Crear una superclase llamada Electrodoméstico con los siguientes atributos: precio, color,
consumo energético (letras entre A y F) y peso.
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author pittu
 */
public abstract class Electrodomesticos {

    protected Double precio;
    protected String color;
    protected char consumo;
    protected Double peso;
    protected Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Electrodomesticos() {
        this.precio = 1000.0;
    }

    public Electrodomesticos(Double precio, String color, char consumo, Double peso) {
        this.precio = precio;
        this.color = color;
        this.consumo = consumo;
        this.peso = peso;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumo() {
        return consumo;
    }

    public void setConsumo(char consumo) {
        this.consumo = consumo;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    /*Método comprobarConsumoEnergetico(char letra): comprueba que la letra es correcta,
sino es correcta usara la letra F por defecto. Este método se debe invocar al crear el
objeto y no será visible.*/
    public void comprobarConsumoEnergetico(char letra) {

        if (letra == 'A' || letra == 'B' || letra == 'C' || letra == 'D' || letra == 'E' || letra == 'F') {
            consumo = letra;
        } else {
            consumo = 'F';
        }
    }

    /*Método comprobarColor(String color): comprueba que el color es correcto, y si no lo es,
usa el color blanco por defecto. Los colores disponibles para los electrodomésticos son
blanco, negro, rojo, azul y gris. No importa si el nombre está en mayúsculas o en
minúsculas. Este método se invocará al crear el objeto y no será visible.*/
    public void comprobarColor(String colores) {
        if (colores.equalsIgnoreCase("Blanco") || colores.equalsIgnoreCase("Negro") || colores.equalsIgnoreCase("Rojo") || colores.equalsIgnoreCase("Azul") || colores.equalsIgnoreCase("Gris") || colores.equalsIgnoreCase("Blanca") || colores.equalsIgnoreCase("Negra") || colores.equalsIgnoreCase("Roja")) {
            color = colores;
        } else {
            color = "Blanco";
        }
    }

    /*Metodo crearElectrodomestico(): le pide la información al usuario y llena el
electrodoméstico, también llama los métodos para comprobar el color y el consumo. Al
precio se le da un valor base de $1000.*/
    public void crearElectrodomestico() {
        //Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el color");
        color = leer.next();
        comprobarColor(color);
        System.out.println("Ingrese el consumo");
        consumo = leer.next().toUpperCase().charAt(0);
        comprobarConsumoEnergetico(consumo);
        System.out.println("Ingrese el peso");
        peso = leer.nextDouble();

    }

    /*Método precioFinal(): según el consumo energético y su tamaño, aumentará el valor del
precio. Esta es la lista de precios:*/
    public void precioFinal() {

        switch (consumo) {
            case 'A':
                precio += 1000;
                break;
            case 'B':
                precio += 800;
                break;
            case 'C':
                precio += 600;
                break;
            case 'D':
                precio += 500;
                break;
            case 'E':
                precio += 300;
                break;
            case 'F':
                precio += 100;
                break;

        }
        if (peso>=1&&peso <20) {
            precio+=100;
            
        } else if (peso>=20&&peso <50) {
            precio+=500;
        } else if (peso>=50&&peso<80) {
            precio+=800;
        } else if (precio>=80) {
            precio+=1000;
        }
        
        

    }

}

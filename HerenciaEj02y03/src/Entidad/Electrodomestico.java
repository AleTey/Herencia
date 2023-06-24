
package Entidad;

public class Electrodomestico {

protected double precio;
protected String color;
protected char consumoElectrico;
protected double peso;

    public Electrodomestico() {
    }

    public Electrodomestico(double precio, String color, char consumoElectrico, double peso) {
        this.precio = precio;
        this.color = color;
        this.consumoElectrico = consumoElectrico;
        this.peso = peso;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoElectrico() {
        return consumoElectrico;
    }

    public void setConsumoElectrico(char consumoElectrico) {
        this.consumoElectrico = consumoElectrico;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Electrodomestico{" + "precio=" + precio + ", color=" + color + ", consumoElectrico=" + consumoElectrico + ", peso=" + peso + '}';
    }

    
    
}

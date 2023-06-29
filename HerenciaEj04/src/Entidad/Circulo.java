
package Entidad;

public class Circulo implements calculosFormas {
    
    private double radio;
    private double diametro;

    public Circulo() {
    }

    public Circulo(double radio, double diametro) {
        this.radio = radio;
        this.diametro = diametro;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getPerimetro() {
        return diametro;
    }

    public void setPerimetro(double diametro) {
        this.diametro = diametro;
    }

    @Override
    public double area() {
        return PI * (radio * radio);
    }

    @Override
    public double perimetro() {
        return PI * diametro;
    }
    
    @Override
    public String toString() {
        return "Circula{" + "radio=" + radio + ", diametro=" + diametro + '}';
    }
}

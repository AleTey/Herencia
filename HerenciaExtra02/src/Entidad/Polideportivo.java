
package Entidad;


public class Polideportivo extends Edificio {

    private String nombre;
    private boolean tipo;

    public Polideportivo() {
    }

    public Polideportivo(String nombre, boolean tipo, int ancho, int alto, int largo) {
        super(ancho, alto, largo);
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isTipo() {
        return tipo;
    }

    public void setTipo(boolean tipo) {
        this.tipo = tipo;
    }
    
    
    
    
    @Override
    public double calcularSuperficie() {
        double superficie = alto * ancho;
        
        return superficie;
    }

    @Override
    public double calcularVolumen() {
        double volumen = alto * ancho * alto;
        
        return volumen;
    }

    @Override
    public String toString() {
        return "Polideportivo{" + "nombre=" + nombre + ", tipo=" + tipo + ", ancho=" + ancho + ", alto=" + alto + ", largo=" + largo + '}';
    }

    
    
    
    
}

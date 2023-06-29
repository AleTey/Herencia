
package Entidad;


public class ExtraHoteleros extends Alojamiento {
    
    protected boolean privado;
    protected double cantMetros;

    public ExtraHoteleros() {
    }

    public ExtraHoteleros(boolean privado, double cantMetros, String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.privado = privado;
        this.cantMetros = cantMetros;
    }

    public boolean isPrivado() {
        return privado;
    }

    public void setPrivado(boolean privado) {
        this.privado = privado;
    }

    public double getCantMetros() {
        return cantMetros;
    }

    public void setCantMetros(double cantMetros) {
        this.cantMetros = cantMetros;
    }

    @Override
    public String toString() {
        return "ExtraHoteleros{" + "privado=" + privado + ", cantMetros=" + cantMetros + ", nombre=" + nombre + ", direccion=" + direccion + ", localidad=" + localidad + ", gerente=" + gerente + '}';
    }
    
    
}

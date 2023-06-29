
package Entidad;


public class Recidencia extends ExtraHoteleros {
    
    private int cantHabitaciones;
    private boolean dtoGremios;
    private boolean campoDeportivo;

    public Recidencia() {
    }

    public Recidencia(int cantHabitaciones, boolean dtoGremios, boolean campoDeportivo, boolean privado, double cantMetros, String nombre, String direccion, String localidad, String gerente) {
        super(privado, cantMetros, nombre, direccion, localidad, gerente);
        this.cantHabitaciones = cantHabitaciones;
        this.dtoGremios = dtoGremios;
        this.campoDeportivo = campoDeportivo;
    }

    public int getCantHabitaciones() {
        return cantHabitaciones;
    }

    public void setCantHabitaciones(int cantHabitaciones) {
        this.cantHabitaciones = cantHabitaciones;
    }

    public boolean isDtoGremios() {
        return dtoGremios;
    }

    public void setDtoGremios(boolean dtoGremios) {
        this.dtoGremios = dtoGremios;
    }

    public boolean isCampoDeportivo() {
        return campoDeportivo;
    }

    public void setCampoDeportivo(boolean campoDeportivo) {
        this.campoDeportivo = campoDeportivo;
    }

    @Override
    public String toString() {
        return "Recidencia{" + "cantHabitaciones=" + cantHabitaciones + ", dtoGremios=" + dtoGremios + ", campoDeportivo=" + campoDeportivo + ", privado=" + privado + ", cantMetros=" + cantMetros + ", nombre=" + nombre + ", direccion=" + direccion + ", localidad=" + localidad + ", gerente=" + gerente + '}';
    }
    
    
    
    
}


package Entidad;


public class CincoEstrellas extends Hotel {
    
    private int cantSalasConferencia;
    private int cantSuites;
    private int cantLimosinas;

    public CincoEstrellas() {
    }

    public CincoEstrellas(int cantSalasConferencia, int cantSuites, int cantLimosinas, int cantHabitaciones, int nroCamas, int cantPisos, int precioHabitacion, char gimnacio, String nombreRestaurante, int capacidadRestaurante, String nombre, String direccion, String localidad, String gerente) {
        super(cantHabitaciones, nroCamas, cantPisos, precioHabitacion, gimnacio, nombreRestaurante, capacidadRestaurante, nombre, direccion, localidad, gerente);
        this.cantSalasConferencia = cantSalasConferencia;
        this.cantSuites = cantSuites;
        this.cantLimosinas = cantLimosinas;
    }

    public int getCantSalasConferencia() {
        return cantSalasConferencia;
    }

    public void setCantSalasConferencia(int cantSalasConferencia) {
        this.cantSalasConferencia = cantSalasConferencia;
    }

    public int getCantSuites() {
        return cantSuites;
    }

    public void setCantSuites(int cantSuites) {
        this.cantSuites = cantSuites;
    }

    public int getCantLimosinas() {
        return cantLimosinas;
    }

    public void setCantLimosinas(int cantLimosinas) {
        this.cantLimosinas = cantLimosinas;
    }

    @Override
    public String toString() {
        return "CincoEstrellas{" + "cantSalasConferencia=" + cantSalasConferencia + ", cantSuites=" + cantSuites + ", cantLimosinas=" + cantLimosinas + ", cantHabitaciones=" + cantHabitaciones + ", nroCamas=" + nroCamas + ", cantPisos=" + cantPisos + ", precioHabitacion=" + precioHabitacion + ", gimnacio=" + gimnacio + ", nombreRestaurante=" + nombreRestaurante + ", capacidadRestaurante=" + capacidadRestaurante + ", nombre=" + nombre + ", direccion=" + direccion + ", localidad=" + localidad + ", gerente=" + gerente + '}';
    }
    
    
    
}

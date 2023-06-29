
package Entidad;


public class CuatroEstrellas extends Hotel {

    public CuatroEstrellas() {
    }

    public CuatroEstrellas(int cantHabitaciones, int nroCamas, int cantPisos, int precioHabitacion, char gimnacio, String nombreRestaurante, int capacidadRestaurante, String nombre, String direccion, String localidad, String gerente) {
        super(cantHabitaciones, nroCamas, cantPisos, precioHabitacion, gimnacio, nombreRestaurante, capacidadRestaurante, nombre, direccion, localidad, gerente);
    }

    @Override
    public String toString() {
        return "CuatroEstrellas{" + "cantHabitaciones=" + cantHabitaciones + ", nroCamas=" + nroCamas + ", cantPisos=" + cantPisos + ", precioHabitacion=" + precioHabitacion + ", gimnacio=" + gimnacio + ", nombreRestaurante=" + nombreRestaurante + ", capacidadRestaurante=" + capacidadRestaurante + '}';
    }
    
    
}

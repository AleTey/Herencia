
package Entidad;

import java.time.LocalDate;
import java.time.LocalTime;

public class Amarre {
    
    private String nombre;
    private long dni;
    private LocalDate fechaIngreso;
    private LocalDate fechaPartida;
    public LocalTime FECHAACTUAL = LocalTime.now();
    private int posicionAmarre;
    private Barco barcoQueAmarra;

    public Amarre() {
    }

    public Amarre(String nombre, long dni, LocalDate fechaIngreso, LocalDate fechaPartida, Barco barcoQueAmarra) {
        this.nombre = nombre;
        this.dni = dni;
        this.fechaIngreso = fechaIngreso;
        this.fechaPartida = fechaPartida;
        this.barcoQueAmarra = barcoQueAmarra;
    }

    
    
   
    

    public Amarre(String nombre, long dni, LocalDate fechaIngreso, LocalDate fechaPartida, int posicionAmarre, Barco barcoQueAmarra) {
        this.nombre = nombre;
        this.dni = dni;
        this.fechaIngreso = fechaIngreso;
        this.fechaPartida = fechaPartida;
        this.posicionAmarre = posicionAmarre;
        this.barcoQueAmarra = barcoQueAmarra;
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public LocalDate getFechaPartida() {
        return fechaPartida;
    }

    public void setFechaPartida(LocalDate fechaPartida) {
        this.fechaPartida = fechaPartida;
    }

    public int getPosicionAmarre() {
        return posicionAmarre;
    }

    public void setPosicionAmarre(int posicionAmarre) {
        this.posicionAmarre = posicionAmarre;
    }

    public Barco getBarcoQueAmarra() {
        return barcoQueAmarra;
    }

    public void setBarcoQueAmarra(Barco barcoQueAmarra) {
        this.barcoQueAmarra = barcoQueAmarra;
    }

    public LocalTime getFECHAACTUAL() {
        return FECHAACTUAL;
    }
    
    

    @Override
    public String toString() {
        return "Alquiler{" + "nombre=" + nombre + ", dni=" + dni + ", fechaIngreso=" + fechaIngreso + ", fechaPartida=" + fechaPartida + ", posicionAmarre=" + posicionAmarre + ", barcoQueAmarra=" + barcoQueAmarra + '}';
    }
    
    
}

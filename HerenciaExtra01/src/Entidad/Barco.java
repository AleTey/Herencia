
package Entidad;

import java.time.LocalDate;


public class Barco {
    
    protected int matricula;
    protected int longEscola;
    protected LocalDate fechaFabricacion;

    public Barco() {
    }

    public Barco(int matricula, int longEscola, LocalDate fechaFabricacion) {
        this.matricula = matricula;
        this.longEscola = longEscola;
        this.fechaFabricacion = fechaFabricacion;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getLongEscola() {
        return longEscola;
    }

    public void setLongEscola(int longEscola) {
        this.longEscola = longEscola;
    }

    public LocalDate getFechaFabricacion() {
        return fechaFabricacion;
    }

    public void setFechaFabricacion(LocalDate fechaFabricacion) {
        this.fechaFabricacion = fechaFabricacion;
    }

    @Override
    public String toString() {
        return "Barco{" + "matricula=" + matricula + ", longEscola=" + longEscola + ", fechaFabricacion=" + fechaFabricacion + '}';
    }

    
    
    
}

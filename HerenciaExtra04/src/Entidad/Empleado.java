
package Entidad;

import Enums.EstadoCivil;
import java.time.LocalDate;


public abstract class Empleado extends Persona {
    
    protected LocalDate anioIncorporacion;
    protected int nroDespacho;

    public Empleado() {
    }

    public Empleado(LocalDate anioIncorporacion, int nroDespacho, String nombreYApellido, int dni, EstadoCivil estadoCivil) {
        super(nombreYApellido, dni, estadoCivil);
        this.anioIncorporacion = anioIncorporacion;
        this.nroDespacho = nroDespacho;
    }

    public LocalDate getAnioIncorporacion() {
        return anioIncorporacion;
    }

    public void setAnioIncorporacion(LocalDate anioIncorporacion) {
        this.anioIncorporacion = anioIncorporacion;
    }

    public int getNroDespacho() {
        return nroDespacho;
    }

    public void setNroDespacho(int nroDespacho) {
        this.nroDespacho = nroDespacho;
    }
    
    public void cambiarDespacho(int nuevoNroDeDespacho) {
    
        this.nroDespacho = nuevoNroDeDespacho;
    }

    
//    public int ComparableTo(Empleado e) {
//        if(this.dni < e.getDni()) {
//            return -1;
//        }else if(this.dni > e.getDni()){
//            return 1;
//        }else {
//            return 0;
//        }
//    }
    
    @Override
    public String toString() {
        return "Empleado" + 
                "\n nombreYApellido= " + nombreYApellido + 
                "\n dni=" + dni + 
                "\n estadoCivil=" + estadoCivil +
                "\n anioIncorporacion=" + anioIncorporacion + 
                "\n nroDespacho=" + nroDespacho;
    }

    
    
}

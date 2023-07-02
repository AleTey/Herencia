
package Entidad;

import Enums.Departamento;
import Enums.EstadoCivil;
import java.time.LocalDate;

public class Profesor extends Empleado{
    
    private Departamento departamento;

    public Profesor() {
    }

    public Profesor(Departamento departamento, LocalDate anioIncorporacion, int nroDespacho, String nombreYApellido, int dni, EstadoCivil estadoCivil) {
        super(anioIncorporacion, nroDespacho, nombreYApellido, dni, estadoCivil);
        this.departamento = departamento;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
    
    public void cambiarDepartamento(Departamento d) {
    
        this.departamento = d;
    }

    @Override
    public String toString() {
        return "Profesor" + 
                "\n nombreYApellido= " + nombreYApellido + 
                "\n dni=" + dni + 
                "\n estadoCivil=" + estadoCivil +
                "\n anioIncorporacion=" + anioIncorporacion + 
                "\n nroDespacho=" + nroDespacho +
                "\n departamento=" + departamento;
    }

//    @Override
//    public int compareTo(Profesor t) {
////       int num = super.compareTo(t);
//        if(this.dni < t.getDni()) {
//            return -1;
//        }else if(this.dni > t.getDni()) {
//            return 1;
//        }else {
//            return 0;
//        }
//    }

//    @Override
//    public int compareTo(Empleado t) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

//    @Override
//    public int compareTo(Empleado t) {
//        if(this.dni < t.getDni()) {
//            return -1;
//        }else if(this.dni > t.getDni()) {
//            return 1;
//        }else {
//            return 0;
//        }
//    }

//    @Override
//    public int compareTo(Persona t) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//    
    
}

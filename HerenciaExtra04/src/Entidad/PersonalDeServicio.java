
package Entidad;

import Enums.EstadoCivil;
import Enums.Seccion;
import java.time.LocalDate;


public class PersonalDeServicio extends Empleado  {
    
    private Seccion seccion;

    public PersonalDeServicio() {
    }

    public PersonalDeServicio(Seccion seccion, LocalDate anioIncorporacion, int nroDespacho, String nombreYApellido, int dni, EstadoCivil estadoCivil) {
        super(anioIncorporacion, nroDespacho, nombreYApellido, dni, estadoCivil);
        this.seccion = seccion;
    }

    public Seccion getSeccion() {
        return seccion;
    }

    public void setSeccion(Seccion seccion) {
        this.seccion = seccion;
    }
    
    public void cambiarSeccion(Seccion seccion) {
        this.seccion = seccion;
    
    }

    @Override
    public String toString() {
        return "PersonalDeServicio" + 
                "\n nombreYApellido= " + nombreYApellido + 
                "\n dni=" + dni + 
                "\n estadoCivil=" + estadoCivil +
                "\n anioIncorporacion=" + anioIncorporacion + 
                "\n nroDespacho=" + nroDespacho +
                "\n seccion=" + seccion;
    }
    
    
    
}


package Service;

import Entidad.Empleado;
import Entidad.Persona;
import java.time.LocalDate;
import java.util.Random;
import java.util.TreeSet;


public class EmpleadoService extends PersonaService {
    
    static TreeSet<Empleado> treeEmpleados = new TreeSet();
    
    public Empleado crearEmpleado() {
    
        Persona persona = super.crearPersona();
        
        Random rand = new Random();
        
        LocalDate fechaActual = LocalDate.now();
        int anioActual = fechaActual.getYear();
        int anio = rand.nextInt(anioActual - 1990 + 1) + 1990;
        int mes = rand.nextInt(12) + 1;
        int dia = rand.nextInt(30) + 1;
        LocalDate fechaIngreso = LocalDate.of(anio, mes, dia);
        int nroDespacho = rand.nextInt(20) + 1;
        
        return new Empleado(fechaIngreso, nroDespacho, persona.getNombreYApellido(), persona.getDni(), persona.getEstadoCivil()){};
    }
    
    public void mostrarEmpleados() {
    
        for (Empleado empleado : treeEmpleados) {
            System.out.println(empleado.toString());
        }
    }
    
    public Empleado buscarEmpleado(int dni){
    
        for (Empleado empleado : treeEmpleados) {
            if (empleado.getDni() == dni) {
                return empleado;
            }
        }
        return null;
    }
    
    
}


package Service;

import Entidad.Empleado;
import Entidad.Profesor;
import Enums.Departamento;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.TreeSet;


public class ProfesorService extends EmpleadoService{
    
    Scanner sc = new Scanner(System.in);
    TreeSet<Profesor> treeProfesores = new TreeSet();
    
    public Profesor crearProfesor() {
    
        Random rand = new Random();
        
        Empleado empleado = super.crearEmpleado();
        
        Departamento[] listaDepartamentos = Departamento.values();
        
        int dto = rand.nextInt(listaDepartamentos.length);
        
        Departamento departamento = listaDepartamentos[dto];
        
        return new Profesor(departamento, empleado.getAnioIncorporacion(), empleado.getNroDespacho(), empleado.getNombreYApellido(), empleado.getDni(), empleado.getEstadoCivil());
        
    }
    
    public void agregarAListas(){
    
        Profesor profesor = crearProfesor();
        
        treeProfesores.add(profesor);
        treeEmpleados.add(profesor);
        mapPersonas.put(profesor.getDni(), profesor);
    }
    
    public Profesor buscarProfesor(int dni) {
        
        for (Profesor profe : treeProfesores) {
            if(profe.getDni() == dni) {
                return profe;
            }
        }
        return null;        
    }
    
    public Departamento elegirNuevoDepartamento() {
        Departamento[] listaDepartamentos = Departamento.values();
        for (int i = 0; i < listaDepartamentos.length; i++) {
            System.out.println(i + 1 + ". " + listaDepartamentos[i]);
        }
        System.out.println("A que departamento desea trasladarlo?");
        int nroElegido = sc.nextInt() - 1;
        Departamento dtoElegido = listaDepartamentos[nroElegido];
        
        return dtoElegido;
    }
}

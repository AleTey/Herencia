
package Service;

import Entidad.Alumno;
import Entidad.Persona;
import Enums.Curso;
import java.util.ArrayList;
import java.util.Random;
import java.util.TreeSet;


public class AlumnoService extends PersonaService {
    
    TreeSet<Alumno> listaAlumnos = new TreeSet();
    
    public Alumno crearAlumno() {
    
        Persona persona = super.crearPersona();
        
        Curso[] listaCurso = Curso.values();
        
        Random rand = new Random();
        int seleccionarCurso = rand.nextInt(listaCurso.length);
        ArrayList<Curso> cursoElegido = new ArrayList<>();
        cursoElegido.add(listaCurso[seleccionarCurso]);
        
        return new Alumno(cursoElegido, persona.getNombreYApellido(), persona.getDni(), persona.getEstadoCivil());
                
    }
    
    public void agregarAListaAlumnos() {
    
        Alumno alumno = crearAlumno();
        
        listaAlumnos.add(alumno);
        mapPersonas.put(alumno.getDni(), alumno);
    
    }
    
    public Alumno buscarAlumno(int dni) {
        for (Alumno alumno : listaAlumnos) {
            if(dni == alumno.getDni()) {
                return alumno;
            }
        }
        return null;
    }
    
}

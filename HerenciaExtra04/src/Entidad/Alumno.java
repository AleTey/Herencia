
package Entidad;

import Enums.Curso;
import Enums.EstadoCivil;
import java.util.ArrayList;


public  class Alumno extends Persona {
    
    private ArrayList<Curso> curso;

    public Alumno() {
    }

    public Alumno(ArrayList curso, String nombreYApellido, int dni, EstadoCivil estadoCivil) {
        super(nombreYApellido, dni, estadoCivil);
        this.curso = curso;
    }

    public ArrayList<Curso> getCurso() {
        return curso;
    }
    
    public void setCurso(ArrayList curso) {
        this.curso = curso;
    }
    
    public String cursosToString() {
    
        String cursoString = "";
        for (Curso curso1 : this.curso) {
            cursoString = cursoString + ", " + curso1;
        }
        return cursoString;
    }
    
    public void matricularEnNuevoCurso(Curso curso) {
        this.curso.add(curso);
       
    }

    @Override
    public String toString() {
        return "Alumno" + 
                "\n nombreYApellido= " + nombreYApellido + 
                "\n dni=" + dni + 
                "\n estadoCivil=" + estadoCivil +
                "\n curso=" + curso +
                "\n cursoString= " + cursosToString();
                
    }

  
    
   
}

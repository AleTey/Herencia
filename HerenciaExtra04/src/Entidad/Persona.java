package Entidad;

import Enums.EstadoCivil;

public abstract class Persona implements Comparable<Persona> {

    protected String nombreYApellido;
    protected int dni;
    protected EstadoCivil estadoCivil;

    public Persona() {
    }

    public Persona(String nombreYApellido, int dni, EstadoCivil estadoCivil) {
        this.nombreYApellido = nombreYApellido;
        this.dni = dni;
        this.estadoCivil = estadoCivil;
    }

    public String getNombreYApellido() {
        return nombreYApellido;
    }

    public void setNombreYApellido(String nombreYApellido) {
        this.nombreYApellido = nombreYApellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public EstadoCivil getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(EstadoCivil estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public void cambiarEstadoCivil() {
        if (estadoCivil == EstadoCivil.CASADO) {
            estadoCivil = EstadoCivil.SOLTERO;
        } else {
            estadoCivil = EstadoCivil.CASADO;
        }
    }

//    @Override
//    public int compareTo(Persona p) {
//        if (this.dni < p.getDni()) {
//            return -1;
//        } else if (this.dni > p.getDni()) {
//            return 1;
//        } else {
//            return 0;
//        }
//    }

    @Override
    public int compareTo(Persona p) {
    
        Class<?> claseActual = this.getClass();
        Class<?> claseP = p.getClass();
        
        int resultado = claseP.getSimpleName().compareTo(claseActual.getSimpleName());
//        int resultado = claseActual.getSimpleName().compareTo(claseP.getSimpleName());
        
        if(resultado != 0) {
            return resultado;
        }
        else {
            return this.nombreYApellido.compareTo(p.getNombreYApellido());
        }
        
//            return 0;
    }
//    @Override
//    public int compareTo(Persona p) {
//    
//        if(this.getClass() == p.getClass()) {
//        
//        }
//    }
    @Override
    public String toString() {
        return "Persona"
                + "\n nombreYApellido= " + nombreYApellido
                + "\n dni=" + dni
                + "\n estadoCivil=" + estadoCivil;
    }

}

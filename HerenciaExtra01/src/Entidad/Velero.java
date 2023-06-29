
package Entidad;

import java.time.LocalDate;


public class Velero extends Barco {
    
    private int nroMastiles;

    public Velero() {
    }

    public Velero(int nroMastiles, int matricula, int longEscola, LocalDate fechaFabricacion) {
        super(matricula, longEscola, fechaFabricacion);
        this.nroMastiles = nroMastiles;
    }

    public int getNroMastiles() {
        return nroMastiles;
    }

    public void setNroMastiles(int nroMastiles) {
        this.nroMastiles = nroMastiles;
    }

    @Override
    public String toString() {
        return "Velero{" + "matricula=" + matricula + ", longEscola=" + longEscola + ", fechaFabricacion=" + fechaFabricacion + ", nroMastiles=" + nroMastiles + '}';
    }
    
    
    
}


package Entidad;

import java.time.LocalDate;

public class Yate extends BarcoMotor {
    
    private int nroCamarotes;

    public Yate() {
    }

    public Yate(int nroCamarotes, int potenciaCv, int matricula, int longEscola, LocalDate fechaFabricacion) {
        super(potenciaCv, matricula, longEscola, fechaFabricacion);
        this.nroCamarotes = nroCamarotes;
    }

    public int getNroCamarotes() {
        return nroCamarotes;
    }

    public void setNroCamarotes(int nroCamarotes) {
        this.nroCamarotes = nroCamarotes;
    }

    @Override
    public String toString() {
        return "Yate{" + "matricula=" + matricula + ", longEscola=" + longEscola + ", fechaFabricacion=" + fechaFabricacion + ", potenciaCv=" + potenciaCv + ", nroCamarotes=" + nroCamarotes + '}';
    }
    
    
}

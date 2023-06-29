
package Entidad;

import java.time.LocalDate;


public class BarcoMotor extends Barco {
    
    protected int potenciaCv;

    
    public BarcoMotor() {
    }

    public BarcoMotor(int potenciaCv, int matricula, int longEscola, LocalDate fechaFabricacion) {
        super(matricula, longEscola, fechaFabricacion);
        this.potenciaCv = potenciaCv;
    }

    public int getPotenciaCv() {
        return potenciaCv;
    }

    public void setPotenciaCv(int potenciaCv) {
        this.potenciaCv = potenciaCv;
    }

    @Override
    public String toString() {
        return "BarcoMotor{" + "matricula=" + matricula + ", longEscola=" + longEscola + ", fechaFabricacion=" + fechaFabricacion + ", potenciaCv=" + potenciaCv + '}';
    }
    
    
    
}

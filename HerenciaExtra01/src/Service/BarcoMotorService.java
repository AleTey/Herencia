
package Service;

import Entidad.Barco;
import Entidad.BarcoMotor;
import java.util.Random;
import java.util.Scanner;


public class BarcoMotorService extends BarcoService {
    
    Scanner sc = new Scanner(System.in);
    
    
    public BarcoMotor crearBarcoMotorManual() {
    
        Barco barco = super.crearBarcoManual();
        
        System.out.println("Ingrese CV motor");
        int cvMotor = sc.nextInt();
        
        return new BarcoMotor(cvMotor, barco.getMatricula(), barco.getLongEscola(), barco.getFechaFabricacion());
    }
    
    public BarcoMotor crearBarcoMotorAuto() {
    
        Barco barco = super.crearBarcoAuto();
        
        Random random = new Random();
        
        int motor = random.nextInt(3000 - 200 + 1) - 200;
       
        
        return new BarcoMotor(motor, barco.getMatricula(), barco.getLongEscola(), barco.getFechaFabricacion());
    }
    
    public int calcularAmarreBarcoMotor(BarcoMotor barcoMotor) {
    
        int valorModulo = super.CalculoAmarreBarco(barcoMotor);
        
        int valorMotor = barcoMotor.getPotenciaCv();
        
        return valorModulo + valorMotor;
        
    }
}

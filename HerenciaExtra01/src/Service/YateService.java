package Service;

import Entidad.BarcoMotor;
import Entidad.Yate;
import java.util.Random;
import java.util.Scanner;

public class YateService extends BarcoMotorService {

    Scanner sc = new Scanner(System.in);

    public Yate crearYate() {

        BarcoMotor barco = super.crearBarcoMotorManual();
        
        System.out.println("Ingrese cantidad de camarotes");
        int camarotes = sc.nextInt();
        
        return new Yate(camarotes, barco.getPotenciaCv(), barco.getMatricula(), barco.getLongEscola(), barco.getFechaFabricacion());
        
    }
    
    public Yate crearYateAuto() {
        
        BarcoMotor barco = super.crearBarcoMotorAuto();
        
        Random random = new Random();
        
        int camarotes = random.nextInt(10 - 1 + 1) + 1;
        
        return new Yate(camarotes, barco.getPotenciaCv(), barco.getMatricula(), barco.getLongEscola(), barco.getFechaFabricacion());
        
    }
    
    public int calcularAmarreYate(Yate yate) {
    
        int valorModulo = super.calcularAmarreBarcoMotor(yate);
        
        int valorCamarotes = yate.getNroCamarotes() * 10;
        
        return valorModulo + valorCamarotes;
    }
}

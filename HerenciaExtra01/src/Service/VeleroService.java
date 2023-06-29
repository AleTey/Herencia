
package Service;

import Entidad.Barco;
import Entidad.Velero;
import java.time.LocalDate;
import java.util.Random;
import java.util.Scanner;


public class VeleroService extends BarcoService {
    
    Scanner sc = new Scanner(System.in);
    
    public Velero crearVeleroManual() {
    
        Barco barco = super.crearBarcoManual();
        
        System.out.println("Ingrese numero de mas mastiles");
        int mastiles = sc.nextInt();
        LocalDate fecha = barco.getFechaFabricacion();
        
        return new Velero(mastiles, barco.getMatricula(), barco.getLongEscola(), fecha);
        
    }
    
    
    public Velero crearVeleroAuto() {
    
        Barco barco = super.crearBarcoAuto();
        
        Random random = new Random();
        
        int mastiles = random.nextInt(5 - 1 + 1) - 1;
        
        return new Velero(mastiles, barco.getMatricula(), barco.getLongEscola(), barco.getFechaFabricacion());    
    
    }
    
    
    public int calculoAmarreVelero(Barco barco) {
    
        int valorModulo = super.CalculoAmarreBarco(barco);
        
        Velero velero = (Velero) barco;
        
        int valorMastiles = velero.getNroMastiles() * 10;
        
        return valorModulo + valorMastiles;
    }
}

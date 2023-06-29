
package Service;

import Entidad.Amarre;
import Entidad.Barco;
import java.time.LocalDate;
import java.util.Random;
import java.util.Scanner;


public class BarcoService {
    
    Scanner sc = new Scanner(System.in);
    Amarre alquiler = new Amarre();
    
    public Barco crearBarcoManual() {
    
        System.out.println("Ingrese matricula");
        int matricula = sc.nextInt();
        System.out.println("Ingrese escola en Metros");
        int escola = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingrese fecha de fabricacion del barco aaaa-mm-dd");
        String fechaF = sc.nextLine();
        LocalDate fechaFabricacion;
        fechaFabricacion = LocalDate.parse(fechaF);
        
        return new Barco(matricula, escola, fechaFabricacion);
    }
    
    public Barco crearBarcoAuto() {
    
        int matricula;
        Random random = new Random();
        int min = 10000;
        int max = 99999;
        
        matricula = random.nextInt(max - min + 1) + min;
        
        int escola;
        
        escola = random.nextInt(20 - 1 + 1) + 1;
        
        int dia = random.nextInt(28 - 1 + 1) + 1;
        int mes = random.nextInt(12 - 1 + 1) + 1;
        
        int anioMax = LocalDate.now().getYear();
        int anio = random.nextInt(anioMax - 1980 + 1) + 1980;
        
        LocalDate fechaFabricacion = LocalDate.of(anio, mes, dia);
//        fechaFabricacion.of(anio, mes, dia);
        
        return new Barco(matricula, escola, fechaFabricacion);
    }
    
    public int CalculoAmarreBarco(Barco barco) {
    
        int valorModulo = barco.getLongEscola() * 10;
        
        return valorModulo;
        
        
    }
}

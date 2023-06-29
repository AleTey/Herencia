
package Service;

import Entidad.Polideportivo;
import java.util.Random;
import java.util.Scanner;


public class PolideportivoService {
    
    Scanner sc = new Scanner(System.in);
    
    public Polideportivo crearPolideportivo() {
        
        System.out.println("Ingrese nombre");
        String nombre = sc.nextLine();
        String rta;
        do {
        System.out.println("Tine techo? S/N");
         rta = sc.nextLine();
        } while(!rta.equalsIgnoreCase("s") && !rta.equalsIgnoreCase("n"));
        
        boolean techo;
        if (rta.equalsIgnoreCase("s")) {
            techo = true;
        }else {
            techo = false;
        }
        
        System.out.println("Ingrese ancho");
        int ancho = sc.nextInt();
        System.out.println("Ingrese alto");
        int alto = sc.nextInt();
        System.out.println("Ingrese largo");
        int largo = sc.nextInt();
        
        return new Polideportivo(nombre, techo, ancho, alto, largo);
    }
    
    public Polideportivo crearPoliAuto(int i) {
    
        String nombre = "nombre" + i;
        int nro = (int) (Math.random() * 10) + 1;
        boolean techo;
        if (nro % 2 == 0) {
           techo = true; 
        }else {
            techo = false;
        }
        
        Random random = new Random();
        
        int ancho = random.nextInt(300 - 100 + 1) + 100;
        int alto = random.nextInt(100 - 40 + 1) + 40;
        int largo = random.nextInt(300 - 100 + 1) + 100;
        
        return new Polideportivo(nombre, techo, ancho, alto, largo);
    }
}

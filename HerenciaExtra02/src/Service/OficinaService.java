
package Service;

import Entidad.Oficina;
import java.util.Random;
import java.util.Scanner;


public class OficinaService {
   
    Scanner sc = new Scanner(System.in);
    
    public Oficina crearOficinaAuto() {
        
        Random ran = new Random();
        int nroOficinas = ran.nextInt(20 - 5 + 1) + 5;
        int nroPisos = nroOficinas;
        
        int personasPorOficina = ran.nextInt(30 - 10 + 1) + 10;
        
        int ancho = ran.nextInt(100 - 50 + 1) + 50;
        int alto = nroPisos * 4;
        int largo = ran.nextInt(100 - 50 + 1) + 50;
        
        return new Oficina(nroOficinas, personasPorOficina, nroPisos, ancho, alto, largo);
    }
    
    public int cantPersonasTotales(Oficina oficina) {
        
        int capacidadOficina = oficina.getNroOficinas() * oficina.getPersonasPorOficina();
    
        return capacidadOficina;
    }
    
}


package Service;

import Entidad.Alojamiento;
import Entidad.CuatroEstrellas;
import java.util.ArrayList;
import java.util.Scanner;

public class AlojamientoService {
    
    Scanner sc = new Scanner(System.in);
//    CuatroEstrellasService ces = new CuatroEstrellasService();
   static ArrayList<Alojamiento> listaAlojamiento = new ArrayList();
    
    
    
    public Alojamiento crearAlojamientoAuto() {
    
        int num = (int) (Math.random() * 100);
        String nombre = "nombreAlojamiento " + num;
        num = (int) (Math.random() * 100);
        String direccion = "direccion " + num;
        num = (int) (Math.random() * 100);
        String localidad = "Localidad " + num;
        num = (int) (Math.random() * 100);
        String nombreGerente = "nombreGerente " + num;
        
        return new Alojamiento(nombre, direccion, localidad, nombreGerente) {};
        
    }
    

    public void MostrarListaAlojamientos() {
        
        
        System.out.println("entra a mostrarListaAlojamientos");
        System.out.println(listaAlojamiento.size());
        for (Alojamiento alojamiento1 : listaAlojamiento) {
            
            System.out.println(alojamiento1.toString());
            System.out.println("hola");
        }
    }
}


package Service;

import Entidad.ExtraHoteleros;
import Entidad.Recidencia;
import java.util.ArrayList;
import java.util.Random;

public class RecidenciaService extends ExtraHotelerosService {
    
    ArrayList<Recidencia> listaRecidencia = new ArrayList();
    
    public Recidencia crearRecidencia() {
    
        ExtraHoteleros extra = super.crearExtraHotelero();
        
        Random rand = new Random();
        
        int cantHabitaciones = rand.nextInt(100 - 30 + 1) + 30;
        
        boolean dto = rand.nextBoolean();
        boolean campo = rand.nextBoolean();
        
        return new Recidencia(cantHabitaciones, dto, campo, extra.isPrivado(), extra.getCantMetros(), extra.getNombre(), extra.getDireccion(), extra.getLocalidad(), extra.getGerente());
        
    }
    
    public void GuardarEnListas() {
    
        Recidencia recidencia = crearRecidencia();
        
        listaRecidencia.add(recidencia);
        listaAlojamiento.add(recidencia);
        
    }
    
    public void mostrarRecidenciasConDescuento() {
    
        for (Recidencia recidencia : listaRecidencia) {
            
            if(recidencia.isDtoGremios()) {
                System.out.println(recidencia.toString());
            }
        }
    }
}

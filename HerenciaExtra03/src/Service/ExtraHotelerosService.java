
package Service;

import Entidad.Alojamiento;
import Entidad.ExtraHoteleros;
import java.util.Random;


public class ExtraHotelerosService extends AlojamientoService {
    
    
    public ExtraHoteleros crearExtraHotelero() {
    
        Alojamiento alojamiento = super.crearAlojamientoAuto();
        
        Random rand = new Random();
        
//        int num = (int) (Math.random() * 20);
        int num = rand.nextInt(10 - 1 + 1) + 1;
        boolean privado;
        
        if(num % 2 == 0) {
            privado = false;
        }else {
            privado = true;
        }
        
        double numD = (Math.random() * 100);
        
        return new ExtraHoteleros(privado, numD, alojamiento.getNombre(), alojamiento.getDireccion(), alojamiento.getLocalidad(),alojamiento.getGerente()){};
        
    }
}

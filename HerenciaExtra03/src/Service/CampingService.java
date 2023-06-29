
package Service;

import Entidad.Camping;
import Entidad.ExtraHoteleros;
import java.util.ArrayList;
import java.util.Random;


public class CampingService extends ExtraHotelerosService {
    
    ArrayList<Camping> listaCampings = new ArrayList();
    
    public Camping crearCamping() {
    
        ExtraHoteleros extraH = super.crearExtraHotelero();
        
        Random rand = new Random();
        
        int capMaxCarpas = rand.nextInt(100 - 40 + 1) + 40;
        
        int cantBanios = rand.nextInt(15 - 5 + 1) + 5;
        
        boolean restaurante;
        int num = rand.nextInt(10 - 1 + 1) + 1;
        restaurante = num % 2 == 0;
        
        return new Camping(capMaxCarpas, cantBanios, restaurante, extraH.isPrivado(), extraH.getCantMetros(), extraH.getNombre(), extraH.getDireccion(), extraH.getLocalidad(), extraH.getGerente());
        
    }
    
    public void guardarEnListas() {
    
        Camping camping = crearCamping();
        
        listaCampings.add(camping);
        listaAlojamiento.add(camping);
    }
    
    
    public void mostrarCampingsCRestaurantes() {
    
        for (Camping campingDLista : listaCampings) {
            if(campingDLista.isRestaurante()) {
                System.out.println(campingDLista.toString());
            }
        }
        
    }
    
}

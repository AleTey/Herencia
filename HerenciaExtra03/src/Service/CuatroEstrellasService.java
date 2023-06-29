

package Service;

import Entidad.Alojamiento;
import Entidad.CuatroEstrellas;
import Entidad.Hotel;
import java.util.ArrayList;



public class CuatroEstrellasService extends HotelService {
    
    static ArrayList<CuatroEstrellas> listaCuatroEstrellas = new ArrayList();
    
    public CuatroEstrellas crearCuatroEstrellas() {
        
        Hotel hotel =  super.crearHotelAuto();
//        CuatroEstrellas cuatro = (CuatroEstrellas) hotel;
        return new CuatroEstrellas(hotel.getCantHabitaciones(), hotel.getNroCamas(), hotel.getCantPisos(), hotel.getPrecioHabitacion(), hotel.getGimnacio(), hotel.getNombreRestaurante(), hotel.getCapacidadRestaurante(), hotel.getNombre(), hotel.getDireccion(), hotel.getLocalidad(), hotel.getGerente());        
    }   
    
    
    public void guardarEnLista() {
    
        CuatroEstrellas cuatroEstrellas = crearCuatroEstrellas();
        listaCuatroEstrellas.add(cuatroEstrellas);
        listaAlojamiento.add(cuatroEstrellas);
        listaHoteles.add(cuatroEstrellas);

       
        

    }
    
    public void mostrarLista() {
    
        for (CuatroEstrellas cuatroEstrellas : listaCuatroEstrellas) {
            System.out.println(cuatroEstrellas.toString());
            System.out.println(cuatroEstrellas.getNombre());
            System.out.println(cuatroEstrellas.getGerente());
            
        }
    }
    
    
    
    
}
 
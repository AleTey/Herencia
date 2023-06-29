package Service;

import Entidad.CincoEstrellas;
import Entidad.Hotel;
import java.util.ArrayList;
import java.util.Random;

public class CincoEstrellasService extends HotelService {

    ArrayList<CincoEstrellas> listaCincoEstrellas = new ArrayList();

    public CincoEstrellas crearCincoEstrellas() {

        Hotel hotel = super.crearHotelAuto();

        Random ran = new Random();

        int cantSalonesConferencia = ran.nextInt(10 - 3 + 1) + 3;
        int cantSuites = ran.nextInt(15 - 5 + 1) + 5;
        int cantLimo = ran.nextInt(10 - 2 + 1) + 2;

        return new CincoEstrellas(cantSalonesConferencia, cantSuites, cantLimo, hotel.getCantHabitaciones(), hotel.getNroCamas(), hotel.getCantPisos(), hotel.getPrecioHabitacion(), hotel.getGimnacio(), hotel.getNombreRestaurante(), hotel.getCapacidadRestaurante(), hotel.getNombre(), hotel.getDireccion(), hotel.getLocalidad(), hotel.getGerente());
    }

    public void guardarCincoEstrellasEnLista() {

        CincoEstrellas cincoEstrallas = crearCincoEstrellas();
        
        listaCincoEstrellas.add(cincoEstrallas);
        listaHoteles.add(cincoEstrallas);
        listaAlojamiento.add(cincoEstrallas);
    }
}

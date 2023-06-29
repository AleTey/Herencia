
package Service;

import Entidad.Alojamiento;
import Entidad.CuatroEstrellas;
import Entidad.Hotel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;


public class HotelService extends AlojamientoService {
    
    static ArrayList<Hotel> listaHoteles = new ArrayList();
    
    public Hotel crearHotelAuto() {
    
        Alojamiento alojamiento = super.crearAlojamientoAuto();
        
        Random ran = new Random();
        
        int cantHabitaciones = ran.nextInt(100 - 40 + 1) + 40;
        int cantCamas = cantHabitaciones * (ran.nextInt(4 - 1 + 1) + 1);
        int cantPisos = ran.nextInt(15 - 7 + 1) + 7;
        char gimnacio;
        if (cantPisos % 2 == 0) {
            gimnacio = 'A';
        } else {
            gimnacio = 'B';
        }
        
        String nombreRestaurante = "Restaurante " + alojamiento.getNombre();
        int capacidadRestaurante = ran.nextInt(100 - 15 + 1) + 15;
        
        int precioPorHabitacion = calcularPrecioHabitacion(cantCamas, capacidadRestaurante, gimnacio);
        return new Hotel(cantHabitaciones, cantCamas, cantPisos, precioPorHabitacion, gimnacio, nombreRestaurante, capacidadRestaurante, alojamiento.getNombre(), alojamiento.getDireccion(), alojamiento.getLocalidad(), alojamiento.getGerente()) {};
    }
    
    public int calcularPrecioHabitacion(int capHotel, int capRestaurante, char gimnacio) {
    
        int precioHabitacion;
        precioHabitacion = 50 + capHotel;
        
        int valorPorRestaurante;
        
        if (capRestaurante < 30) {
            valorPorRestaurante = 10;
        }else if(capRestaurante >= 30 && capRestaurante <= 50) {
            valorPorRestaurante = 30;
        }else {
            valorPorRestaurante = 50;
        }
        int precioPorGimnacio;
        if(gimnacio == 'A') {
            precioPorGimnacio = 50;
        }else {
            precioPorGimnacio = 30;
        }
        
        return precioHabitacion + valorPorRestaurante + precioPorGimnacio;
        
    }
    
    public void MostrarListaHoteles() {
    
        
        ordenarListaHoteles();
        
        for (Hotel hotelDeLista : listaHoteles) {
            System.out.println(hotelDeLista.toString());
        }
    }
    
    public void ordenarListaHoteles() {
    
        Collections.sort(listaHoteles, new Comparator<Hotel>() {
        @Override
        public int compare(Hotel h1, Hotel h2) {
        return Integer.compare(h2.getPrecioHabitacion(), h1.getPrecioHabitacion());
        }
        
        });
    }
    
    public void guardarCuatroEstrellasEnListaAlojamiento(CuatroEstrellas cuatroEstrellas) {
    
        listaAlojamiento.add(cuatroEstrellas);
    }
}
 
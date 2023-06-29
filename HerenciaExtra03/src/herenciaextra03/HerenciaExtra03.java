

package herenciaextra03;

import Entidad.CincoEstrellas;
import Service.AlojamientoService;
import Service.CampingService;
import Service.CincoEstrellasService;
import Service.CuatroEstrellasService;
import Service.RecidenciaService;
import java.util.Scanner;


public class HerenciaExtra03 {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        AlojamientoService as = new AlojamientoService();
        CuatroEstrellasService ces = new CuatroEstrellasService();
        CincoEstrellasService cES = new CincoEstrellasService();
        CampingService cs = new CampingService();
        RecidenciaService rs = new RecidenciaService();
        

        
        
        boolean exit = false;
        
        while (!exit) {
        
            System.out.println("1. Ingresar Alojamiento");
            System.out.println("2. Ver todos los Alojamientos");
            System.out.println("3. Ver hoteles ordenados");
            System.out.println("4. Buscar todos los campings con restaurante");
            System.out.println("5. Buscar recidencias con descuentos");
            System.out.println("6. Salir");
            
            int option = sc.nextInt();
            
            switch (option) {
                case 1:
                    System.out.println("Agregar Hotel 4 estrellas");
                    System.out.println("Agregar Hotel 5 estrellas");
                    System.out.println("Agregar Camping");
                    System.out.println("Agregar recidencia");
                    
                    int optionAgregar = sc.nextInt();
                    
                    switch (optionAgregar) {
                        case 1:
                            System.out.println("Cuantos hoteles 4 estrellas desea agregar?");
                            int cant = sc.nextInt();
                            for (int i = 0; i < cant; i++) {
                              ces.guardarEnLista();
                            }
                            break;
                        case 2:
                            System.out.println("Cuantos hoteles 5 estrellas desea agregar?");
                            int cantC = sc.nextInt();
                            for (int i = 0; i < cantC; i++) {
                                cES.guardarCincoEstrellasEnLista();
                            }
                            break;
                        case 3:
                            System.out.println("Cuantos campings desea crear");
                            int cantCampings = sc.nextInt();
                            
                            for (int i = 0; i < cantCampings; i++) {
                                cs.guardarEnListas();
                            }
                            break;
                        case 4:
                            System.out.println("Ingrese cantidad de recidencias que desea crear");
                            int cantR = sc.nextInt();
                            
                            for (int i = 0; i < cantR; i++) {
                                rs.GuardarEnListas();
                            }
                            break;
                    }
                    break;
                case 2:
                   
                    as.MostrarListaAlojamientos();
                    
                    
                    break;
                    
                case 3:
                    ces.MostrarListaHoteles();
                    break;
                    
                case 4:
                    cs.mostrarCampingsCRestaurantes();
                    break;
                    
                case 5:
                    rs.mostrarRecidenciasConDescuento();
                    break;
                    
                case 6:
                    exit = true;
                    break;
                
              
            }
        }
    }

}

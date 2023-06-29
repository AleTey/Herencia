

package herenciaextra02;

import Entidad.Edificio;
import Entidad.Oficina;
import Entidad.Polideportivo;
import Service.OficinaService;
import Service.PolideportivoService;
import java.util.ArrayList;
import java.util.Scanner;


public class HerenciaExtra02 {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        PolideportivoService ps = new PolideportivoService();
        OficinaService os = new OficinaService();
        
        ArrayList<Edificio> listaEdificios = new ArrayList();
        
        System.out.println("cuantos Polideportivos desea crear?");
        int cantE = sc.nextInt();
        
        for (int i = 0; i < cantE ; i++) {
            
            listaEdificios.add(ps.crearPoliAuto(i));
        }
        
        System.out.println("Ingrese cantidad de edificios de oficinas que desea crear");
        int cantO = sc.nextInt();
        
        for (int i = 0; i < cantO; i++) {
            
            listaEdificios.add(os.crearOficinaAuto());
        }
        
        int cont = 0;
        for (Edificio edificio : listaEdificios) {
            
            
            if ( edificio instanceof Oficina) {
                Oficina oficina = (Oficina) edificio;
                System.out.println(oficina.toString());
                System.out.println(os.cantPersonasTotales(oficina));
                System.out.println("Sup: " + oficina.calcularSuperficie());
                System.out.println("Vol: " + oficina.calcularVolumen());
            }else {
                Polideportivo poli = (Polideportivo) edificio;
                System.out.println(poli.toString());
                if (poli.isTipo()) {
                    cont = cont + 1;                    
                }
                System.out.println("Sup: " + poli.calcularSuperficie());
                System.out.println("Vol: " + poli.calcularVolumen());
                
                
            }
                          
        }
        
        System.out.println("La cantidad de polideportivos techados es: " + cont);
    }

}

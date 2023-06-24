
package Service;

import Entidad.Electrodomestico;
import Entidad.Televisor;
import java.util.ArrayList;
import java.util.Scanner;


public class TelevisorService extends ElectrodomesticoService{
    
    Scanner sc = new Scanner(System.in);
    
    ArrayList<Televisor> tvList = new ArrayList();
    
    public Televisor crearTelevisor() {
    
        Electrodomestico electro = new Electrodomestico();
        Televisor tv = new Televisor();
        
        electro = crearElectrodomestico();
        tv.setColor(electro.getColor());
        tv.setConsumoElectrico(electro.getConsumoElectrico());
        tv.setPeso(electro.getPeso());
        tv.setPrecio(electro.getPrecio());
        
        System.out.println("Ingrese pulgadas de la tv");
        int pulgadas = sc.nextInt();
        sc.nextLine();
        boolean tdt = false;
        System.out.println("TDT? s/n");
        String rta = sc.nextLine();
        if(rta.equalsIgnoreCase("s")) {
            tdt = true;
            
        }
        tv.setResolucion(pulgadas);
        tv.setTDT(tdt);
        tv.setPrecio(1000);
//        tv.setPeso(precioFinalTv(electro, pulgadas, tdt));
        return tv;
    }
    
    @Override
    public double precioFinal1(Electrodomestico electro) {
    
        double precioSuper = super.precioFinal1(electro);
        Televisor tv = (Televisor) electro;
        
        double precioTv = 0;
        if (tv.getResolucion() > 40) {
            precioTv = (tv.getPrecio() * .3);
        }
        
        if (tv.isTDT()) {
            precioTv = precioTv + 500;
        }
    
        return precioTv + precioSuper;
    }
    
    public void agregarTv() {
    
        tvList.add(crearTelevisor());
    }
    
    public void mostrarTvList() {
    
        for (Televisor televisor : tvList) {
            System.out.println(televisor.toString());
        }
    }
}

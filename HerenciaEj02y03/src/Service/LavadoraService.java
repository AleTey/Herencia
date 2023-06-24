/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidad.Electrodomestico;
import Entidad.Lavadora;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class LavadoraService extends ElectrodomesticoService {
    
    ArrayList<Lavadora> listaLavadora = new ArrayList();
    Scanner sc = new Scanner(System.in);
    
    public Lavadora crearLavadora() {
        
        Electrodomestico electro = new Electrodomestico();
        Lavadora lavadora = new Lavadora();
        
        electro = crearElectrodomestico();
        lavadora.setColor(electro.getColor());
        lavadora.setConsumoElectrico(electro.getConsumoElectrico());
        lavadora.setPeso(electro.getPeso());
        lavadora.setPrecio(electro.getPrecio());
        
        System.out.println("Ingrese capacidad de carga");
        int carga = sc.nextInt();
        sc.nextLine();
        lavadora.setCarga(carga);
        
        lavadora.setPrecio(1000);
        
        return lavadora;
    }

    @Override
    public double precioFinal1(Electrodomestico electro) {
           
        double resultadoSuper = super.precioFinal1(electro);
        Lavadora lavadora = (Lavadora) electro;
        double precioLav = 0;
        if (lavadora.getCarga() > 30) {
            precioLav = 500;
        }
        
        return precioLav + resultadoSuper;
        
    }
    
    public void agregarLavadora() {
       
        listaLavadora.add(crearLavadora());
    }
    
    public void mostrarListaLavadora() {
        
        for (Lavadora lavadora : listaLavadora) {
            
            System.out.println(lavadora.toString());
            
        }
    }
    
}

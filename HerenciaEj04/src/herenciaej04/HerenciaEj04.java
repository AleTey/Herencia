/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package herenciaej04;

import Entidad.Circulo;
import Entidad.Rectangulo;
import Service.CirculoService;
import Service.RectanguloService;


public class HerenciaEj04 {


    public static void main(String[] args) {

        
        CirculoService cs = new CirculoService();
        RectanguloService rs = new RectanguloService();
        
        Circulo circulo = cs.crearCirculo();
        System.out.println(circulo.toString());
        System.out.println("Area: " + circulo.area());
        System.out.println("Perimetro: " + circulo.perimetro());
        
        System.out.println("----------------------------");
        
        Rectangulo rect = rs.crearRectangulo();
        System.out.println(rect.toString());
        System.out.println("Area: " + rect.area());
        System.out.println("Perimetro: " + rect.perimetro());
        
        
    }

}

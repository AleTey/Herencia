package Service;

import Entidad.Electrodomestico;
import java.util.ArrayList;
import java.util.Scanner;

public class ElectrodomesticoService {

    Scanner sc = new Scanner(System.in);

    ArrayList<Electrodomestico> eList = new ArrayList();

    public char comprobarConsumoEnergetico(char letra) {
        if (letra != 'a' && letra != 'b' && letra != 'c' && letra != 'd' && letra != 'e' && letra != 'f') {
            letra = 'f';
        }
        return letra;
    }

    public String comprobarColor(String color) {
        if (color.equalsIgnoreCase("blanco") && color.equalsIgnoreCase("negro") && color.equalsIgnoreCase("rojo") && color.equalsIgnoreCase("azul") && color.equalsIgnoreCase("gris")) {
            color = "blanco";
        }
        return color;
    }

    public Electrodomestico crearElectrodomestico() {

        System.out.println("Ingrese color");
        String color = sc.nextLine();
        sc.nextLine();
        color = comprobarColor(color);

        System.out.println("Ingrese nivel de consumo electrico");
        char caracter = sc.next().charAt(0);
        caracter = comprobarConsumoEnergetico(caracter);

        System.out.println("Ingrese peso");
        double peso = sc.nextDouble();

        double precio = 1000;
        return new Electrodomestico(precio, color, caracter, peso);
    }

    public void agregarElectrodomestico() {

        eList.add(crearElectrodomestico());
    }

    public double precioFinal1(Electrodomestico electro) {

        int costoConsumo = 100, costoPeso;
        char caracter = electro.getConsumoElectrico();

        if (electro.getPeso() > 0 && electro.getPeso() <= 19) {
            costoPeso = 100;
        } else if (electro.getPeso() >= 20 && electro.getPeso() <= 49) {
            costoPeso = 500;
        } else if (electro.getPeso() >= 50 && electro.getPeso() <= 79) {
            costoPeso = 800;
        } else {
            costoPeso = 1000;
        }

        switch (caracter) {
            case 'a':
                costoConsumo = 1000;
                break;
            case 'b':
                costoConsumo = 800;
                break;
            case 'c':
                costoConsumo = 600;
                break;
            case 'd':
                costoConsumo = 400;
                break;
            case 'e':
                costoConsumo = 300;
                break;
            case 'f':
                costoConsumo = 100;
                break;

        }

        return 1000 + costoConsumo + costoPeso;

    }

//    public double precioFinal(char caracter, double peso) {
//        int costoConsumo = 100, costoPeso;
//
//        if (peso > 0 && peso <= 19) {
//            costoPeso = 100;
//        } else if (peso >= 20 && peso <= 49) {
//            costoPeso = 500;
//        } else if (peso >= 50 && peso <= 79) {
//            costoPeso = 800;
//        } else {
//            costoPeso = 1000;
//        }
//
//        switch (caracter) {
//            case 'a':
//                costoConsumo = 1000;
//                break;
//            case 'b':
//                costoConsumo = 800;
//                break;
//            case 'c':
//                costoConsumo = 600;
//                break;
//            case 'd':
//                costoConsumo = 400;
//                break;
//            case 'e':
//                costoConsumo = 300;
//                break;
//            case 'f':
//                costoConsumo = 100;
//                break;
//
//        }
//
//        return 1000 + costoConsumo + costoPeso;
//    }

    public void mostrarElectrodomesticos() {

        for (Electrodomestico electrodomestico : eList) {
            System.out.println(electrodomestico.toString());
        }
    }
    
//    public void setPreciosLista() {
//        
//        for (Electrodomestico electrodomestico : eList) {
//            electrodomestico.setPrecio(0);
//        }
//    }
}

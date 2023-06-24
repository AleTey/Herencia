package herenciaej02;

import Entidad.Electrodomestico;
import Entidad.Lavadora;
import Entidad.Televisor;
import Service.ElectrodomesticoService;
import Service.LavadoraService;
import Service.TelevisorService;
import java.util.ArrayList;
import java.util.Scanner;

public class HerenciaEj02 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Electrodomestico> listaElectro = new ArrayList();

        ElectrodomesticoService es = new ElectrodomesticoService();
        LavadoraService ls = new LavadoraService();
        TelevisorService ts = new TelevisorService();
//        es.agregarElectrodomestico();
//        
//       es.mostrarElectrodomesticos();

//        System.out.println(es.precioFinal1(es.crearElectrodomestico()));
//        System.out.println(ls.precioFinal1(ls.crearLavadora()));
//        System.out.println(ts.precioFinal1(ts.crearTelevisor()));
        boolean exit = false;

        while (!exit) {

            System.out.println("1. Ingresar lavarropa");
            System.out.println("2. Ingresar TV");
            System.out.println("3. Ver electrodomesticos");
            System.out.println("4. Salir");

            int option = sc.nextInt();
            sc.nextLine();
                    
            switch (option) {
                case 1:
                    listaElectro.add(ls.crearLavadora());
                    break;

                case 2:
                    listaElectro.add(ts.crearTelevisor());
                    break;

                case 3:
                    double contL = 0,
                     contT = 0,
                     contTotal = 0;

                    for (Electrodomestico electrodomestico : listaElectro) {
                        if (electrodomestico instanceof Lavadora) {
                            Lavadora lav = (Lavadora) electrodomestico;
                            System.out.println(lav.toString());
                            System.out.println(ls.precioFinal1(lav));
                            contL = contL + ls.precioFinal1(lav);
                            System.out.println("Total lavadoras: " + contL);
                        } else if (electrodomestico instanceof Televisor) {
                            Televisor tv = (Televisor) electrodomestico;
                            System.out.println(tv.toString());
                            System.out.println(ts.precioFinal1(tv));
                            contT = contT + ts.precioFinal1(tv);
                            System.out.println("Total televisores: " + contT);
                        }

                    }
                    contTotal = contL + contT;
                    System.out.println("Total: " + contTotal);
                    break;
                
                case 4:
                    exit = true;
            }

        }
    }

}

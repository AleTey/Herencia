package herenciaextra01;

import Entidad.Barco;
import Entidad.BarcoMotor;
import Entidad.Velero;
import Entidad.Yate;
import Service.AmarreService;
import Service.BarcoMotorService;
import Service.BarcoService;
import Service.VeleroService;
import Service.YateService;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class HerenciaExtra01 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BarcoService bs = new BarcoService();
        VeleroService vs = new VeleroService();
        BarcoMotorService bms = new BarcoMotorService();
        YateService ys = new YateService();
        AmarreService as = new AmarreService();

        ArrayList<Barco> listaBarcos = new ArrayList();

        boolean exit = false;
        LocalDate fechaHoy = LocalDate.now();
        
        while (!exit) {
            
            System.out.println("La fecha de hoy es" + fechaHoy);
            as.actualizacion();
            
            System.out.println("1. Ingresar barco");
            System.out.println("2. Ingresar velero");
            System.out.println("3. Ingresar barco a motor");
            System.out.println("4. Ingresar yate");
            System.out.println("5. Amarrar barco");
            System.out.println("6. Mostrar barcos");            
            System.out.println("7. Ver puerto");
            System.out.println("8, Ver posiciones ocupadas del puerto");
//            System.out.println("9. Calcular amarre");

            int option = sc.nextInt();

            switch (option) {
                case 1:

                    System.out.println("1. Ingresar barco manual");
                    System.out.println("2. Ingresar barco auto");
                    int rta = sc.nextInt();
                    switch (rta) {
                        case 1:
                            listaBarcos.add(bs.crearBarcoManual());
                            break;
                        case 2:
                            listaBarcos.add(bs.crearBarcoAuto());
                            break;
                    }
                    break;

                case 2:
                    System.out.println("1. Ingresar velero manual");
                    System.out.println("2. Ingresar velero auto");
                    int rta2 = sc.nextInt();
                    switch (rta2) {
                        case 1:
                            listaBarcos.add(vs.crearVeleroManual());
                            break;
                        case 2:
                            listaBarcos.add(vs.crearVeleroAuto());
                            break;
                    }
                    break;

                case 3:
                    System.out.println("1. Ingresar barco a motor manual");
                    System.out.println("2. Ingresar barco a motor auto");
                    int rta3 = sc.nextInt();
                    switch (rta3) {
                        case 1:
                            listaBarcos.add(bms.crearBarcoMotorManual());
                            break;
                        case 2:
                            listaBarcos.add(bms.crearBarcoMotorAuto());
                            break;
                    }
                    break;

                case 4:
                    System.out.println("1. Ingresar yate a motor manual");
                    System.out.println("2. Ingresar yate a motor auto");
                    int rta4 = sc.nextInt();
                    switch (rta4) {
                        case 1:
                            listaBarcos.add(ys.crearYate());
                            break;
                        case 2:
                            listaBarcos.add(ys.crearYateAuto());
                            break;
                    }
                    break;

                case 5:
                    as.agregarBarco(listaBarcos);
                    break;
                    
                case 6:
                    for (Barco barco : listaBarcos) {
                        System.out.println(barco.toString());

                        if (barco instanceof Velero) {
                            System.out.println(vs.calculoAmarreVelero((Velero) barco));
                        } else if (barco instanceof Yate) {
                            System.out.println(ys.calcularAmarreYate((Yate) barco));
                        } else if (barco instanceof BarcoMotor) {
                            System.out.println(bms.calcularAmarreBarcoMotor((BarcoMotor) barco));

                        } else if (barco instanceof Barco) {
                            System.out.println(bs.CalculoAmarreBarco(barco));
                        }

                    }
                    break;
                
                case 7:
                    as.mostrarAmarres();
                    break;
                    
                case 8:
                    as.mostrarMuellePosiciones();
                    
                            
            }
        }
    }

}

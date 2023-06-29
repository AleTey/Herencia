package Service;

import Entidad.Amarre;
import Entidad.Barco;
import Entidad.BarcoMotor;
import Entidad.Velero;
import Entidad.Yate;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import static java.util.function.Predicate.isEqual;

public class AmarreService {

    Scanner sc = new Scanner(System.in);

    BarcoService bs = new BarcoService();
    VeleroService vs = new VeleroService();
    BarcoMotorService bms = new BarcoMotorService();
    YateService ys = new YateService();

    ArrayList<Amarre> listaAmarre = new ArrayList();
    boolean[] muelles = new boolean[100];

    public Amarre crearAmarreManual(ArrayList barcos) {

        System.out.println("ingrese nombre");
        String nombre = sc.nextLine();
        System.out.println("Ingrese dni");
        long dni = sc.nextLong();
        sc.nextLine();
        System.out.println("Ingrese fecha de entrada");
        String fechaEntrada = sc.nextLine();
        LocalDate fechaE = LocalDate.parse(fechaEntrada);
        System.out.println("Ingrese fecha de salida");
        String fechaSalida = sc.nextLine();
        LocalDate fechaS = LocalDate.parse(fechaSalida);
        Barco barcoo = null;
        int pos = 0;
        do {
            for (Object barco : barcos) {
                System.out.println(barco.toString());
            }
            System.out.println("Ingrese matricula del barco que desea amarrar");
            int matriculaBarco = sc.nextInt();

            for (int i = 0; i < 100; i++) {
                if (!muelles[i]) {
                    pos = i;
                    muelles[i] = true;
                    break;
                }
            }

            Iterator<Barco> it = barcos.iterator();
            while (it.hasNext()) {
                Barco barco1 = it.next();
                if (barco1.getMatricula() == matriculaBarco) {
                    barcoo = barco1;
                } else {
                    System.out.println("El barco no fue encontrado");
                    break;
                }
            }
        } while (barcoo == null);

        return new Amarre(nombre, dni, fechaE, fechaS, pos, barcoo);

    }

    public void agregarBarco(ArrayList barcos) {

        listaAmarre.add(crearAmarreManual(barcos));

    }

//    public void mostrarAmarres() {
//        for (Amarre amarre : listaAmarre) {
//            System.out.println(amarre.toString());
//
//        }
//    }

    public void mostrarMuellePosiciones() {

        for (int i = 0; i < 100; i++) {
            System.out.print(i + ": " + muelles[i] + ", ");
        }

    }

    public void actualizacion() {

        LocalDate fechaActual = LocalDate.now();
        Iterator<Amarre> it = listaAmarre.iterator();

        while (it.hasNext()) {
            Amarre amarre = it.next();
            if (amarre.getFechaPartida().isEqual(fechaActual)) {
                int pos = amarre.getPosicionAmarre();
                muelles[pos] = false;
                it.remove();
            }

        }
    }

    public void mostrarAmarres() {

        int cantDias;
        for (Amarre amarre : listaAmarre) {

            cantDias = (int) ChronoUnit.DAYS.between(amarre.getFechaIngreso(), amarre.getFechaPartida());

            System.out.println(amarre.toString());

            Barco barco = amarre.getBarcoQueAmarra();
            
            System.out.println("Cant dias = " + cantDias);
            System.out.print("Precio: ");

            if (barco instanceof Velero) {
                System.out.println(vs.calculoAmarreVelero((Velero) barco) * cantDias);
            } else if (barco instanceof Yate) {
                System.out.println(ys.calcularAmarreYate((Yate) barco) * cantDias);
            } else if (barco instanceof BarcoMotor) {
                System.out.println(bms.calcularAmarreBarcoMotor((BarcoMotor) barco) * cantDias);
            } else if (barco instanceof Barco) {
                System.out.println(bs.CalculoAmarreBarco(barco) * cantDias);
            }
        }

    }
}

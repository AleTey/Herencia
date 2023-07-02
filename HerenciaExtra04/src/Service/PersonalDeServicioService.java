package Service;

import Entidad.Empleado;
import Entidad.PersonalDeServicio;
import Enums.Seccion;
import java.util.Random;
import java.util.Scanner;
import java.util.TreeSet;

public class PersonalDeServicioService extends EmpleadoService {

    Scanner sc = new Scanner(System.in);

    TreeSet<PersonalDeServicio> treePersonalDeServicio = new TreeSet();

    public PersonalDeServicio crearPersonalDeServicio() {

        Empleado empleado = super.crearEmpleado();

        Random rand = new Random();

        Seccion[] seccion = Seccion.values();

        int numSecc = rand.nextInt(seccion.length);

        Seccion atributoSeccion = seccion[numSecc];

        return new PersonalDeServicio(atributoSeccion, empleado.getAnioIncorporacion(), empleado.getNroDespacho(), empleado.getNombreYApellido(), empleado.getDni(), empleado.getEstadoCivil());
    }

    public void agregarAListas() {

        PersonalDeServicio personalDeServicio = crearPersonalDeServicio();

        mapPersonas.put(personalDeServicio.getDni(), personalDeServicio);
        treeEmpleados.add(personalDeServicio);
        treePersonalDeServicio.add(personalDeServicio);
    }

    public PersonalDeServicio buscarPersonalDeServicio(int dni) {
        for (PersonalDeServicio personalDeServicio : treePersonalDeServicio) {
            if (personalDeServicio.getDni() == dni) {
                return personalDeServicio;
            }
        }
        return null;
    }

    public Seccion elegirNuevaSeccion() {
        Seccion[] listaSecciones = Seccion.values();
        for (int i = 0; i < listaSecciones.length; i++) {
            System.out.println(i + 1 + ". " + listaSecciones[i]);
        }
        System.out.println("Eliga una nueva seccion");
        int nroElegido = sc.nextInt() - 1;
        Seccion seccionElegida = listaSecciones[nroElegido];

        return seccionElegida;
    }
}

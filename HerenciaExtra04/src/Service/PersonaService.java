package Service;

import Entidad.Persona;
import Enums.EstadoCivil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class PersonaService {

    String[] nombres = new String[]{"Juan", "Miguel", "Alcides", "Ramiro", "Edu", "Gero", "Juan", "Ale", "Anto", "Nati", "Carlos", "Ruben", "Matias", "Julian", "Mario", "Nani"};
    String[] apellidos = new String[]{"Gonzalez", "Lopez", "Fernandez", "Garcia", "Perez", "Martinez", "Gomez", "Galarza", "Diaz", "Alvarez", "Romero", "Sosa", "Ruiz", "Torres", "Suarez", "Castro", "Acosta", "Flores"};

    ArrayList<Persona> listaPersonas = new ArrayList();
    static HashMap<Integer, Persona> mapPersonas = new HashMap();

    public Persona crearPersona() {

        Random rand = new Random();
        int numN = rand.nextInt(15);
        String nombre = nombres[numN];
        int numA = rand.nextInt(18);
        String apellido = apellidos[numA];

        String nombreCompleto = nombre + " " + apellido;
        int dni = rand.nextInt(53000000 - 6000000 + 1) + 6000000;
        boolean estadoC = rand.nextBoolean();
        EstadoCivil estado;
        if (estadoC) {
            estado = EstadoCivil.CASADO;
        } else {
            estado = EstadoCivil.SOLTERO;
        }

        return new Persona(nombreCompleto, dni, estado) {
        };
    }

    public void guardarPersona() {

        Persona persona = crearPersona();

        listaPersonas.add(persona);
        mapPersonas.put(persona.getDni(), persona);
        
    }

    public void mostrarListaPersonas() {

        for (Persona persona : listaPersonas) {
            System.out.println(persona.toString());
        }
    }

    public void mostrarMapPersonas() {

        for (Map.Entry<Integer, Persona> entry : mapPersonas.entrySet()) {
            System.out.println("DNI: " + entry.getKey()
                    + "Persona: " + entry.getValue().toString());

        }
    }

    public Persona buscarPersona(int dni) {

        for (Map.Entry<Integer, Persona> entry : mapPersonas.entrySet()) {
            if (dni == entry.getKey()) {
                return entry.getValue();
            }
        }
        return null;

    }
}

package herenciaextra04;

import Entidad.Alumno;
import Entidad.Empleado;
import Entidad.Persona;
import Entidad.PersonalDeServicio;
import Entidad.Profesor;
import Enums.Curso;
import Service.AlumnoService;
import Service.EmpleadoService;
import Service.PersonaService;
import Service.PersonalDeServicioService;
import Service.ProfesorService;
import java.util.Scanner;

public class HerenciaExtra04 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ProfesorService ps = new ProfesorService();
        PersonaService personaS = new PersonaService();
        PersonalDeServicioService pds = new PersonalDeServicioService();
        EmpleadoService es = new EmpleadoService();
        AlumnoService as = new AlumnoService();
        
//        PersonaService ps = new PersonaService();
//
//        System.out.println("Ingrese cantidad de personas que desea agregar");
//        int cantP = sc.nextInt();
//
//        for (int i = 0; i < cantP; i++) {
//            ps.guardarPersona();
//        }
//
//        ps.mostrarListaPersonas();
        boolean exit = false;

        while (!exit) {

            System.out.println("1. Agreagar profesor");
            System.out.println("2. Agregar personal de servicio");
            System.out.println("3. Agregar alumno");
            System.out.println("4. Buscar Persona");
            System.out.println("5. Cambio estado civil");
            System.out.println("6. Reasignacion de despacho a un empleado");
            System.out.println("7. Matricular estudiante a un nuevo curso");
            System.out.println("8. Cambiar departamento a profesor");
            System.out.println("9. Trasladar de seccion a un empleado de servicio");
            System.out.println("10. Ver todos");
            System.out.println("11. Ver Empleados");
            System.out.println("12. Salir");

            int option = sc.nextInt();

            switch (option) {
                case 1:
                    ps.agregarAListas();
                    break;

                case 2:
                    pds.agregarAListas();
                    break;

                case 3:
                    as.agregarAListaAlumnos();
                    break;

                case 4:
                    System.out.println("Ingrese dni de la persona que desea buscar");
                    int dni = sc.nextInt();
                    Persona personaBuscada = ps.buscarPersona(dni);
                    if(personaBuscada == null) {
                        System.out.println("No se ah encontrado en el sistema");
                    }else {
                        System.out.println(personaBuscada.toString());
                    }
                    
                    break;

                case 5:
                    System.out.println("Ingrese el dni de la persona");
                    dni = sc.nextInt();
                    personaBuscada = ps.buscarPersona(dni);
                    if(personaBuscada == null) {
                        System.out.println("No se ah encontrado en el sistema");
                    }else {
                        System.out.println(personaBuscada.toString());
                        System.out.println("El estado civil de " + personaBuscada.getNombreYApellido() + " es " + personaBuscada.getEstadoCivil() + ". Desea cambiarlo? S/N");
                        String rta = sc.nextLine();
                        rta = sc.nextLine();
                        if(rta.equalsIgnoreCase("s")) {
                            personaBuscada.cambiarEstadoCivil();
                            System.out.println("El nuevo estado civil de " + personaBuscada.getNombreYApellido() + " es " + personaBuscada.getEstadoCivil());
                        }
                    }
                    break;

                case 6:
                    System.out.println("Ingrese el dni del empleado");
                    dni = sc.nextInt();
                    Empleado empleadoBuscado = es.buscarEmpleado(dni);
                    if(empleadoBuscado == null) {
                        System.out.println("No se ah encontrado en el sistema");
                    }else {
                        
                        System.out.println("El despacho actual de " + empleadoBuscado.getNombreYApellido() + " es " + empleadoBuscado.getNroDespacho());
                    }
                    System.out.println("Ingrese el nuevo nro de despacho");
                    int nuevoDespacho = sc.nextInt();
                    empleadoBuscado.cambiarDespacho(nuevoDespacho);
                    break;

                case 7:
                    System.out.println("Ingrese el dni del empleado");
                    dni = sc.nextInt();
                    Alumno alumnoBuscado = as.buscarAlumno(dni);
                    if(alumnoBuscado == null){
                        System.out.println("El alumno no fue encontrado");
                    }else {
                        System.out.println("El alumno ya esta inscripto en " + alumnoBuscado.getCurso());
                        System.out.println("En que otro curso desea inscribirlo?");
                        Curso[] listaCursos = Curso.values();
                        for (int i = 0; i < listaCursos.length; i++) {
                            System.out.println(i + 1 + ". " + listaCursos[i]);
                        }
                        int eleccionNuevoCurso = sc.nextInt();
                        Curso nuevoCurso = listaCursos[eleccionNuevoCurso - 1];
                        alumnoBuscado.getCurso().add(nuevoCurso);
                    }
                    break;

                case 8:
                    System.out.println("Ingrese dni del profesor");
                    dni = sc.nextInt();
                    Profesor profesor = ps.buscarProfesor(dni);
                    if(profesor == null) {
                        System.out.println("El profesor no fue encontrado");
                    }else {
                        System.out.println(profesor.getNombreYApellido() + " se encuentra en el departamento " + profesor.getDepartamento());
                        profesor.cambiarDepartamento(ps.elegirNuevoDepartamento());
                    }
                    break;

                case 9:
                    System.out.println("Ingrese el dni del presonal q desea cambiar de seccion");
                    dni = sc.nextInt();
                    PersonalDeServicio personalDeServicio = pds.buscarPersonalDeServicio(dni);
                    if (personalDeServicio == null) {
                        System.out.println("El empleado buscado no fue encontrado");
                    }else {
                        System.out.println(personalDeServicio.getNombreYApellido() + " se encuentra en la seccion " + personalDeServicio.getSeccion());
                        personalDeServicio.cambiarSeccion(pds.elegirNuevaSeccion());
                    }
                    break;

                case 10:
                    personaS.mostrarMapPersonas();
                    break;

                case 11:
                    es.mostrarEmpleados();
                    break;

                case 12:
                        exit = true;
                    break;
            }

        }

    }

}

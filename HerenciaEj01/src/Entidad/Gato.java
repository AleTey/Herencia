
package Entidad;

public class Gato extends Animal {

    public Gato() {
    }

    public Gato(String nombre, String alimento, int edad, String raza) {
        super(nombre, alimento, edad, raza);
    }
    

    @Override
    public void Alimentarse(String alimento) {
        System.out.println("come: " + alimento);
        
    }
}

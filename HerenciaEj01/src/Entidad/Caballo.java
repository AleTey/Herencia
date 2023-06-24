
package Entidad;


public class Caballo extends Animal {

    public Caballo() {
    }

    public Caballo(String nombre, String alimento, int edad, String raza) {
        super(nombre, alimento, edad, raza);
    }
    
  
    @Override
    public void Alimentarse(String alimento) {
        System.out.println("come: " + alimento);
    }
    
}

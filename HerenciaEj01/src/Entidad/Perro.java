
package Entidad;

public class Perro extends Animal{

    public Perro() {
    }

    public Perro(String nombre, String alimento, int edad, String raza) {
        super(nombre, alimento, edad, raza);
    }

  
    @Override
    public void Alimentarse(String alimento) {
        System.out.println("come: " + alimento);
    }
    
}

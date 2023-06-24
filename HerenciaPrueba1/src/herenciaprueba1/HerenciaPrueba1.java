/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package herenciaprueba1;

import Entidad.Animal;
import Entidad.Gato;
import Entidad.Perro;
import java.util.ArrayList;


public class HerenciaPrueba1 {


    public static void main(String[] args) {

      Animal a = new Animal();
      Gato b = new Gato();
      Perro c = new Perro();
      
      ArrayList<Animal> Array= new ArrayList();
      Array.add(a);
      Array.add(b);
      Array.add(c);
      
        for (Animal animal : Array) {
            animal.hacerRuido();
        }
    }

}

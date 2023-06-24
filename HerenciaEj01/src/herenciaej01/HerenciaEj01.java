

package herenciaej01;

import Entidad.Caballo;
import Entidad.Gato;
import Entidad.Perro;


public class HerenciaEj01 {


    public static void main(String[] args) {

        Perro perro1 = new Perro("perrito", "alimento canino", 3, "pitbull");
        Perro perro2 = new Perro("perrito2", "carne", 4, "doberman");
        Gato gato1 = new Gato("gatito", "atun", 6, "gato");
        Gato gato2 = new Gato("gatito2", "alimento para gato", 7, "gato");
        Caballo caballo = new Caballo("caballo", "zanahorias", 3, "puro");
        
        perro1.Alimentarse(perro1.getAlimento());
    }

}

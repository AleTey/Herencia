
package Service;

import Entidad.Circulo;

public class CirculoService {
    
    /**
     *
     * @return
     */
    public Circulo crearCirculo() {
    
        double radio = 1 + (Math.random() * 9);
        double diametro = radio * 2;
        
        return new Circulo(radio, diametro);
    }
}

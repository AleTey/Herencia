
package Service;

import Entidad.Rectangulo;


public class RectanguloService {
    
    public Rectangulo crearRectangulo() {
    
        double base = 1 + (Math.random() * 9);
        double altura = 1 + (Math.random() * 9);
        
        return new Rectangulo(base, altura);
    }
}

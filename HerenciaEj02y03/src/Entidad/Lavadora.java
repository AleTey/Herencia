
package Entidad;


public class Lavadora extends Electrodomestico {
    
    private int carga;

    public Lavadora() {
    }

    
    
    public Lavadora(int carga) {
        
    }

    public Lavadora(int carga, double precio, String color, char consumoElectrico, double peso) {
        super(precio, color, consumoElectrico, peso);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }



    @Override
    public String toString() {
        return "Lavadora{" + "carga=" + carga + "precio=" + precio + ", color=" + color + ", consumoElectrico=" + consumoElectrico + ", peso=" + peso + '}';
    }

    
   
    }

  
    
    

 
    
    


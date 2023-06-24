
package Entidad;

public class Televisor extends Electrodomestico {
    
    private int resolucion;
    private boolean TDT;

    public Televisor() {
    }

    public Televisor(int resolucion, boolean TDT, double precio, String color, char consumoElectrico, double peso) {
        super(precio, color, consumoElectrico, peso);
        this.resolucion = resolucion;
        this.TDT = TDT;
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isTDT() {
        return TDT;
    }

    public void setTDT(boolean TDT) {
        this.TDT = TDT;
    }

    @Override
    public String toString() {
        return "Televidor{" + "resolucion=" + resolucion + ", TDT=" + TDT + ", precio=" + precio + ", color=" + color + ", consumoElectrico=" + consumoElectrico + ", peso=" + peso + '}';
    }

   
    
    
    
}

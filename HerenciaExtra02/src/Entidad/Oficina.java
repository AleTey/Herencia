
package Entidad;


public class Oficina extends Edificio {

    private int nroOficinas;
    private int personasPorOficina;
    private int nroPisos;

    public Oficina() {
    }

    public Oficina(int nroOficinas, int personasPorOficina, int nroPisos, int ancho, int alto, int largo) {
        super(ancho, alto, largo);
        this.nroOficinas = nroOficinas;
        this.personasPorOficina = personasPorOficina;
        this.nroPisos = nroPisos;
    }

    public int getNroOficinas() {
        return nroOficinas;
    }

    public void setNroOficinas(int nroOficinas) {
        this.nroOficinas = nroOficinas;
    }

    public int getPersonasPorOficina() {
        return personasPorOficina;
    }

    public void setPersonasPorOficina(int personasPorOficina) {
        this.personasPorOficina = personasPorOficina;
    }

    public int getNroPisos() {
        return nroPisos;
    }

    public void setNroPisos(int nroPisos) {
        this.nroPisos = nroPisos;
    }
    
    
    
    @Override
    public double calcularSuperficie() {
        double superficie = alto * ancho;
        
        return superficie;
    }

    @Override
    public double calcularVolumen() {
        double volumen = alto * ancho * alto;
        
        return volumen;
    }

    @Override
    public String toString() {
        return "Oficina{" + "nroOficinas=" + nroOficinas + ", personasPorOficina=" + personasPorOficina + ", nroPisos=" + nroPisos + ", ancho=" + ancho + ", alto=" + alto + ", largo=" + largo + '}';
    }
    
    
}

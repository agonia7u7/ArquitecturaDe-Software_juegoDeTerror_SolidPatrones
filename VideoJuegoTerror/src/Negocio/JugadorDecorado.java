package Negocio;
import java.util.ArrayList;
public interface JugadorDecorado {
    void realizarAccion();
    int getPosicion();
    void setPosicion(int posicion);
    public void agregarObservador(Observador observador);
    
    public ArrayList getObservadores();
    
}
package Negocio;
import java.util.ArrayList;
import java.util.List;
public class JugadorPrincipal implements JugadorDecorado {
    private static JugadorPrincipal instancia;
    private int posicion;
    private ArrayList<Observador> observadores = new ArrayList();
    private JugadorPrincipal() {
        this.posicion = 0;
    }

    @Override
       public void agregarObservador(Observador observador) {
        observadores.add(observador);
    }
    
    @Override
    public ArrayList getObservadores(){
     return observadores;
    }
    
    public static JugadorPrincipal getInstancia() {
        if (instancia == null) {
            instancia = new JugadorPrincipal();
        }
        return instancia;
    }
    @Override
    public int getPosicion() {
        return posicion;
    }
    @Override
    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    @Override
    public void realizarAccion() {
        System.out.println("El jugador principal no tiene armas.");
    }
   
}

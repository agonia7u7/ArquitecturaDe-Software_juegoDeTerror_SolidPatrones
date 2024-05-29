package Negocio;

import java.util.ArrayList;
public abstract class DecoradorJugador implements JugadorDecorado {
    protected JugadorDecorado jugadorDecorado;

    public DecoradorJugador(JugadorDecorado jugadorDecorado) {
        this.jugadorDecorado = jugadorDecorado;
    }

        @Override
    public void realizarAccion() {
        jugadorDecorado.realizarAccion();
    }
    
    @Override
    public int getPosicion() {
        return jugadorDecorado.getPosicion();
    }

    @Override
    public void setPosicion(int posicion) {
        jugadorDecorado.setPosicion(posicion);
    }
   
    
     @Override
       public void agregarObservador(Observador observador) {
        jugadorDecorado.agregarObservador(observador);
    }
    @Override
    public ArrayList getObservadores(){
      return jugadorDecorado.getObservadores();
    }
}
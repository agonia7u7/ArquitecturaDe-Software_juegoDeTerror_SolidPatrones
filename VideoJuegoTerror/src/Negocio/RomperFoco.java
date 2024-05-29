package Negocio;

import java.util.ArrayList;
import java.util.List;
public class RomperFoco extends DecoradorJugador {
    public RomperFoco(JugadorDecorado jugadorDecorado) {
        super(jugadorDecorado);
    }

    @Override
    public void realizarAccion() {
        
        System.out.println("El jugador principal tiene piedras.");
        notificarObservadores();
    }
    
   public void notificarObservadores() {
        ArrayList<Observador> observadores =getObservadores();
        for (Observador observador : observadores) {
            observador.actualizar();
        }
    }
}
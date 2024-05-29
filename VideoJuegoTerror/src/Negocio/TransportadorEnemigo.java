package Negocio;

public class TransportadorEnemigo implements Observador {
    private Enemigo enemigo;

    public TransportadorEnemigo(Enemigo enemigo) {
        this.enemigo = enemigo;
    }

    @Override
    public void actualizar() {
        
            // Transportar al enemigo a una posición adyacente al jugador
            int nuevaPosicion = JugadorPrincipal.getInstancia().getPosicion() + 1; // Por ejemplo, mover una posición a la derecha
            enemigo.setPosicion(nuevaPosicion);
            System.out.println("El enemigo se ha transportado a la posición " + nuevaPosicion);
        
    }
}
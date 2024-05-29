package Datos;
import Negocio.JugadorDecorado;
import Negocio.Enemigo;
import Negocio.Mapa;
import Negocio.JugadorPrincipal;
import Negocio.TransportadorEnemigo;
import Negocio.Observador;
import Negocio.RomperFoco;
import java.util.ArrayList;
import java.util.List;

public class Guardar {
    private ArrayList<Object> savedState;
    private static Guardar instancia;

    private Guardar() {
        savedState = new ArrayList<>();
    }

    public static Guardar getInstancia() {
        if (instancia == null) {
            instancia = new Guardar();
        }
        return instancia;
    }

    public void guardarJuego(Mapa mapa, JugadorDecorado jugador, Enemigo enemigo) {
        savedState.clear();
        savedState.add(mapa);
        savedState.add(jugador);
        savedState.add(enemigo);
    }

    public List<Object> cargarJuego() {
        return savedState;
    }
}

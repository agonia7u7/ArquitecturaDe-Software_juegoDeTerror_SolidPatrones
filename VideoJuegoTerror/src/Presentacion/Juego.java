package Presentacion;
import Negocio.JugadorDecorado;
import Negocio.Enemigo;
import Negocio.Mapa;
import Negocio.JugadorPrincipal;
import Negocio.TransportadorEnemigo;
import Negocio.Observador;
import Negocio.RomperFoco;
import java.util.Arrays;
import java.util.Scanner;
public class Juego {
    private JugadorDecorado jugador ;
    private Enemigo enemigo;
    private Mapa mapa;
    public Juego() {
        this.jugador = JugadorPrincipal.getInstancia();
        this.mapa = new Mapa(20);
        enemigo = new Enemigo(15); // Enemigos en posiciones 5 y 15
        
        Observador transportador = new TransportadorEnemigo(enemigo);
        jugador.agregarObservador(transportador);
        
        
    }

    public void mostrarMapa() {
        int longitud = mapa.getTerreno().length;
        boolean[] terreno = mapa.getTerreno();
        System.out.println("jugador Miles Upshur = J");
        System.out.println("Loco = E");
        System.out.println("lugar iluminado = I");
        System.out.println("lugar apagado = A");
        for (int i = 0; i < longitud; i++) {
            if (terreno[i] == true){
                if(jugador.getPosicion() == i){
                    if(enemigo.getPosicion() == i){
                        System.out.print("IJE   ");
                    }else{
                        System.out.print("IJ   ");
                    }
                }else{
                    if(enemigo.getPosicion() == i){
                        System.out.print("IE   ");
                    }else{
                        System.out.print("I   ");
                    }
                }

            }
            if (terreno[i] == false){
                if(jugador.getPosicion() == i){
                    if(enemigo.getPosicion() == i){
                        System.out.print("AJE   ");
                    }else{
                        System.out.print("AJ   ");
                    }
                    
                }else{
                    if(enemigo.getPosicion() == i){
                        System.out.print("AE   ");
                    }else{
                        System.out.print("A   ");
                    }
                }

            }
        }
        System.out.println();
    }

    public void moverJugador(int pasos) {
        int longitud = mapa.getTerreno().length;
        boolean[] terreno = mapa.getTerreno();
        int nuevaPosicion = Math.min(jugador.getPosicion() + pasos, longitud - 1);
        jugador.setPosicion(nuevaPosicion);
        System.out.println("El jugador se ha movido a la posición " + nuevaPosicion);
        checkEnemigos();

    }

    private void checkEnemigos() {
        boolean[] terreno = mapa.getTerreno();
        if (enemigo.getPosicion() == jugador.getPosicion() && terreno[jugador.getPosicion()]) {
            System.out.println("¡El enemigo te ha alcanzado ");

        }
        if (enemigo.getPosicion() < jugador.getPosicion()) {
            enemigo.mover(1);
        } else if (enemigo.getPosicion() > jugador.getPosicion()) {
            enemigo.mover(-1);
        }
        if (enemigo.getPosicion() == jugador.getPosicion() && terreno[jugador.getPosicion()]) {
            System.out.println("¡El enemigo te ha alcanzado ");

        }

    }

    public boolean verificarVictoria() {
        int longitud = mapa.getTerreno().length;
        return jugador.getPosicion() == longitud - 1;
    }

    public void esperarJugador(){
        checkEnemigos();
    }
    public void armarJugador(){
        jugador = new RomperFoco(jugador);
    }
    
    public void accionJugador(){
        jugador.realizarAccion();
    }
    public static void main(String[] args) {
        Juego juego = new Juego();
        juego.mostrarMapa();
        Scanner scanner = new Scanner(System.in);

        while (!juego.verificarVictoria()) {
            // Simulamos el movimiento del jugador y de los enemigos
            System.out.println(" ");
            System.out.println("pulse 1 para avanzar, 2 para esperar, 3 para armar, 4 para realizar accion ");
            int numero = scanner.nextInt();
            if(numero == 1){ 
                
                juego.moverJugador(2);
            }
            if(numero == 2 ){
                juego.esperarJugador();
            }
            if(numero == 3){
                juego.armarJugador();
            }
            if(numero == 4){
                juego.accionJugador();
            }
            
            juego.mostrarMapa();
        }

        System.out.println("¡Felicidades, has ganado!");
    }
}
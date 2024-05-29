package Negocio;

public class Enemigo {
    private int posicion;

    public Enemigo(int posicion) {
        this.posicion = posicion;
    }

    public int getPosicion() {
        return posicion;
    }
       public void setPosicion(int posicion) {
        this.posicion = posicion;
    }
    public void mover(int pasos) {
        posicion += pasos;
    }
}

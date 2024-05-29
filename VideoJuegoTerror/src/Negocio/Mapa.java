package Negocio;
import java.util.Arrays;
public class Mapa {
    private boolean[] terreno;
    
    public Mapa(int longitud) {
        
        terreno = new boolean[longitud];
        Arrays.fill(terreno, true); // Inicialmente, todas las posiciones son oscuras
        
        terreno[0] = true;// La posición inicial del jugador está iluminada
        for(int i = 1 ; i < terreno.length ; i = i + 3){
            terreno[i] = false;
        }
    }
    public boolean[] getTerreno(){
    return terreno;
    }
    
 
}
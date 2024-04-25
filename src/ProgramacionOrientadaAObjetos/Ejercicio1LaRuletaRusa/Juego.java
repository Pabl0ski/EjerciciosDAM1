package ProgramacionOrientadaAObjetos.Ejercicio1LaRuletaRusa;

import java.util.ArrayList;
import java.util.List;
public class Juego {
    //Atributos
    private List<Jugador> jugadores;
    private Revolver revolver;

    //Constructor
    public Juego (int numJugadores){
        this.jugadores=new ArrayList<>();
        for (int i = 0; i <= numJugadores ; i++) {
            this.jugadores.add(new Jugador(i));
        }
        this.revolver=new Revolver();
    }

    //Funciones
    public boolean finJuego(){
        for (Jugador jugador : this.jugadores){
            if (!jugador.isVivo())
                return true; //Devuelve true si algún jugador ha muerto;
        }
        return false;
    }

    public void ronda() {
        for (Jugador jugador : this.jugadores) {
            System.out.println("Es el turno de " + jugador.getNombre());
            System.out.println(jugador.getNombre() + " se apunta con la pistola.");
            jugador.disparar(this.revolver);
            if (!jugador.isVivo()) {
                System.out.println("Ha muerto.");
            } else {
                System.out.println("se ha librado...");
            }
            this.revolver.siguienteBala();
        }
    }
}

package ProgramacionOrientadaAObjetos.Ejercicio1LaRuletaRusa;

public class MainRuleta {
    public static void main(String[] args) {
        Juego juego = new Juego (6);
        while (!juego.finJuego()){
            juego.ronda();
        }
        System.out.println("El juego ha terminado");
    }
}

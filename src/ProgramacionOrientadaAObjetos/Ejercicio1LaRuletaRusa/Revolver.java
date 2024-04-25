package ProgramacionOrientadaAObjetos.Ejercicio1LaRuletaRusa;

public class Revolver {
    //Atributos
    private int posicionActual;
    private int posicionBala;

    //Constructor
    public Revolver(){
        this.posicionActual=0;
        this.posicionBala= (int) (Math.random()* 6) + 1; //Genera aleatorieamente la posicion de la bala
    }

    //Funciones

    public boolean disparar(){
        return this.posicionActual == this.posicionBala; //Devuelve true si la posicion de la bala coincide con la posicion actual
    }

    public void siguienteBala (){
        this.posicionActual = (this.posicionActual % 6)+1; //Cambia a la siguiente posicion del tambor
    }

    @Override
    public String toString() {
        return "Posicion actual: " + this.posicionActual + ", Posicion de la bala: " + this.posicionBala;
    }
}

package ProgramacionOrientadaAObjetos.Ejercicio1LaRuletaRusa;

public class Jugador {
    //Atributos
    private int id;
    private String nombre;
    private boolean vivo;

    //Constructor
    public Jugador(int id){
        this.id=id;
        this.nombre= "Jugador"+id;
        this.vivo= true;
    }

    //Getters y setters


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isVivo() {
        return vivo;
    }

    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }

    //Funciones
    public void disparar(Revolver r){
        if (r.disparar()){
            this.vivo = false; //El jugador muere si la vala se dispara
        }
    }
}

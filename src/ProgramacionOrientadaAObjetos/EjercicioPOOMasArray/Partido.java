package ProgramacionOrientadaAObjetos.EjercicioPOOMasArray;

public class Partido {
    private static int contadorPartidos=0;
    private int idPartido;
    private String equipoLocal;
    private String EquipoVisitante;
    private int golesLocal;
    private int golesVisitante;

    public Partido(String equipoLocal, String getEquipoVisitante, int golesLocal, int golesVisitante){
        this.idPartido = ++contadorPartidos;
        this.equipoLocal=equipoLocal;
        this.EquipoVisitante =getEquipoVisitante;
        this.golesLocal=golesLocal;
        this.golesVisitante=golesVisitante;
    }

    //Getters para acceder a los atributos de los partidos


    public static int getContadorPartidos() {
        return contadorPartidos;
    }

    public static void setContadorPartidos(int contadorPartidos) {
        Partido.contadorPartidos = contadorPartidos;
    }

    public int getIdPartido() {
        return idPartido;
    }

    public void setIdPartido(int idPartido) {
        this.idPartido = idPartido;
    }

    public String getEquipoLocal() {
        return equipoLocal;
    }

    public void setEquipoLocal(String equipoLocal) {
        this.equipoLocal = equipoLocal;
    }

    public String getEquipoVisitante() {
        return EquipoVisitante;
    }

    public void setEquipoVisitante(String equipoVisitante) {
        this.EquipoVisitante = equipoVisitante;
    }

    public int getGolesLocal() {
        return golesLocal;
    }

    public void setGolesLocal(int golesLocal) {
        this.golesLocal = golesLocal;
    }

    public int getGolesVisitante() {
        return golesVisitante;
    }

    public void setGolesVisitante(int golesVisitante) {
        this.golesVisitante = golesVisitante;
    }
}

package ProgramacionOrientadaAObjetos.EJ3Astros;

public abstract class Astro {
    private String nombre;
    private double radio;
    private double RotacionEje;
    private double masa;
    private double temperatura;
    private double gravedad;

    public Astro(){
    }

    public Astro(String nombre, double radio, double RotacionEje, double masa, double temperaturaMedia, double gravedad){
        this.nombre=nombre;
        this.gravedad=gravedad;
        this.RotacionEje=RotacionEje;
        this.masa=masa;
        this.temperatura =temperaturaMedia;
        this.gravedad=gravedad;
    }

    public abstract void muestra();
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getRotacionEje() {
        return RotacionEje;
    }

    public void setRotacionEje(double rotacionEje) {
        RotacionEje = rotacionEje;
    }

    public double getMasa() {
        return masa;
    }

    public void setMasa(double masa) {
        this.masa = masa;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public double getGravedad() {
        return gravedad;
    }

    public void setGravedad(double gravedad) {
        this.gravedad = gravedad;
    }

    @Override
    public String toString() {
        return "Astro{" +
                "nombre='" + nombre + '\'' +
                ", radio=" + radio +
                ", RotacionEje=" + RotacionEje +
                ", masa=" + masa +
                ", temperatura=" + temperatura +
                ", gravedad=" + gravedad +
                '}';
    }
}













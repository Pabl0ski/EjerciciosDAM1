package ProgramacionOrientadaAObjetos.EJ3Astros;

public class Satelite extends Astro{
    private double distanciaPlaneta;
    private double orbitaPlaneta;
    private Planeta planeta;

    public Satelite(){

    }

    public Satelite(String nombre, double radio, double RotacionEje, double masa, double temperaturaMedia, double gravedad,
                    double distanciaPlaneta, double orbitaPlaneta, Planeta planeta) {
        super(nombre, radio, RotacionEje, masa, temperaturaMedia, gravedad);
        this.distanciaPlaneta = distanciaPlaneta;
        this.orbitaPlaneta = orbitaPlaneta;
        this.planeta = planeta;
    }

    public void setPlaneta(Planeta planeta){
        this.planeta=planeta;
    }

    @Override
    public String toString() {
        return "Satelite{" +
                "distanciaPlaneta=" + distanciaPlaneta +
                ", orbitaPlaneta=" + orbitaPlaneta +
                ", planeta=" + planeta +
                '}' + super.toString();
    }

    public double getDistanciaPlaneta() {
        return distanciaPlaneta;
    }

    public void setDistanciaPlaneta(double distanciaPlaneta) {
        this.distanciaPlaneta = distanciaPlaneta;
    }

    public double getOrbitaPlaneta() {
        return orbitaPlaneta;
    }

    public void setOrbitaPlaneta(double orbitaPlaneta) {
        this.orbitaPlaneta = orbitaPlaneta;
    }

    public Planeta getPlaneta() {
        return planeta;
    }

    @Override
    public void muestra() {
        System.out.println("*** SATÉLITE " + getNombre() + " ***");
        System.out.println("Radio            : " + getRadio());
        System.out.println("Rotación eje     : " + getRotacionEje());
        System.out.println("Masa:            : " + getMasa());
        System.out.println("Temperatura media: " + getTemperatura());
        System.out.println("Gravedad         : " + getGravedad());
        System.out.println("Distancia planeta: " + getDistanciaPlaneta());
        System.out.println("Órbita al planeta: " + getOrbitaPlaneta());
        System.out.println("Pertenece planeta: " + planeta.getNombre());
    }
}

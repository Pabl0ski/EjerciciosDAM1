package ProgramacionOrientadaAObjetos.EJ3Astros;

import java.util.ArrayList;


public class Planeta extends Astro{
    private double distanciaSol;
    private double orbitaSol;
    private boolean tieneSatelites;
    private ArrayList<Satelite> satelites;


    public Planeta (){}


    public Planeta(String nombre, double radio, double rotacionEje, double masa, double temperatura, double gravedad,
                   double distanciaSol, double orbitaSol, boolean tieneSatelites, ArrayList<Satelite> satelites) {
        super(nombre, radio, rotacionEje, masa, temperatura, gravedad);
        this.distanciaSol = distanciaSol;
        this.orbitaSol = orbitaSol;
        this.tieneSatelites = tieneSatelites;
        this.satelites = satelites;
    }


    public Planeta(String nombre, double radio, double rotacionEje, double masa, double temperatura, double gravedad,
                   double distanciaSol, double orbitaSol) {
        super(nombre, radio, rotacionEje, masa, temperatura, gravedad);
        this.distanciaSol = distanciaSol;
        this.orbitaSol = orbitaSol;
        satelites = new ArrayList<>();
    }

    public void addSatelite(Satelite satelite){
        if (satelites == null) satelites = new ArrayList<>();
        satelites.add(satelite);
        setTieneSatelites(true);
    }

    public double getDistanciaSol() {
        return distanciaSol;
    }

    public void setDistanciaSol(double distanciaSol) {
        this.distanciaSol = distanciaSol;
    }

    public double getOrbitaSol() {
        return orbitaSol;
    }

    public void setOrbitaSol(double orbitaSol) {
        this.orbitaSol = orbitaSol;
    }

    public boolean isTieneSatelites() {
        return tieneSatelites;
    }

    public void setTieneSatelites(boolean tieneSatelites) {
        this.tieneSatelites = tieneSatelites;
    }

    public ArrayList<Satelite> getSatelites() {
        return satelites;
    }
    public void setSatelites(ArrayList<Satelite> satelites) {
        this.satelites = satelites;
    }

    @Override
    public void muestra() {
        System.out.println("*** PLANETA " + this.getNombre() + " ***");
        System.out.println("Radio            : " + this.getRadio());
        System.out.println("Rotación eje     : " + this.getRotacionEje());
        System.out.println("Masa:            : " + this.getMasa());
        System.out.println("Temperatura media: " + this.getTemperatura());
        System.out.println("Gravedad         : " + this.getGravedad());
        System.out.println("Distancia al sol : " + this.getDistanciaSol());
        System.out.println("Órbita al sol    : " + this.getOrbitaSol());
        System.out.println("Tiene satélites  : " + this.isTieneSatelites());
        if (isTieneSatelites()) {
            for (int i = 0; i < getSatelites().size(); i++) {
                System.out.println("  - Satélite " + i + ": " + this.getSatelites().get(i).getNombre());
            }
        }
    }
}

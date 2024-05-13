package ProgramacionOrientadaAObjetos.ejercicio8Figuras;

public class Circulo implements IFigura2D{
    private double radio;

    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    @Override
    public double perimetro() {
        return 2*Math.PI*radio;
    }

    @Override
    public double area() {
        return Math.PI*radio*radio;
    }

    @Override
    public void escalar(double escala) {
        radio*=escala;
    }

    @Override
    public void imprimir() {
        System.out.println("Circulo{ radio: " +radio+ ", perimetro: " +perimetro()+ ", area: " +area()+ "}");

    }
}

package ProgramacionOrientadaAObjetos.ejercicio8Figuras;

public class Cuadrado implements IFigura2D {
    private double lado;
    public Cuadrado(){}

    public Cuadrado(double lado){
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public double perimetro() {
        return 4*lado;
    }

    @Override
    public double area() {
        return lado*lado;
    }

    @Override
    public void escalar(double escala) {
        lado*=escala;
    }

    @Override
    public void imprimir() {
        System.out.println("Cuadrado{ lado: " +lado+
                ", perimetro: " +perimetro()+ ", area: "+area()+ "}");
    }
}

package ProgramacionOrientadaAObjetos.ejercicio8Figuras;

public class Triangulo implements IFigura2D{
    private double ancho;
    private double alto;

    public Triangulo() {
    }

    public Triangulo(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    @Override
    public double perimetro() {
        //Me invento esta formula porque no se puede matematicamente con los datos que proporciona a usar el ejercicio
        return (ancho+alto)*3/2;
    }

    @Override
    public double area() {
        return ancho*alto/2;
    }

    @Override
    public void escalar(double escala) {
        ancho *= escala;
        alto *= escala;
    }

    @Override
    public void imprimir() {
        System.out.println("Triangulo{ ancho: " +ancho+ ", alto: " +alto+ ", perimetro: " +perimetro()+ ", area: " +area()+ "}");
    }
}

package ProgramacionOrientadaAObjetos.ejercicio8Figuras;

public class Rectangulo implements IFigura2D {
    private double ancho;
    private double alto;

    public Rectangulo() {
    }

    public Rectangulo(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    public double getAncho() {
        return ancho;
    }

    public double getAlto() {
        return alto;
    }

    @Override
    public double perimetro() {
        return 2*ancho + 2*alto;
    }

    @Override
    public double area() {
        return ancho*alto;
    }

    @Override
    public void escalar(double escala) {
        ancho *= escala;
        alto *= escala;
    }

    @Override
    public void imprimir() {
        System.out.println("Restangulo{ ancho: " +ancho+ ", alto: " +alto+ ", perimetro: " +perimetro()+ ", area: " +area()+ "}");
    }
}

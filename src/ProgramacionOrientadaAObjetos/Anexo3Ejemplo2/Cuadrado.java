package ProgramacionOrientadaAObjetos.Anexo3Ejemplo2;

public class Cuadrado {
    //atributos
    private double x1, x2, y1, y2;

    //metodos
    //constructores

    public Cuadrado(){
    }

    public Cuadrado(double x1, double x2, double y1, double y2){
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }

    //setters and getters


    public double getX1() {
        return x1;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public double getX2() {
        return x2;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public double getY1() {
        return y1;
    }

    public void setY1(double y1) {
        this.y1 = y1;
    }

    public double getY2() {
        return y2;
    }

    public void setY2(double y2) {
        this.y2 = y2;
    }

    //otros metodos

    double caldcularDiagonal(){
        return Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
    }

    double calcularPerimetro(){
        double diagonal = caldcularDiagonal();
        double lado = diagonal/Math.sqrt(2);
        return 4*lado;
    }

    double calcularArea(){
        double diagonal = caldcularDiagonal();
        return 0.5 * diagonal * diagonal;
    }
}

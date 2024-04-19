package ProgramacionOrientadaAObjetos;

public class EjercicioPunto {
    public static void main(String[] args) {
        EjercicioPunto p1 = new EjercicioPunto(3, 4);
        EjercicioPunto p2 = new EjercicioPunto(6, 8);
        System.out.println("P1: (" + p1.getX() + ", " + p1.getY() + ")");
        System.out.println("P2: (" + p2.getX() + ", " + p2.getY() + ")");
        System.out.println("Distancia de P1 al origen: " + p1.distanciaOrigen());
        System.out.println("Distancia de P1 a P2: " + p1.distancia(p2));
        System.out.println("¿Son iguales P1 y P2? " + p1.igual(p2));
        p1.setX(6);
        p1.setY(8);
        System.out.println("P1: (" + p1.getX() + ", " + p1.getY() + ")");
        System.out.println("Distancia de P1 al origen: " + p1.distanciaOrigen());
        System.out.println("Distancia de P1 a P2: " + p1.distancia(p2));
        System.out.println("¿Son iguales P1 y P2? " + p1.igual(p2));
    }
    private double x;
    private double y;

    public EjercicioPunto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public boolean igual(EjercicioPunto otro) {
        return (x == otro.x && y == otro.y);
    }

    public double distanciaOrigen() {
        return Math.sqrt(x * x + y * y);
    }

    public double distancia(EjercicioPunto otro) {
        double dx = x - otro.x;
        double dy = y - otro.y;
        return Math.sqrt(dx * dx + dy * dy);
    }


}

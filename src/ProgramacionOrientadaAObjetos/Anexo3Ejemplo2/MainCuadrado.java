package ProgramacionOrientadaAObjetos.Anexo3Ejemplo2;

public class MainCuadrado {
    public static void main(String[] args) {
        //instaciamos objetos cuadrados
        Cuadrado cuadrado1 = new Cuadrado();
        cuadrado1.setX1(2);
        cuadrado1.setX2(4);
        cuadrado1.setY1(2);
        cuadrado1.setY2(4);
        Cuadrado cuadrado2 = new Cuadrado(1, 5, 1, 5);

        //usamos sus metodos
        double areaC1 = cuadrado1.calcularArea();
        double areaC2 = cuadrado2.calcularArea();
        double perimetroC1 = cuadrado1.calcularPerimetro();
        double perimetroC2 = cuadrado2.calcularPerimetro();
        System.out.println("El perímetro de cuadrado1 es: "+perimetroC1);
        System.out.println("El área de cuadrado1 es: "+areaC1);
        System.out.println("El perímetro de cuadrado2 es: "+perimetroC2);
        System.out.println("El área de cuadrado2 es: "+areaC2);
    }
}

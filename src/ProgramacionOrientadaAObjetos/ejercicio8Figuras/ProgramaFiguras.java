package ProgramacionOrientadaAObjetos.ejercicio8Figuras;

import java.util.ArrayList;

public class ProgramaFiguras {
    public static void main(String[] args) {
        //1. Crea un ArrayList figuras.
        ArrayList<IFigura2D> figuras = new ArrayList<>();
        //2. Añade figuras de varuis tuois.
        //Las creo
        IFigura2D cuadrado = new Cuadrado(2.55);
        Rectangulo rectangulo = new Rectangulo(2, 3);
        Triangulo triangulo = new Triangulo(3, 5);
        IFigura2D circulo = new Circulo(8);
        //Las añado
        figuras.add(cuadrado);
        figuras.add(circulo);
        figuras.add(triangulo);
        figuras.add(rectangulo);
        //De una tacada crear y añadir
        figuras.add(new Circulo(4));

        //3. Muestra la informacion de todas las figuras
        for (IFigura2D figura:figuras){
            figura.imprimir();
        }

        //4. Escala todoas las figuras con escala = 2.
        for (IFigura2D figura:figuras){
            figura.escalar(2);
        }

        //5. Mestra la informacion de todas las figuras
        for (IFigura2D figura:figuras){
            figura.imprimir();
        }

    }
}

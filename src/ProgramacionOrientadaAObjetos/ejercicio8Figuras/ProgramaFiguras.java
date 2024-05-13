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
        System.out.println();
        //4. Escala todoas las figuras con escala = 2.
        for (IFigura2D figura:figuras){
            figura.escalar(2);
        }
        System.out.println();
        //5. Mestra la informacion de todas las figuras
        for (IFigura2D figura:figuras){
            figura.imprimir();
        }
        System.out.println();
        //6. Escala todas las figuras con escala = 09.1
        for (IFigura2D figura:figuras){
            figura.escalar(0.1);
        }
        System.out.println();
        //7. Muestra de nuevo la informacion de todas las figuras
        for (IFigura2D figura:figuras){
            figura.imprimir();
        }
        System.out.println();

        //Llamar a metodos especificos de cada Figura (Cuadrado, circulo etc)
        //Primero despacion con el primer elemento
        IFigura2D i1 = figuras.get(0);
        //Esto no da error porque es un cuadrado lo que meti en la 1º posicion numero0
        //Me referieo a error de ejecucion poruqe auque me equivoque nosalen errores de compilacion
        Cuadrado c =(Cuadrado) i1;
        System.out.println(c.getLado());

        //Esto compila poruqe en tiempo de compilacion no se puede determinar si el elemento 1(el 2ª) es cuadrado o que otro tipo
        //Pero al ejecutar dará una excepcion ClassCastExxception
        //IFigura2D i2 = new Cuadrado(2);
        //Circulo cir = (Circulo) i2;
        //System.out.println(c.getLado());

        //Recorrer el ArrayList correctamente preguntando el tipo de cada uno para poder llamas a metodos especificos que no estane en el IFigura2D
        for (IFigura2D figura:figuras){
            figura.imprimir();
            if (figura instanceof Circulo){
                Circulo cir1 = (Circulo) figura;
                System.out.println("Radio: " +cir1.getRadio());
            } else if (figura instanceof Cuadrado) {
                Cuadrado cuad1 = (Cuadrado) figura;
                System.out.println("Lado: " + cuad1.getLado());
            } else if (figura instanceof  Rectangulo) {
                Rectangulo rec1 = (Rectangulo) figura;
                System.out.println("Base: " + rec1.getAncho());
            }
        }

    }
}
